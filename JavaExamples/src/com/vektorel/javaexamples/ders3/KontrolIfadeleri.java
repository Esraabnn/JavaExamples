package com.vektorel.javaexamples.ders3;

import java.util.Scanner;

public class KontrolIfadeleri {

	public static void main(String[] args) {
		
		System.out.println("Deger Gir:");
		Scanner scanner =new Scanner(System.in);
		int degisken = scanner.nextInt();
	}
	
	public void basitIfYapisi(int degisken) {
		if (degisken >30) {
			System.out.println("30 dan B�y�k");
		}else{
			System.out.println("30 dan K���k");			
		}
	}
	
	public void yasKontrolu(int yas) {
		if(yas>0 && yas<18){
			System.out.println("�ocuk");
		}else if(yas>=18 && yas<30){
			System.out.println("Gen�");
		}else if(yas>=30 && yas<45){
			System.out.println("Orta");
		}else if(yas>=45 && yas<100){
			System.out.println("Ya�l�");
		}else{
			System.out.println("Yanl�� Giri�");
		}
	}
	
	
	
	
	
}












