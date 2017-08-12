package com.vektorel.javaexamples.ders3;

import javax.swing.JOptionPane;

public class DersOrnegi {
	
	public static void main(String[] args) {
		String girilenDeger = JOptionPane.showInputDialog("Yar��ap veya Kenar Giriniz");
		int kenar = Integer.valueOf(girilenDeger);
		
		DersOrnegi dersOrnegi=new DersOrnegi();
		dersOrnegi.cemberAlanHesaplama(kenar);
		dersOrnegi.cemberCevreHesaplama(kenar);
		dersOrnegi.kareAlanHesaplama(kenar);
		dersOrnegi.kareCevreHesaplama(kenar);
	}
	
	private void kareCevreHesaplama(int kenar) {
		int cevre = kenar*4;
		System.out.println("Kenar� " + kenar + " olan karenin �evresi " + cevre);
	}
	
	private void kareAlanHesaplama(int kenar) {
		int alan = kenar*kenar;
		System.out.println("Kenar� " + kenar + " olan karenin alan� " + alan);
	}
	
	private void cemberCevreHesaplama(int yaricap) {
		double cevre = yaricap * Math.PI *2;
		System.out.println("Yar��ap� " + yaricap + " olan �emberin �evresi " + cevre);
	}
	
	private void cemberAlanHesaplama(int yaricap) {
		double alan = yaricap * yaricap * Math.PI ;
		System.out.println("Yar��ap� " + yaricap + " olan �emberin alan� " + alan);
	}

}
