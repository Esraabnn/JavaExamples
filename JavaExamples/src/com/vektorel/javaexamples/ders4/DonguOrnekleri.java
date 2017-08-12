package com.vektorel.javaexamples.ders4;

public class DonguOrnekleri {

	public static void main(String[] args) {
	
		DonguOrnekleri donguOrnekleri=new DonguOrnekleri();
		donguOrnekleri.basitOrnek();
	}
	
	public void basitDonguOrnegi() {
	
		for (int i = 0; i < 20; i++) {
			System.out.println("Mesaj");
		}
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		int sonuc=0;
		
		for (int i = 45; i < 90; i++) {
		sonuc=sonuc+i;	
		}
		System.out.println(sonuc);

		
		
		for (int i = 2; i < 101; i=i+2) {
			System.out.println(i);
		}
	}
	
	public void ciftSayiTopl() {
		int toplam =0;
		for (int i = 2; i < 101; i=i+2) {
			toplam=toplam+i;
		}
		System.out.println(toplam);
	}
	
	
	public void tamKarekokBulanMethod(int sayi) {		
		//Karekök Alan matematiksel fonksiyon
		System.out.println(Math.sqrt(sayi));
		
		int sayac=0;
		for (int i = 1; i <= sayi ; i=i+2) {
			sayi = sayi-i;
			sayac++;
		}
		System.out.println("Tam Karekök :" + sayac);
	}
	
	private void basitOrnek() {
		
		for (int i = 0; i < 10; i+=2) {
			System.out.println(i);
			
		}
		
	}

}














