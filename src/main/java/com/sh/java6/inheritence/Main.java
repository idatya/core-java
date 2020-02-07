package com.sh.java6.inheritence;

public class Main {
public static void main(String[] args) {
	Parent ca = new childA();
	System.out.println(ca.i);
	ca.display("display from A");
	childA cb = new childB();
	cb.display("display from B");
}
}
