package com.vektorel.javaexamples.ders7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Algoritmalar {
	
	public static void main(String[] args) {
		Algoritmalar algoritmalar=new  Algoritmalar();
		algoritmalar.alg6();
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
		
		int toplam=0;
		for (Integer t : integers) {
			toplam=toplam+t;
		}
		
		System.out.println("Sonuc : " + (toplam/sayiAdedi));
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
		System.out.println("En büyük : " + integers.get(sayiAdedi-1));
	}
	
	public void alg3() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kaç sayý gireceksin:");
		List<Integer> liste =new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Sayý Giriniz:");
			liste.add(scanner.nextInt());
		}
		
		int sayac=0;
		for (Integer deger : liste) {
			if(deger>10){
				sayac++;
			}
		}
		
		System.out.println(sayac +" tane 10 dan büyük eleman girdiniz.");
	}
	
	public void alg4() {
		Scanner scanner=new Scanner(System.in);
		List<Integer> list=new ArrayList<>();
		int sayi=1;
		while (sayi != 0) {			
			System.out.println("Sayý gir:");
			sayi = scanner.nextInt();
			if(sayi!=0)
				list.add(sayi);
		}
		
		for (Integer deger : list) {
			System.out.println(deger*2);
		}		
	}
	
	public void alg5() {

		List<Integer> list=new ArrayList<>();
		Random random =new Random();
		for (int i = 0; i < 30; i++) {
			int uretilen = random.nextInt(5);
			uretilen+=10;
			list.add(uretilen);
		}
		int sayac=0;
		for (Integer deger : list) {
			if(deger>=13 && deger<= 15){
				sayac++;
			}
			System.out.print(" " + deger);
		}
		
		
		System.out.println("\n"+sayac);

	}
	
	public void alg6() {

		List<Integer> list=new ArrayList<>();
		Random random =new Random();
		for (int i = 0; i < 30; i++) {
			int uretilen = random.nextInt(5);
			uretilen+=10;
			list.add(uretilen);
		}
		int sayac13=0;
		int sayac14=0;
		for (Integer deger : list) {
			if(deger==13){
				sayac13++;
			}
			if(deger==14){
				sayac14++;
			}
			System.out.print(" " + deger);
		}
				
		System.out.println("\n 13 : "+sayac13);
		System.out.println("\n 14 : "+sayac14);

	}
}
