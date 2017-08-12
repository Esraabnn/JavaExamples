package com.vektorel.javaexamples.ders4;

import java.util.Random;
import java.util.Scanner;


public class SayiTahminOyunu {

	public static void main(String[] args) {
		SayiTahminOyunu oyunu=new SayiTahminOyunu();
		oyunu.sayiTahminOyunuPuanl�();
		
	}
	
	private void sayiTahminOyunu() {
		Random rand=new Random();
		int sayi = rand.nextInt(100);
		Scanner scanner=new Scanner(System.in);
		int girilenDeger=0;
		
		for (int i = 0; (girilenDeger!=sayi); i++) {
			System.out.println("Tahmin giriniz:");
			girilenDeger = scanner.nextInt();
			
			if(girilenDeger==sayi){
				System.out.println("Tebrikler Buldunuz...");
			}else if(girilenDeger<sayi){
				System.out.println("Daha B�y�k bir De�er giriniz");
			}else{
				System.out.println("Daha K���k bir De�er giriniz");
			}
		}
	}
		
	private void sayiTahminOyunuPuanl�() {
		Random rand=new Random();
		int sayi = rand.nextInt(100);
		Scanner scanner=new Scanner(System.in);
		int girilenDeger=0;
		int sayac=0;
		for (int i = 0; (girilenDeger!=sayi); i++) {
			System.out.println("Tahmin giriniz:");
			girilenDeger = scanner.nextInt();
			sayac++;
			if(girilenDeger==sayi){
				System.out.println("Tebrikler Buldunuz...");
			}else if(girilenDeger<sayi){
				System.out.println("Daha B�y�k bir De�er giriniz");
			}else{
				System.out.println("Daha K���k bir De�er giriniz");
			}
		}
		
		if(sayac==1)
			System.out.println("100 PUAN");
		else if(sayac==2)
			System.out.println("50 PUAN");
		else if(sayac==3)
			System.out.println("25 PUAN");
		else if(sayac==4)
			System.out.println("12 PUAN");
		else
			System.out.println("12 PUAN");
	}
}
