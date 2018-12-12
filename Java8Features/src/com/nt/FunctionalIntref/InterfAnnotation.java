package com.nt.FunctionalIntref;

@FunctionalInterface
public interface InterfAnnotation {
public void m1();
//public void m2();  CE:Multiple non overriding abstract methods in IntrerAnnotation
default void m2() {
	
}
public static void m3() {
	
}
	
}
