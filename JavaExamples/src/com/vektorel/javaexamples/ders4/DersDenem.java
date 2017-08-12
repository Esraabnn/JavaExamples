package com.vektorel.javaexamples.ders4;

import java.util.Scanner;

public class DersDenem {
	public static void main(String[] args) {
		System.out.println("Bir Sayý Gir:");
		Scanner scanner=new Scanner(System.in);
		int sayi = scanner.nextInt();
		
		DonguOrnekleri donguOrnekleri=new DonguOrnekleri();
		donguOrnekleri.tamKarekokBulanMethod(sayi);
		
	}
}
