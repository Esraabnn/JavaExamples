package com.vektorel.javaexamples.ders6;

/**
 * Eriþim Belirleyicileri
 * @author vektorel
 *
 */
public class Ders6 {
	
	
	public static void main(String[] args) {
		diziOrnekPackage();
		diziOrnekPrivate();
		diziOrnekProtected();
		diziOrnekPublic();
	}
	
	public static void diziOrnekPublic() {
	System.out.println("public");
	}

	private static void diziOrnekPrivate() {
		System.out.println("Private");		
	}
	
	static void  diziOrnekPackage() {
		System.out.println("Package");
	}
	
	protected static void diziOrnekProtected() {
		System.out.println("Protected");
	}
}
