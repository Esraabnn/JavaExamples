package com.vektorel.javaexamples.ders4;

public class Fibbonacci {

	public static void main(String[] args) {
		System.out.println("1\n1");
		recursive(1, 1);
	}
	
	private static void recursive(int sayi,int oncekiSayi) {
		System.out.println(sayi+oncekiSayi);
		int temp=sayi;
		sayi=sayi+oncekiSayi;
		oncekiSayi=temp;
		if(sayi<1000)
			recursive(sayi, oncekiSayi);
	}
}
