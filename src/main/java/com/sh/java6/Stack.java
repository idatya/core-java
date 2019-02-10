package com.sh.java6;

import java.util.EmptyStackException;

/**
 * 
 */

/**
 * @author aditya
 * 
 */
public class Stack {
	private Object[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 4;

	public Stack() {
		elements = new Object[DEFAULT_INITIAL_CAPACITY];
	}

	public void push(Object e) {
		ensureCapacity();
		elements[size++] = e;

	}

	public Object pop() {
		if (size == 0)
			throw new EmptyStackException();
		Object result = elements[--size];
		elements[size] = null; // Eliminate obsolete reference
		// return elements[--size];
		return result;
	}

	/**
	 * Ensure space for at least one more element, roughly doubling the capacity
	 * each time the array needs to grow.
	 */
	private void ensureCapacity() {
		if (elements.length == size) {
			// elements = Arrays.copyOf(elements, 2 * size + 1); // for jdk 1.6
			Object[] newarray = new Object[2 * elements.length + 1];
			System.arraycopy(elements, 0, newarray, 0, elements.length); // alternate for jdk 1.5
			elements = newarray;
			newarray = null;
		}
	}

	public static void main(String[] args) {
		Stack st = new Stack();
		for (int a = 0; a <= 10; a++) {
			st.push(a);
			System.out.println("length..." + st.elements.length);
		}
	}

}