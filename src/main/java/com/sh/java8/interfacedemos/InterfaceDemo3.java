package com.sh.java8.interfacedemos;

public class InterfaceDemo3 implements E, F {
    @Override
    public void doSth() {
        F.super.doSth();
    }

    public static void main(String[] args) {
        new InterfaceDemo3().doSth();
    }
}

interface E {
    default void doSth() {
        System.out.println("inside E");
    }
}

interface F {
    default void doSth() {
        System.out.println("inside F");
    }
}