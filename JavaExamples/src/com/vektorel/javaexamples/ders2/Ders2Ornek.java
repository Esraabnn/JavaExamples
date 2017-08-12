package com.vektorel.javaexamples.ders2;

import java.util.Scanner;

public class Ders2Ornek {

	public  void ornekBirMethod() {
		int sayi1 = 2;

		int sayi2 = 45;

		System.out.println(sayi1 + sayi2);

		sayi1 = (sayi1 + sayi2) * (sayi2 - sayi1) / sayi2;
		System.out.println(sayi1);

		sayi1 = sayi1 + (sayi2 * sayi2) - (sayi1 / sayi2);
		System.out.println(sayi1);
	}

	public void ornekMethod2() {
		// Ben burada bir toplama Yaptým
		int sayi1 = 25;

		int sayi2 = 45;

		int sonucToplam = sayi1 + sayi2;
		int sonucFark = sayi1 - sayi2;
		int sonucCarpim = sayi1 * sayi2;
		int sonucBolum = sayi1 / sayi2;

		System.out.println("sonucToplam : " + sonucToplam);
		System.out.println("sonucFark : " + sonucFark);
		System.out.println("sonucCarpim : " + sonucCarpim);
		System.out.println("sonucBolum: " + sonucBolum);
	}

	public void parametreliMethod(int sayi1, int sayi2) {
		System.out.println("sonucToplam : " + (sayi1 + sayi2));
		System.out.println("sonucFark : " + (sayi1 - sayi2));
		System.out.println("sonucCarpim : " + sayi1 * sayi2);
		System.out.println("sonucBolum: " + sayi1 / sayi2);
	}

	public void islevselMethod() {
		Scanner scanner = new Scanner(System.in);
		String mesaj = "Sayý giriniz :";
		
		System.out.println(mesaj);
		int sayi1 = scanner.nextInt();

		System.out.println(mesaj);
		int sayi2 = scanner.nextInt();
		
		parametreliMethod(sayi1, sayi2);
		
	}
}