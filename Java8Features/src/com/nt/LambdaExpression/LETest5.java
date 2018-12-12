package com.nt.LambdaExpression;

/*class MyRunnable implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread");
		}
		
	}
}*/
public class LETest5 {

	public static void main(String[] args) {
		
     /*   Runnable r=new MyRunnable();//it is like a car
         Thread t1=new Thread(r);//it is like driver for the car object
         t1.start();//it is like starting the car
         for(int j=0;j<10;j++) {
        	 System.out.println("Main THread");
         }
     */        


		Runnable r=()->{
			            for(int i=0;i<10;i++) {
			            	System.out.println("Child Thread");
			            }
		};
			            Thread t1=new Thread(r);
			            t1.start();
			            for(int j=0;j<10;j++) {
			            	System.out.println("Main Thread");
			            }
	
	}
}
