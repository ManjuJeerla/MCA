package com.nt.LambdaExpression;
@FunctionalInterface
interface intrf2{
	public int getLength(String s);
}

/*class Demo2 implements intrf2{

	@Override
	public int getLength(String s) {
		return s.length();
		
	}
	
}*/


public class LETest3 {

	public static void main(String[] args) {
		//Intrf2=new Demo2();
		intrf2 i=s->s.length();
		System.out.println(i.getLength("Manjunatha"));
	}

}
