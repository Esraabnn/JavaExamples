package com.vektorel.javaexamples.ders8.kalitim;

public class FordBinek extends Ford {
	
	public void fordBinekOto() {
		ford();
		System.out.println("Ford Binek Oto");
	}
	
	@Override
	public void start() {
		super.start();
		System.out.println("Binek oto Start oldu");
	}

}
