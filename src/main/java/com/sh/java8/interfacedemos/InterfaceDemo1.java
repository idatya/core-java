package com.sh.java8.interfacedemos;

public class InterfaceDemo1 implements A {
	@Override
	public void doSth() {
		System.out.println("inside InterfaceDemo1");
	}

	public static void main(String[] args) {
		new InterfaceDemo1().doSth();
	}
}

interface A {
	default void doSth() {
		System.out.println("inside A");
	}
}
