package com.nt.listNmapProjects;

import java.util.LinkedHashSet;

public class ExampleCollection {

	public static void main(String[] args) {
		
		LinkedHashSet<Object> lhs=new LinkedHashSet<>();
		
		lhs.add(new Example(5,6));
		lhs.add(new Example(5, 6));
		
		Example e3=new Example(5, 6);
		Example e4=new Example(5, 6);
		Example e5=new Example(6, 5);
		Example e6=new Example(7, 8);
		Example e7=e6;
		
		lhs.add(e3);
		lhs.add(e4);
		lhs.add(e5);
		lhs.add(e6);
		lhs.add(e7);
		
		System.out.println("no.of Objects are added::"+lhs.size());
		System.out.println(lhs);
		System.out.println();
		
		System.out.println("It is removed::"+lhs.remove(new Example(6,5)));
		System.out.println("It is removed::"+lhs.remove(e7));
		
		System.out.println("No. of Objects after removed::"+lhs.size());
		
		/*System.out.println(e3.hashCode());//diff hc           case1: not overridng HC()&Equals()
		System.out.println(e4.hashCode());//diff hc             ----->6 buckets are created (different)
		System.out.println(e5.hashCode());//diff hc             ----->6 objects are added to the 6 buckets
		System.out.println(e6.hashCode());//same hc             ----->1 object is removed  i.e.  e6
		System.out.println(e7.hashCode());//same hs
		*/
		
		/*System.out.println(e3.hashCode());//same hc           case2:Override only HC()by returning only 5
		System.out.println(e4.hashCode());//same hc             ----->1 buckets are created (same)
		System.out.println(e5.hashCode());//same hc             ----->6 objects are added to the same buckets
		System.out.println(e6.hashCode());//same hc             ----->1 object is removed i.e.  e6
		System.out.println(e7.hashCode());//same hs
		*/
		
		/*System.out.println(e3.hashCode());//diff hc           case3:Override only equals() by returning true/false
		System.out.println(e4.hashCode());//diff hc             ----->6 buckets are created (different)
		System.out.println(e5.hashCode());//diff hc             ----->6 objects are added to the diff buckets
		System.out.println(e6.hashCode());//same hc             ----->1 object is removedi.e.  e6
		System.out.println(e7.hashCode());//same hs
		*/
		

		/*System.out.println(e3.hashCode());//same hc           //case4:Override only HashCode() by returning 5 and equals() by returning true
		System.out.println(e4.hashCode());//same hc             //----->1 buckets are created (same HC()returning value)
		System.out.println(e5.hashCode());//same hc             //----->1 objects are added i.e first bucket
		System.out.println(e6.hashCode());//same hc             //----->1 object is removed i.e example(6,5)
		System.out.println(e7.hashCode());//same hs
		*/
		
		
		/*System.out.println(e3.hashCode());//same hc           //case5:Override only HashCode() by returning 5 and equals() by returning false
		System.out.println(e4.hashCode());//same hc             //----->1 buckets are created (same HC()returning value)
		System.out.println(e5.hashCode());//same hc             //----->6 objects are added i.e same bucket
		System.out.println(e6.hashCode());//same hc             //----->1 object is removed i.e e6
		System.out.println(e7.hashCode());//same hs
        */
		
		System.out.println(e3.hashCode());//diff hc             //case6:Override only HashCode() by returning x+y and equals() by returning its data
		System.out.println(e4.hashCode());//diff hc             //----->2 buckets are created (same HC()returning value)
		System.out.println(e5.hashCode());//diff hc             //----->unique objs are added
		System.out.println(e6.hashCode());//same hc             //----->2 object is removed     this is best
		System.out.println(e7.hashCode());//same hs
		
		System.out.println(lhs);
		


	}

}
