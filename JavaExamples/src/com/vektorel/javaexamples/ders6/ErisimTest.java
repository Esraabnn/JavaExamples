package com.vektorel.javaexamples.ders6;

public class ErisimTest {

	public static void main(String[] args) {
		Ders6 ders6=new Ders6();
		ders6.diziOrnekPackage();
	}
}


/*
public - Heryerden erişilebilir
private - Aynı Class ve seviyelerinde erişilebilir 



Access Levels
Modifier	Class	Package	Subclass	World
public		Y		Y		Y			Y
protected	Y		Y		Y			N
no modifier	Y		Y		N			N
private		Y		N		N			N


*/