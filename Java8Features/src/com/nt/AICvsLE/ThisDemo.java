package com.nt.AICvsLE;

interface intrf{
	public void m1();
}

public class ThisDemo {

	//Appraoch1:using AIC
	/*int x=888;
	public void m2() {
		intrf i1=new intrf() {
						@Override
			public void m1() {
		       int x=999;//instance variable
		        // System.out.println(this.x);//999
		         //System.out.println(ThisDemo.this.x);//888
		       
			}
		};
		i1.m1();
	}*/
	
	int x=888;
	public void m2() {
		intrf i=()->{
			int x=999;//local variable
			System.out.println(this.x);//888
			System.out.println(ThisDemo.this.x);//888
		};
		i.m1();
	}
	public static void main(String[] args) {

		ThisDemo demo=new ThisDemo();
		demo.m2();
		
	}

}
