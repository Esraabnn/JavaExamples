package com.vektorel.javaexamples.ders7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Listeler {

	public static void main(String[] args) {
		Listeler listeler=new Listeler();
		listeler.ornek();
	}
	
	
	public void listeMetodu() {
		List<String> strListe=new ArrayList<>();
		
		strListe.add("Ahmet");
		strListe.add("Mehmet");
		
		System.out.println(strListe.get(1));
		
		System.out.println(strListe.indexOf("Ahmet"));

		strListe.add("Cemal");
		
		for (int i = 0; i < strListe.size(); i++) {
			System.out.println(strListe.get(i));	
		}
		
		//Foraech
		for (String eleman : strListe) {
			System.out.println(eleman);	
		}
	}
	
	private void listeSiralama() {
		List<Integer> liste=new ArrayList<>();
		liste.add(45);
		liste.add(17);
		liste.add(52);
		liste.add(5);
		
		liste.sort(null);
		
		for (Integer sayi : liste) {
			System.out.println(sayi);
		}
		
		
		System.out.println(liste.get(liste.size()-2));
		
		System.out.println("Test");
	}
	
	
	// 1 4 9 25 36 .... 963
	public void kareListe() {

		List<Integer> liste=new ArrayList<>();
		
		int i=1;
		
		while ((i*i)<2000) {
			liste.add(i*i);
			i++;
		}
		
		for (Integer sayi : liste) {
			System.out.println(sayi);
		}

	}
	
	
	// Bu örneðimizdeki amaç, dýþarýdan girilen bir sayýnýn, 
	// kendisi ile kaç kez çarpýldýðýnda 1000 deðerinin altýnda olduðunu bulunuz.
	
	private void ornek() {
		Scanner girdi = new Scanner(System.in);
		 
		int carpim=1, sayac=0;
	 
		System.out.println("Bir sayý giriniz: ");
		int girilen = girdi.nextInt();
	 
		while((carpim*girilen) <1000 ){
			carpim=carpim*girilen;	 
			sayac++;
		}
	 
		System.out.println("Bulunan deðer: "+carpim);
		System.out.println("Kendisiyle çarpýlan adet: "+sayac);
	}
}










