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
			System.out.println("30 dan Büyük");
		}else{
			System.out.println("30 dan Küçük");			
		}
	}
	
	public void yasKontrolu(int yas) {
		if(yas>0 && yas<18){
			System.out.println("Çocuk");
		}else if(yas>=18 && yas<30){
			System.out.println("Genç");
		}else if(yas>=30 && yas<45){
			System.out.println("Orta");
		}else if(yas>=45 && yas<100){
			System.out.println("Yaşlı");
		}else{
			System.out.println("Yanlış Giriş");
		}
	}
	
	
	
	
	
}












