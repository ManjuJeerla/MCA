package com.nt.list;

import java.util.Stack;

public class StackClass {

	public static void main(String[] args) {
		Stack<Object> s=new Stack<>();
		System.out.println(s.isEmpty());
		s.push("a");
		s.push("b");
		s.push("c");
		s.push("d");
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.peek();
		System.out.println(s);
		s.peek();
		System.out.println(s);
		System.out.println(s.search("b"));
		System.out.println(s);
		
		
	}

}
