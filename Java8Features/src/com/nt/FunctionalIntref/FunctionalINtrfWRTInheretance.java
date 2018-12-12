package com.nt.FunctionalIntref;
//case1
/*@FunctionalInterface
public interface FunctionalINtrfWRTInheretance {

	public void m1();
}
@FunctionalInterface
interface child extends FunctionalINtrfWRTInheretance{
	//case1
} 
*/

/*//case2
@FunctionalInterface
public interface FunctionalINtrfWRTInheretance {

	public void m1();
}
@FunctionalInterface
interface child extends FunctionalINtrfWRTInheretance{
public void m1();
} 
*/

/*//case3
@FunctionalInterface
public interface FunctionalINtrfWRTInheretance {

	public void m1();
}
@FunctionalInterface
interface child extends FunctionalINtrfWRTInheretance{
//public void m2();//CE:Multiple non overriding abstract methods found
} 
*/

//case4
@FunctionalInterface
public interface FunctionalINtrfWRTInheretance {

	public void m1();
}
//Observe here
interface child extends FunctionalINtrfWRTInheretance{
public void m2();
} 



