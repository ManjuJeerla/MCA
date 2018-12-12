package com.nt.LambdaExpression;

interface intrf3{
	public int SquareIt(int x);
}

class Demo3 implements intrf3{

	@Override
	public int SquareIt(int x) {
		return x*x;
	}
	
}

public class LETest4 {

	public static void main(String[] args) {
		
		//intrf3 i=new Demo3();
		intrf3 i=x->x*x;
		System.out.println(i.SquareIt(10));
	}

}
