package com.sh.java6.singleton;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hi");
		Main m = new Main();
		m.start();
	}

	public void start() {
		ASingleton.getInstance().log();
	}
}
