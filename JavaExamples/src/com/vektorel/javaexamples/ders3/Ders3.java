package com.vektorel.javaexamples.ders3;


public class Ders3 {
 
	public static void main(String[] args) {

		Ders3 ders3=new Ders3();
		ders3.islemYapanMethod("Test Methost Ýçerigi");
		ders3.aritmetikIslemler(45, 87,"toplam");
		
	}
	
	private void islemYapanMethod(String mesaj) {
		System.out.println(mesaj);
	}
	
	private void aritmetikIslemler(int sayi1,int sayi2,String islem) {
		if(islem.equals("topla")){
			System.out.println(sayi1+sayi2);
		}else{
			System.out.println("Yanlýþ Yazdýn");
		}
	}
	
	
	
	private String geriDonusluMethod(String mtn1,String mtn2) {
		
		String islemSonucu= mtn1+mtn2+mtn1;
		return islemSonucu+"Taner";	
	}
	
	
	
}























