package com.vektorel.javaexamples.ders5;

import java.util.Scanner;

public class DiziOrnek {

	public static void main(String[] args) {
		
		DiziOrnek diziOrnek = new DiziOrnek();
		diziOrnek.enBuyukIkinciSayi();
	}

	private void kelimeBulma() {

		String[][] kelimeler = new String[][] { { "Pencil", "Kalem" }, { "Glass", "Cam" }, { "School", "Okul" },
				{ "Space", "Uzay" }, { "Computer", "Bilgisayar" } };

		Scanner scanner = new Scanner(System.in);
		int puan = 0;

		for (int i = 0; i < kelimeler.length; i++) {
			for (int j = 0; j < 2; j--) {
				System.out.println(kelimeler[i][0] + " Kelimesinin Türkçesini giriniz");

				String girilenMetin = scanner.nextLine();

				if (girilenMetin.equalsIgnoreCase(kelimeler[i][1])) {
					puan = puan + i + 1;
					j = 100;
					// break;
				}
			}

		}

		System.out.println("Tebrikler puanýnýz :" + puan);
	}

	private void enBuyukSayiyiBulan() {
		int[] dizi = new int[] { 34, 25, 13, 256, 234, 3, 45, 67,789 };
		
		int enBuyuk=dizi[0]; 
		for (int i = 1; i < dizi.length; i++) {
			if(enBuyuk<dizi[i]){
				enBuyuk=dizi[i];
			}
		}
		
		System.out.println(enBuyuk);
		
	}
	
	private void enBuyukSayiyiBulanShortIf() {
		int[] dizi = new int[] { 34, 25, 13, 256, 234, 3, 45, 67,789 };
		
		int enBuyuk=dizi[0]; 
		for (int i = 1; i < dizi.length; i++) {			
			enBuyuk = enBuyuk<dizi[i] ? dizi[i] : enBuyuk;  
		}
		System.out.println(enBuyuk);
	}
	
	private void charDizisiOrnek() {

		String ad="Metin";
		char[] charDizisi =ad.toCharArray();
		
		System.out.println(charDizisi[0]);
		
	}

	private void enBuyukIkinciSayi() {
		int[] dizi = new int[] { 34, 25, 13, 256, 234, 3, 45, 67,789 };
		int enBuyuk=dizi[0];
		int ikinciBuyuk=dizi[0];
		
		for (int i = 1; i < dizi.length; i++) {
			if(enBuyuk<dizi[i]){
				enBuyuk=dizi[i];
			}
			//TODO sonra yap
			if(ikinciBuyuk<dizi[i] && ikinciBuyuk!=enBuyuk){
				ikinciBuyuk=dizi[i];
			}
		}		
		System.out.println(ikinciBuyuk);
	}
}




