package com.nt.list;

import java.util.ArrayList;

public class ArrayListEmployee {

	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<>();

		al.add("HK");
		al.add(50000);

		al.add("raja");
		al.add(60000);

		al.add("ashok");
		al.add(40000);

		System.out.println("====================");

		for (int i = 0; i < al.size(); i++) {
			Object obj = al.get(i);

			if (obj instanceof String) {
				String emp = (String) obj;
			
				System.out.println(emp.toUpperCase());
				// System.out.println(obj.toUpperCase());//CE:the method toUpperCase() is
				// undefined for this type of object
			}
		}
		System.out.println(al);
		
		for (int i = 0; i < al.size(); i++) {
			Object obj = al.get(i);

			if (obj instanceof Integer) {
				Integer emp = (Integer) obj;
			System.out.println(emp);
			}
		}
		System.out.println(al);
	}
}
