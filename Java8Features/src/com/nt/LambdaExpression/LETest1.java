package com.nt.LambdaExpression;

interface intrf{
	public void m1();
}

/*class Demo implements intrf{

	@Override
	public void m1() {
		System.out.println("Without Lambda Expression");	
	}
	
}
*/
public class LETest1 {

	public static void main(String[] args) {
		
	intrf i1=()->
		System.out.println("with Lambda Expression");
	i1.m1();
	}

}
