/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.hva.dmci.ict.se.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Student[] studenten = new Student[10000];
		Student test = new Student();

		for (int i = 0; i < studenten.length; i++) {
			Random random  = new Random();
			long studentnummer = 50080001 + i;
			double cijfer = (random.nextDouble() * 9) + 1;
			studenten[i] = new Student(studentnummer, cijfer);
		}

		List frequentie = new ArrayList();
		for (int i = 0; i < 1000; i++) {
			frequentie.add(0);
		}
		frequentie.set(1,4);
//		frequentie.add(0, );
		for (int i = 0; i < studenten.length; i++) {
			System.out.println(studenten[i].toString());
			int cijfer = (int) (studenten[i].getCijfer()*100);
			frequentie.set(cijfer, (int) frequentie.get(cijfer) + 1);
			
		}
		for (int i = 0; i < frequentie.size(); i++) {
			System.out.println(i +" "+  frequentie.get(i));

		}
	}

}
