package com.vektorel.javaexamples.ders6;

public class DersOrnek {

	public static void main(String[] args) {
		DersOrnek dersOrnek=new DersOrnek();
		//dersOrnek.asci();
		dersOrnek.karakter();
	}
	
	public void karakter() {
		char degisken='A';
		String a = "StringMetodlari ";
		char[] dizi =  a.toCharArray();
		
		for (int i = 0; i < dizi.length; i++) {
			if((int)dizi[i]==111)
				System.out.println("Buldum");
		}
	}
	
	public void asci() {
	
		char[] dizi =new char[]{'A','b','C','D','E','F','G','T'};
		
		for (int i = 0; i < dizi.length; i++) {
			int degeri=(int)dizi[i];
			System.out.println(dizi[i] +":"+ degeri);
		}
	}
	
	
	
	
}
