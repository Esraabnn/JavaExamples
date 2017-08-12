package com.vektorel.javaexamples.ders5;

public class Ders5 {

	public static void main(String[] args) {
		Ders5 ders5 = new Ders5();
		ders5.basitDizi2();
	}

	private void basitDizi() {
		int[] dizi = new int[500];

		int k = dizi[22];
		System.out.println(k);

		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = 45;
		}

		dizi[49] = 36;
		System.out.println("sdfg");
	}

	private void basitDizi2() {

		String[] sDizi = new String[] { "Ahmet", "Mehmet", "Cemal" };

		sDizi[2]="Kemal";
		
		for (int i = 0; i < sDizi.length; i++) {
			System.out.println(sDizi[i]);
		}
	}
	
	
	private void ikiBoyutlu() {
		String[][] dizi=new String[3][3];
		
		dizi[0][1]="Ahmet";
		
	}
	
	private void ikiboyutluTest() {
		String[][] kelimeler=new String[][]
				{
					{"Pencil","Kalem"},
					{"School","Okul"},
					{"Space","Uzay"},
					{"Computer","Bilgisayar"}
				};
				
				
				
	}

}
