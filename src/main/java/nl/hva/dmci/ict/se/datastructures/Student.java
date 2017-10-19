package nl.hva.dmci.ict.se.datastructures;

import java.text.DecimalFormat;

/**
 *
 * @author jacco en yasmin en wyomi
 */
public class Student {

    private long studentnummer;
    private double cijfer;

    public Student(long studentnummer, double cijfer) {
        this.studentnummer = studentnummer;
        this.cijfer = cijfer;
    }

    public Student() {
        this.studentnummer = 0;
        this.cijfer = 0;
    }

    public long getStudentnummer() {
        return studentnummer;
    }

    public void setStudentnummer(long studentnummer) {
        this.studentnummer = studentnummer;
    }

    public double getCijfer() {
        return cijfer;
    }

    public void setCijfer(double cijfer) {
        this.cijfer = cijfer;
    }

    @Override
    public String toString() {
        String formatcijfer;
        DecimalFormat df = new DecimalFormat("#.00");
        formatcijfer = df.format(cijfer);
        return "Student{" + "studentnummer=" + studentnummer + ", cijfer=" + formatcijfer + '}';
    }

    /**
     *
     * @param o StudentObject
     * @return Returns 1 if given student has a higher grade. Returns -1 if
     * given student has a lower grade
     */
    
    public int compareTo(Student o) {
        if (this.getCijfer() < o.getCijfer()) {
            return -1;
        } else if (this.getCijfer() == o.getCijfer()) {
            if (this.getStudentnummer() > o.getStudentnummer()) {
                return 0;
            }
        }
        return 1;
    }
}