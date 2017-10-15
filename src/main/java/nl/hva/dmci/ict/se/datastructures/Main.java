/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.hva.dmci.ict.se.datastructures;
public class Main {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Student[] studenten = new Student[32];
		Student test = new Student();

		for (int i = 0; i < studenten.length; i++) {
			long studentnummer = 50080001 + i;
			studenten[i] = new Student(studentnummer, 1);
		}
		for (int i = 0; i < studenten.length; i++) {
			System.out.println(studenten[i].toString());

		}
	}

}
