package com.sh.java6.inheritence;

class A {
	int a = 10;

	void show() {
		System.out.println("A");
	}
}

class B extends A {
	int a = 20;

	void show() {
		System.out.println("B");
	}
}

public class TestForObject extends B {

	public void show() {
		System.out.println("\nTestForObject");
	}

	public void main() {
		System.out.println("in mpublic main");
	}

	public String main2() {
		return null;
	}

	public static void main(String args[]) {
		A a = new B();
		A aa = (A) new B();
		//B b = new A(); // compile time Exception
		//B b=(B)new A(); //Runtime Exception
		// TestForObject t=(TestForObject)new A(); //Runtime Exception
		// TestForObject t=(TestForObject)new B(); //Runtime Exception
		B b = new B();
		a.show();
		System.out.println(a.a);
		aa.show();
		System.out.println(aa.a);
		b.show();
		System.out.println(b.a);
		A a2 = new A();
		a2.show();
		System.out.println(a2.a);
	}

	public class a {

	}
}