package com.vektorel.javaexamples.ders7;

public class Ders7 {
	
	public static void main(String[] args) {
		Ders7 ders7=new Ders7();
		ders7.whileIleDizi();
	}
	
	/**
	 * Sonsuz d�ng�
	 */
	public void whileMetodu() {
		while (true) {
			System.out.println("Kod i�ler");
		}
	}
	
	private void whileIleDizi() {
		String[] dizi=new String[]{"Ahmet","Mehmet","Cemal"};
		
		int i=0;
		while (dizi.length>i) {
			System.out.println( dizi[i]);			
			i++;
		}
		
		System.out.println("Bitti");
	}

}
