package com.nt.customcollections;

public class NITCollection {
	// 1.create aa class with array Object[] with required initial capacity ,say 10
	private Object[] objArray = new Object[10];

	// maintain array index and also size
	int elementCount = 0;

	// 2.Store the elements into the Object[]
	public void add(Object obj) {

		// 3.Before Storing the elements check whether the elements size is reached or
		// not
		if (elementCount == objArray.length) {
			increaseCapacity();
		}
		objArray[elementCount] = obj;
		elementCount++;
	}

	// 4.If reached,
	// a)create a new capacity with required capacity
	private void increaseCapacity() {
		int newCapacity = objArray.length * 2;
		Object[] nextArray = new Object[newCapacity];

		// b)copy the elements from this old array to new array
		for (int i = 0; i < objArray.length; i++) {
			nextArray[i] = objArray[i];

			// c)Assigns this new Object array capacity to old reference
			objArray = nextArray;

			// 5)then store new elements at the end of the all the elements...

		}

		System.out.println("==================================================");

	}

	// the total no.of objects can be stored in a collection called capacity
	public int capacity() {
		return objArray.length;
	}

	// the total no.of objects we store in a collection is called size
	public int size() {
		return elementCount;
	}

	// retrieve the object reference from the given index location then return it to
	// the caller...
	public Object get(int index) {
		if (index < 0 || index >= size()) {

			throw new IndexOutOfBoundsException(" " + index);

		}
		return objArray[index];
	}

	// assigns the given object to given index location,existing object is replaced
	// with given object
	public void replace(int index, Object obj) {
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException(" " + index);
		}
		objArray[index] = obj;
	}

	public void remove(int index) {
		if (index < 0 || index > size()) {
			throw new IndexOutOfBoundsException(" " + index);
		}

		// 1.Move one location LEFT from the given index+1 to size()-1
		while (index < size() - 1) {
			objArray[index] = objArray[index - 1];
			index++;
		}
		// 2.In size()-1 location store null
		objArray[index] = null;

		// 3.decrease the size by 1...
		elementCount--;
	}
}