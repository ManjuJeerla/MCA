package com.nt.AICvsLE;

public class ThreadDemo {

	public static void main(String[] args) {
		//Approach 1: using AnanamousInnerClass
		/*Runnable r=new Runnable() {
			
			@Override
			public void run() {
		        for(int i=0;i<10;i++) {
		        	System.out.println("Child Thread");
		        }
			}
		};
		*/
		/*//Approach2: using LambdaExpressions
		Runnable r=()->{
			      for(int i=0;i<10;i++) {
			    	  System.out.println("Child Thread");
			      }
		};
		Thread t=new Thread(r);
		t.start();
		for(int j=0;j<10;j++) {
			System.out.println("Main Thread");
		}*/
		
		
		//Appraoch3:Simplified version of LambdaExpression
		Thread t=new Thread(()-> {
			for(int i=0;i<10;i++) {
				System.out.println("Child Thread");
			}
		});
		t.start();
		for(int j=0;j<10;j++) {
			System.out.println("Main Thread");
		}
	}

}
