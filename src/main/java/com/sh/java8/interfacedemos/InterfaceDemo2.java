package com.sh.java8.interfacedemos;

public class InterfaceDemo2 implements B, D {
    
	public static void main(String[] args) {
        new InterfaceDemo2().doSth();
    }
}

interface B {
    default void doSth() {
        System.out.println("inside B");
    }
}

interface D extends B {
    default void doSth() {
        System.out.println("inside D");
    }
}
