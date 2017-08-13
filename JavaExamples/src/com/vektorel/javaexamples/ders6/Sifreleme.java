package com.vektorel.javaexamples.ders6;

import java.util.Scanner;

public class Sifreleme {
	public static void main(String[] args) {
		Sifreleme  sifreleme=new Sifreleme();
		Scanner scanner=new Scanner(System.in);
		String test = scanner.nextLine();
		String sifrelenmis = sifreleme.sifrele(test);
		sifreleme.coz(sifrelenmis);
	}

	public String sifrele(String metin) {
		char[] dizi = metin.toCharArray();
		String sonuc="";
		for (int i = 0; i < dizi.length; i++) {
			int say = (int)dizi[i];
			if(say%2==0)
				say=say-5;
			else
				say=say+3;
			
			sonuc += (char) say;
		}
		System.out.println(sonuc);
		return sonuc;
	}
	
	public void coz(String metin) {
		char[] dizi = metin.toCharArray();
		String sonuc="";
		for (int i = 0; i < dizi.length; i++) {
			int say = (int)dizi[i];
			if(say%2==0)
				say=say-3;
			else
				say=say+5;
			
			sonuc += (char) say;
		}
		System.out.println(sonuc);
	}
}
