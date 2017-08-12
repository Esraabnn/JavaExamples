package com.vektorel.javaexamples.ders3;

import javax.swing.JOptionPane;

public class DersOrnegiR {
	public static void main(String[] args) {
		String girilenDeger = JOptionPane.showInputDialog(null,"Yar��ap veya Kenar Giriniz");
		int kenar = Integer.valueOf(girilenDeger);

		DersOrnegiR dersOrnegiR =new DersOrnegiR();
		double cemberAlan = dersOrnegiR.cemberAlanHesaplama(kenar);
		double cemberCevre = dersOrnegiR.cemberCevreHesaplama(kenar);
		int kareAlan = dersOrnegiR.kareAlanHesaplama(kenar);
		int kareCevre = dersOrnegiR.kareCevreHesaplama(kenar);
		
		System.out.println("Kenar� " + kenar + " olan karenin �evresi " + cemberAlan);
		System.out.println("Kenar� " + kenar + " olan karenin alan� " + cemberCevre);
		System.out.println("Yar��ap� " + kenar + " olan �emberin �evresi " + kareAlan);
		System.out.println("Yar��ap� " + kenar + " olan �emberin alan� " + kareCevre);
	}
	
	private int kareCevreHesaplama(int k) {
		int cevre = k*4;
		return cevre;
	}
	
	private int kareAlanHesaplama(int kenar) {
		int alan = kenar*kenar;
		return alan;
	}
	
	private double cemberCevreHesaplama(int yaricap) {
		double cevre = yaricap * Math.PI *2;
		return cevre;
	}
	
	private double cemberAlanHesaplama(int yaricap) {
		double alan = yaricap * yaricap * Math.PI ;
		return alan;
	}
}
