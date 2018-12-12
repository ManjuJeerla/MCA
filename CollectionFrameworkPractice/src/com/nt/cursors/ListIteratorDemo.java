package com.nt.cursors;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		LinkedList<Object> ll=new LinkedList<>();
		ll.add("Megastar");
		ll.add("powerstar");
		ll.add("superstar");
		ll.add("Megapowerstar");
		
		System.out.println(ll);
		
		ListIterator<Object> litr=ll.listIterator();
		while(litr.hasNext()) {
			String str=(String) litr.next();
			if(str.equals("Megastar")) {
				litr.remove();
				System.out.println(str);
			}
			else if(str.equals("powerstar")) {
				litr.add("pspk");
				System.out.println(str);
			}
			else if(str.equals("megastar")) {
				litr.set("charan");
				System.out.println(str);
			}
		}
		System.out.println(ll);
		
		/*while(litr.hasNext()) {
			String str=(String)litr.next();
			System.out.println(str);
		}
		*/
		
	/*	while(litr.hasPrevious()) {
			String str=(String)litr.previous();
			System.out.println(str);
		}
		
	*/
		}

}
