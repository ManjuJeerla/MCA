package com.nt.FunctionalIntref;

public interface Interf1 {
	public void m1();
	
	default void m2(){
		System.out.println("any no.of default methods");
	}
	
	public static void m3() {
		System.out.println("any no.of static mehtods");
	}

}
