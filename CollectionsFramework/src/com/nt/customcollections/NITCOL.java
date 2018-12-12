package com.nt.customcollections;

public class NITCOL {

	// 1.create a object[] with the given index locations say 10
	private Object[] objArray = new Object[10];

	// Maintain index location and also size
	private int elementCount = 0;

	// 2.Store the elements to the Object[] array
	public void add(Object obj) {
		// 3.Before storing the elements check whether the element capacity is reached
		// or not
		if (elementCount == objArray.length) {
			increaseCapacity();
		}
		objArray[elementCount] = obj;
		elementCount++;
	}

	// 4.If reached,
	// a)Create the new Arrray Object with the required capacity ...
	private void increaseCapacity() {

		int newCapacity = objArray.length * 2;

		Object[] nextArray = new Object[newCapacity];

		// b)copy the elemetns to this new array

		for (int i = 0; i < objArray.length; i++) {
			nextArray[i] = objArray[i];

			// c)Assigns the new object[] to the old reference
			objArray = nextArray;

		}
	}

	// the total no.of object we can store into the collection
	public int capacity() {
		return objArray.length;
	}

	// the total no.of object are stored into the collection
	public int size() {
		return elementCount;
	}

	// Retrieve the Object reference from the given index location
	public Object get(int index) {
		if (index < 0 || index > size()) {
			throw new IndexOutOfBoundsException(" " + index);
		}
		return objArray[index];
	}

	// Assigns the given object to the given index location,then replace the new
	// object from the given object
	public void replace(int index, Object obj) {
		if (index < 0 || index > size()) {
			throw new IndexOutOfBoundsException(" " + index);
		}
	}

	// 1.move one location LEFT form the given index+1 to size-1
	public void remove(int index) {
		if (index < 0 || index > size()) {
			throw new IndexOutOfBoundsException(" " + index);
		}
		while (index < size() - 1) {
			objArray[index] = objArray[index - 1];
			index++;
		}
		// 2.In size-1 location store null
		objArray[index] = null;
		// 3.Decrease the element by 1
		elementCount--;
	}

}
