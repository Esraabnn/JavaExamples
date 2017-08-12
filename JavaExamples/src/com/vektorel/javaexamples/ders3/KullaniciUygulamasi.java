package com.vektorel.javaexamples.ders3;

import java.util.Scanner;

public class KullaniciUygulamasi {

	static Scanner scanner=new Scanner(System.in);
	
	public static void main(String[] args) {

		System.out.println("Hoþgeldiniz....");		
		System.out.println("Kullanýcý Adýnýzý Giriniz:");
		String kullaniciAdi = scanner.nextLine();
		
		System.out.println("Þifrenizi Giriniz:");
		String kullaniciSifre = scanner.nextLine();
		KullaniciUygulamasi inst=new KullaniciUygulamasi();
		
		if(kullaniciAdi.equals("a") && kullaniciSifre.equals("a")){
			inst.adminMetoduCalissin();
		}else if(kullaniciAdi.equals("u")&& kullaniciSifre.equals("u")){
			inst.userMetoduCalissin();
		}else{
			System.out.println("Kullanýcý Adý veya Þifre Hatalý");
		}
		
	}
	
	private void adminMetoduCalissin() {
		System.out.println("Hoþgeldin Admin...");
		System.out.println("------------------Menü------------------");
		System.out.println("a) Toplama Yapmak için 1 giriniz. \nb) Çýkarma Yapmak için 2 giriniz.\nc) Çarpma Yapmak için 3 giriniz.\nd) Çýkýþ için 4 giriniz");
		
		int giris = scanner.nextInt();
		if(giris==4){
			System.exit(0);
		}		
		System.out.println("Birinci Sayý:");
		int sayi1 = scanner.nextInt();
		System.out.println("Ýkinci Sayý:");
		int sayi2 = scanner.nextInt();
		
		if(giris==1){
			System.out.println("Sonuç:"+(sayi1+sayi2));
		}else if(giris==2){
			System.out.println("Sonuç:"+(sayi1-sayi2));
		}else if(giris==3){
			System.out.println("Sonuç:"+(sayi1*sayi2));
		}
	}
	
	private void userMetoduCalissin(){
		System.out.println("Hoþgeldin User...");
		System.out.println("------------------Menü------------------");
		System.out.println("a) Kare Çevresi Hesaplamak için 1 giriniz. \nb) Kare Alaný Hesaplamak için 2 giriniz.\nc) Çember Alaný Hesaplamak  için 3 giriniz.\nd) Çýkýþ için 4 giriniz");
		int giris = scanner.nextInt();
		
		if(giris==4){
			System.exit(0);
		}
		
		System.out.println("Kenar veya Yarýçap Giriniz:");
		int sayi1 = scanner.nextInt();
		
		if(giris==1){
			System.out.println("Kare Çevresi:"+(sayi1*4));
		}else if(giris==2){
			System.out.println("Kare Alaný:"+(sayi1*sayi1));
		}else if(giris==3){
			System.out.println("Çember Alaný:"+(sayi1*Math.PI*sayi1));
		}
	}

}
