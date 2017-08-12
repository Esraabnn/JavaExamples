package com.vektorel.javaexamples.ders3;

import java.util.Scanner;

public class KullaniciUygulamasi {

	static Scanner scanner=new Scanner(System.in);
	
	public static void main(String[] args) {

		System.out.println("Ho�geldiniz....");		
		System.out.println("Kullan�c� Ad�n�z� Giriniz:");
		String kullaniciAdi = scanner.nextLine();
		
		System.out.println("�ifrenizi Giriniz:");
		String kullaniciSifre = scanner.nextLine();
		KullaniciUygulamasi inst=new KullaniciUygulamasi();
		
		if(kullaniciAdi.equals("a") && kullaniciSifre.equals("a")){
			inst.adminMetoduCalissin();
		}else if(kullaniciAdi.equals("u")&& kullaniciSifre.equals("u")){
			inst.userMetoduCalissin();
		}else{
			System.out.println("Kullan�c� Ad� veya �ifre Hatal�");
		}
		
	}
	
	private void adminMetoduCalissin() {
		System.out.println("Ho�geldin Admin...");
		System.out.println("------------------Men�------------------");
		System.out.println("a) Toplama Yapmak i�in 1 giriniz. \nb) ��karma Yapmak i�in 2 giriniz.\nc) �arpma Yapmak i�in 3 giriniz.\nd) ��k�� i�in 4 giriniz");
		
		int giris = scanner.nextInt();
		if(giris==4){
			System.exit(0);
		}		
		System.out.println("Birinci Say�:");
		int sayi1 = scanner.nextInt();
		System.out.println("�kinci Say�:");
		int sayi2 = scanner.nextInt();
		
		if(giris==1){
			System.out.println("Sonu�:"+(sayi1+sayi2));
		}else if(giris==2){
			System.out.println("Sonu�:"+(sayi1-sayi2));
		}else if(giris==3){
			System.out.println("Sonu�:"+(sayi1*sayi2));
		}
	}
	
	private void userMetoduCalissin(){
		System.out.println("Ho�geldin User...");
		System.out.println("------------------Men�------------------");
		System.out.println("a) Kare �evresi Hesaplamak i�in 1 giriniz. \nb) Kare Alan� Hesaplamak i�in 2 giriniz.\nc) �ember Alan� Hesaplamak  i�in 3 giriniz.\nd) ��k�� i�in 4 giriniz");
		int giris = scanner.nextInt();
		
		if(giris==4){
			System.exit(0);
		}
		
		System.out.println("Kenar veya Yar��ap Giriniz:");
		int sayi1 = scanner.nextInt();
		
		if(giris==1){
			System.out.println("Kare �evresi:"+(sayi1*4));
		}else if(giris==2){
			System.out.println("Kare Alan�:"+(sayi1*sayi1));
		}else if(giris==3){
			System.out.println("�ember Alan�:"+(sayi1*Math.PI*sayi1));
		}
	}

}
