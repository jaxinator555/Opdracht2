package nl.hva.dmci.ict.se.datastructures;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import nl.hva.dmci.ict.se.datastructures.util.Schudder;

public class Main implements RijtjesControle {

    /**
     * @param args the command line arguments
     */
    public static Student[] studenten = new Student[1000];

    public static void main(String[] args) {
        Student test = new Student();

        for (int i = 0; i < studenten.length; i++) {
            Random random = new Random();
            long studentnummer = 50080001 + i;
            double cijfer = (random.nextDouble() * 9) + 1;
            studenten[i] = new Student(studentnummer, cijfer);
        }

        List frequentie = new ArrayList();
        for (int i = 0; i <= 1000; i++) {
            frequentie.add(0);
        }

        for (int i = 0; i < studenten.length; i++) {
            System.out.println(studenten[i].toString());
            int cijfer = (int) (studenten[i].getCijfer() * 100); //*100 want dan krijg je hele getallen
            // je cast het naar een int en tel 1 op om iedere keer het aantal op te hogen
            frequentie.set(cijfer, (int) frequentie.get(cijfer) + 1);
        }

        Schudder.schud(studenten);
        selectionSort(studenten);

        for (int i = 0; i < frequentie.size(); i++) {
            System.out.println(i + " " + frequentie.get(i));
        }

        RijtjesControle checker = new Rijtjes();
        System.out.println("Stijgend gesorteerd" + checker.isStijgend(Arrays.asList(studenten)));
        if (checker.isStijgend(Arrays.asList(studenten))) {
            System.out.println("stijgend");
        } else {
            System.out.println("niet stijgend");
        }

    }

    public static void selectionSort(Student[] studenten) {

        for (int i = 0; i < studenten.length; i++) {
            int min = i;
            for (int j = i + 1; j < studenten.length; j++) {
                if ((studenten[j].compareTo(studenten[min])) < -1) {
                    min = j;
                }
            }

            // (c.compare(studenten[j], studenten[min])
            //verwissel waarden
            Student temp = studenten[i];
            studenten[i] = studenten[min];
            studenten[min] = temp;
        }
    }

    @Override
    public <T extends Comparable<T>> boolean isDalend(List<T> rijtje) {
        return false;
    }

    @Override
    public <T extends Comparable<T>> boolean isStijgend(List<T> rijtje, int n) {
        if (rijtje != null) {
            for (int i = 0; i < studenten.length; i++) {
            }
            if (rijtje.size() > 1) {
                int vergelijking = rijtje.get(1).compareTo(rijtje.get(0));
                if (vergelijking <= 0) {
                    return false;
                }
                rijtje.remove(0);
                return isStijgend(rijtje, 1);
            }
        }
        return false;
    }

    @Override
    public <T extends Comparable<T>> boolean isGelijk(List<T> rijtje) {
        return false;
    }
}
