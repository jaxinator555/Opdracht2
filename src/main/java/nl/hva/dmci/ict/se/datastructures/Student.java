/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.hva.dmci.ict.se.datastructures;

import java.text.DecimalFormat;

/**
 *
 * @author jacco en yasmin
 */

public class Student {

	private long studentnummer;
	private double cijfer;


	
	public Student(long studentnummer, double cijfer){
		this.studentnummer = studentnummer;
		this.cijfer = cijfer;
	}
	public Student(){
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

	

}
