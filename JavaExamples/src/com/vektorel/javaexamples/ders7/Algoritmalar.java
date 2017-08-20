package com.vektorel.javaexamples.ders7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Algoritmalar {

	public static void main(String[] args) {
		Algoritmalar algoritmalar = new Algoritmalar();
		algoritmalar.alg16();
	}

	public void alg1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kaç ortalama alacaksýn:");
		int sayiAdedi = scanner.nextInt();

		List<Integer> integers = new ArrayList<>();
		for (int i = 0; i < sayiAdedi; i++) {
			System.out.println("Giriþ:");
			integers.add(scanner.nextInt());
		}

		int toplam = 0;
		for (Integer t : integers) {
			toplam = toplam + t;
		}

		System.out.println("Sonuc : " + (toplam / sayiAdedi));
	}

	public void alg2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kaç sayý gireceksin:");
		int sayiAdedi = scanner.nextInt();

		List<Integer> integers = new ArrayList<>();
		for (int i = 0; i < sayiAdedi; i++) {
			System.out.println("Giriþ:");
			integers.add(scanner.nextInt());
		}

		integers.sort(null);

		System.out.println("En küçük : " + integers.get(0));
		System.out.println("En büyük : " + integers.get(sayiAdedi - 1));
	}

	public void alg3() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kaç sayý gireceksin:");
		List<Integer> liste = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			System.out.println("Sayý Giriniz:");
			liste.add(scanner.nextInt());
		}

		int sayac = 0;
		for (Integer deger : liste) {
			if (deger > 10) {
				sayac++;
			}
		}

		System.out.println(sayac + " tane 10 dan büyük eleman girdiniz.");
	}

	public void alg4() {
		Scanner scanner = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		int sayi = 1;
		while (sayi != 0) {
			System.out.println("Sayý gir:");
			sayi = scanner.nextInt();
			if (sayi != 0)
				list.add(sayi);
		}

		for (Integer deger : list) {
			System.out.println(deger * 2);
		}
	}

	public void alg5() {

		List<Integer> list = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < 30; i++) {
			int uretilen = random.nextInt(5);
			uretilen += 10;
			list.add(uretilen);
		}
		int sayac = 0;
		for (Integer deger : list) {
			if (deger >= 13 && deger <= 15) {
				sayac++;
			}
			System.out.print(" " + deger);
		}

		System.out.println("\n" + sayac);

	}

	public void alg6() {

		List<Integer> list = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < 30; i++) {
			int uretilen = random.nextInt(5);
			uretilen += 10;
			list.add(uretilen);
		}
		int sayac13 = 0;
		int sayac14 = 0;
		for (Integer deger : list) {
			if (deger == 13) {
				sayac13++;
			}
			if (deger == 14) {
				sayac14++;
			}
			System.out.print(" " + deger);
		}

		System.out.println("\n 13 : " + sayac13);
		System.out.println("\n 14 : " + sayac14);

	}

	public void alg7() {
		List<Integer> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("5 Adet Sayý Giriniz:");

		for (int i = 0; i < 5; i++) {
			int sayi = scanner.nextInt();
			list.add(sayi * sayi);
		}

		for (Integer deger : list) {
			System.out.println(deger);
		}
	}

	public void alg8() {
		List<Integer> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Vize1 Giriniz:");
		int vize1 = scanner.nextInt();
		System.out.println("Vize2 Giriniz:");
		int vize2 = scanner.nextInt();
		System.out.println("Final Giriniz:");
		int fnl = scanner.nextInt();

		System.out.println("Not Ortalamasý :" + ((vize1 * 0.3) + (vize2 * 0.3) + (fnl * 0.4)));
	}

	public void alg9() {
		List<Integer> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("1 Adet Sayý Giriniz:");
		int sayi = scanner.nextInt();
		System.out.println("10 Adet Sayý Giriniz:");

		for (int i = 0; i < 10; i++) {
			list.add(sayi * scanner.nextInt());
		}

		for (Integer deger : list) {
			System.out.println(deger);
		}
	}

	public void alg10() {
		List<Double> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("10 Adet Sayý Giriniz:");

		for (int i = 0; i < 10; i++) {
			list.add(scanner.nextDouble());
		}

		for (Double deger : list) {
			if (deger > 5)
				System.out.println("5 ten büyük , Yarýsý : " + (deger / 2));
			else
				System.out.println("5 ten küçük , Ýki Katý : " + (deger * 2));
		}
	}

	public void alg11() {
		List<Double> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("5 Adet Sayý Giriniz:");

		for (int i = 0; i < 5; i++) {
			list.add(scanner.nextDouble());
		}

		double sonuc = 0;
		for (Double deger : list) {
			if (deger > 50) {
				sonuc += deger / 50;
			} else {
				sonuc += deger * 3 / 100;
			}
		}

		System.out.println(sonuc);
	}

	public void alg12() {
		List<Double> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("5 Adet Yarýçap Giriniz:");

		for (int i = 0; i < 5; i++) {
			list.add(scanner.nextDouble());
		}

		for (Double yaricap : list) {
			System.out.println("Yarýçapý " + yaricap + " olan çemberin alaný :" + (yaricap * yaricap * Math.PI));
			System.out.println("Yarýçapý " + yaricap + " olan çemberin çevre :" + (yaricap * 2 * Math.PI));
			System.out.println();
		}
	}

	public void alg13() {
		List<Integer> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kaç Adet Not girmek istiyorsun :");
		int n = scanner.nextInt();
		System.out.println("Notlarý gir:");
		for (int i = 0; i < n; i++) {
			list.add(scanner.nextInt());
		}

		list.sort(null);
		System.out.println("En Küçük :" + list.get(0));
		System.out.println("En Büyük :" + list.get(n - 1));
	}

	public void alg14() {
		for (int i = 0; i < 24; i++) {
			for (int j = 0; j < 60; j++) {
				for (int j2 = 0; j2 < 60; j2++) {
					System.out.println(i + ":" + j + ":" + j2);
				}
			}
		}
	}

	public void alg15() {

	}

	public void alg16() {
		Scanner scanner = new Scanner(System.in);
		while (true) {		
			System.out.println("Ay numarasý giriniz :");
			int n = scanner.nextInt();
	
			switch (n) {
				case 1: System.out.println("Ocak"); break;
				case 2: System.out.println("Þubat"); break;
				case 3: System.out.println("Mart"); break;
				case 4: System.out.println("Nisan"); break;
				case 5: System.out.println("Mayýs"); break;
				case 6: System.out.println("Haziran"); break;
				case 7: System.out.println("Temmuz"); break;
				case 8: System.out.println("Aðustos"); break;
				case 9: System.out.println("Eylül"); break;
				case 10: System.out.println("Ekim"); break;
				case 11: System.out.println("Kasým"); break;
				case 12: System.out.println("Aralýk"); break;
				default :System.out.println("Hata");break;
			}
		}
	}
}























/**
 * 26xED28YN454EN4Mzz9iVNjH6a6NR2SameAMw556x3QBWVLfP6EotzBPTDV12mc4Pw6Ep1zJeFPmY6Gz1yorvVsAPM3LaNW
*/