package nl.hva.dmci.ict.se.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import nl.hva.dmci.ict.se.datastructures.util.Schudder;

public class Main implements RijtjesControle {

	/**
	 * @param args the command line arguments
	 */

	public static final int AANTAL_STUDENTEN = 1000;

	public static Student[] studenten = new Student[AANTAL_STUDENTEN];

	public static void main(String[] args) {

		//Vul de array met studenten met willekeurige cijfers.
		for (int i = 0; i < studenten.length; i++) {
			Random random = new Random();
			long studentnummer = 50080001 + i;
			double cijfer = (random.nextDouble() * 9) + 1;
			studenten[i] = new Student(studentnummer, cijfer);
		}

		//arraylist aanmaken voor de frequentie van de cijfers.
		List frequentie = new ArrayList();
		for (int i = 0; i < AANTAL_STUDENTEN; i++) {
			frequentie.add(0);
		}

		//Print de studenten, en zorg dat de frequentielijst op de juiste positie verhoogd wordt.
		for (int i = 0; i < studenten.length; i++) {
			System.out.println(studenten[i].toString());
			int cijfer = (int) (studenten[i].getCijfer() * 100); //*100 want dan krijg je hele getallen
			// je cast het naar een int en tel 1 op om iedere keer het aantal op te hogen
			frequentie.set(cijfer, (int) frequentie.get(cijfer) + 1);
		}

		//schud de studenten
		Schudder.schud(studenten);

		//maak een nieuwe array aan waarin de gesorteerde array komt te staan
		Student[] sorted = new Student[studenten.length];

		//Vul de array met gesorteerde waarden.
		sorted = selectionSort(studenten);

		//Print de gesorteerde array
		System.out.println("		###SORTED###");
		System.out.println("		###SORTED###");
		System.out.println("		###SORTED###");
		for (int i = 0; i < frequentie.size(); i++) {
			System.out.println(i + " " + sorted[i]);
		}


		//TODO, Impement de code
		RijtjesControle checker = new RijtjesControle() {
			@Override
			public <T extends Comparable<T>> boolean isDalend(List<T> rijtje) {
				throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
			}

			@Override
			public <T extends Comparable<T>> boolean isStijgend(List<T> rijtje) {
				throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
			}

			@Override
			public <T extends Comparable<T>> boolean isGelijk(List<T> rijtje) {
				throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
			}
		};

		//TODO, fix deze shit
		System.out.println("Stijgend gesorteerd" + checker.isStijgend(Arrays.asList(studenten)));
		if (checker.isStijgend(Arrays.asList(studenten))) {
			System.out.println("stijgend");
		} else {
			System.out.println("niet stijgend");
		}

	}

	//Dit is het selectionsort algoritme
	public static Student[] selectionSort(Student[] studenten) {

		for (int i = 0; i < studenten.length; i++) {
			int min = i;
			for (int j = i + 1; j < studenten.length; j++) {
				if ((studenten[j].compareTo(studenten[min])) < 1) {
					min = j;
				}
			}

			// (c.compare(studenten[j], studenten[min])
			//verwissel waarden
			Student temp = studenten[i];
			studenten[i] = studenten[min];
			studenten[min] = temp;

		}
		return studenten;
	}



	//help
	@Override
	public <T extends Comparable<T>> boolean isDalend(List<T> rijtje) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	//wats deze
	@Override
	public <T extends Comparable<T>> boolean isStijgend(List<T> rijtje) {
		if (rijtje != null) {
			for (int i = 0; i < studenten.length; i++) {
			}
			if (rijtje.size() > 1) {
				int vergelijking = rijtje.get(1).compareTo(rijtje.get(0));
				if (vergelijking <= 0) {
					return false;
				}
				rijtje.remove(0);
				return isStijgend(rijtje);
			}
		}
		return false;
	}


	//halp
	@Override
	public <T extends Comparable<T>> boolean isGelijk(List<T> rijtje) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

}
