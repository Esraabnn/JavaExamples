package com.vektorel.javaexamples.ders3;

import java.util.Scanner;

public class DersOrnegiK {

	public static void main(String[] args) {
		System.out.println("Yar��ap veya Kenar Giriniz");
		Scanner scanner=new Scanner(System.in);
		int kenar = scanner.nextInt();

		DersOrnegiK instance =new DersOrnegiK();
		double x = instance.cemberCevreHesaplama(kenar);
		
		System.out.println("Kenar� " + kenar + " olan karenin �evresi " +  (kenar*4));
		System.out.println("Kenar� " + kenar + " olan karenin alan� " + (kenar*kenar));
		System.out.println("Yar��ap� " + kenar + " olan �emberin �evresi " + x);
		System.out.println("Yar��ap� " + kenar + " olan �emberin alan� " + instance.cemberAlanHesaplama(kenar));
	}
	
	private double cemberCevreHesaplama(int yaricap) {
		return yaricap * Math.PI *2;
	}
	
	private double cemberAlanHesaplama(int yaricap) {
		return yaricap * yaricap * Math.PI ;
	}
	
}
