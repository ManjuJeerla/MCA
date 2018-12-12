package com.nt.LambdaExpression;


interface intrf1{
	public void add(int a,int b);
}
 /*class Demo1 implements intrf1{

	@Override
	public void add(int a, int b) {
		System.out.println("Sum of Two numbers::"+(a+b));
		
	}
	
}
*/

public class LETest2 {

	public static void main(String[] args) {
		
		intrf1 i1=(a,b)->System.out.println("the sum of 2 no::"+(a+b));
		 i1.add(100, 200);              

	}

}
