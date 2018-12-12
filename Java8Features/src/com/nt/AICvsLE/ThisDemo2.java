package com.nt.AICvsLE;

interface intrf1{
public void m1();
}
public class ThisDemo2 {
    int x=10;//class level variable(Global)
	public void m2() {
		
		int y=20;//method level Variable(Local) 
		intrf1 i1=()->{
			System.out.println(x);//10
			System.out.println(y);//20
			System.out.println(x=999);
		//	System.out.println(y=888);//CE:Local variables referenced from Lambda Expressions must be final or effectively final
		};
		i1.m1();
	}
	public static void main(String[] args) {
		ThisDemo demo=new ThisDemo();
		demo.m2();

	}

}
