package com.vektorel.javaexamples.ders3;

import java.util.Scanner;

public class DersOrnegiK {

	public static void main(String[] args) {
		System.out.println("Yarýçap veya Kenar Giriniz");
		Scanner scanner=new Scanner(System.in);
		int kenar = scanner.nextInt();

		DersOrnegiK instance =new DersOrnegiK();
		double x = instance.cemberCevreHesaplama(kenar);
		
		System.out.println("Kenarý " + kenar + " olan karenin çevresi " +  (kenar*4));
		System.out.println("Kenarý " + kenar + " olan karenin alaný " + (kenar*kenar));
		System.out.println("Yarýçapý " + kenar + " olan çemberin çevresi " + x);
		System.out.println("Yarýçapý " + kenar + " olan çemberin alaný " + instance.cemberAlanHesaplama(kenar));
	}
	
	private double cemberCevreHesaplama(int yaricap) {
		return yaricap * Math.PI *2;
	}
	
	private double cemberAlanHesaplama(int yaricap) {
		return yaricap * yaricap * Math.PI ;
	}
	
}
