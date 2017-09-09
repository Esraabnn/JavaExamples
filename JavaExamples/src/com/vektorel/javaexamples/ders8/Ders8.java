package com.vektorel.javaexamples.ders8;

import com.vektorel.javaexamples.ders6.Ders6;

/**
 * Constructor
 * 
 * @author vektorel
 *
 */
public class Ders8 {
	Ders6 ders6;
	
	public Ders8() {
		ders6 = new Ders6();
		System.out.println("Parametresiz Constructor");
	}

	public Ders8(int yas) {
		System.out.println("Sayý Alan Constructor");
	}

	public Ders8(String ad) {
		System.out.println("String Alan Constructor");
	}
	
	public void hesapla() {
		ders6.diziOrnekPublic();
	}
}
