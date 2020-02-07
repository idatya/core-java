package com.sh.java6;

public class Test {

	int i, j;

	void function(int k) {
		k = k + 1;
		j = k + 1;

		System.out.println(k);
		System.out.println(j);
	}

	public static void main(String args[]) {
		Test tObj = new Test();
		tObj.function(6);
		System.out.println(tObj.i);
		System.out.println(tObj.j);

	}
}