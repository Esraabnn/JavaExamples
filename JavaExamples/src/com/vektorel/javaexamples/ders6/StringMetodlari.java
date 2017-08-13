package com.vektorel.javaexamples.ders6;

public class StringMetodlari {

	public static void main(String[] args) {
		StringMetodlari metodlari=new StringMetodlari();
		String a="StringMetodlari ";
		metodlari.stringMetodlari(a);
		
	}
	
	public void stringMetodlari(String metin) {
	
		
		System.out.println("Karakter Sayýsý :"+ metin.length());
		System.out.println("substring(10) :"+ metin.substring(10));
		System.out.println("trim :"+ metin.trim());
		System.out.println("charAt :"+ metin.charAt(7));
		System.out.println("concat :"+ metin.concat("Taner"));
		System.out.println("replace('i', '@') :"+ metin.replace('i', '@'));
		System.out.println("toLowerCase :"+ metin.toLowerCase());
		System.out.println("toUpperCase :"+ metin.toUpperCase());
		System.out.println("indexOf(i) :"+ metin.indexOf('i'));
		System.out.println("lastIndexOf('i') :"+ metin.lastIndexOf('i'));
		System.out.println("subSequence(5, 7) :"+ metin.subSequence(5, 7));
		System.out.println("isEmpty :"+ metin.isEmpty());
		
		String[] dizi= metin.split("i");
		for (int i = 0; i < dizi.length; i++) {
			System.out.println("Karakter Sayýsý ".concat(dizi[i]));	
		}
		
		
	}
	
	String kanTestMesaji="HASTA|Taner TEMEL|YAS|42|TARIH|21/09/2017|WBC|3,17|2,3|4,8|EC|4,7|4,1|4,5|";
	
}
