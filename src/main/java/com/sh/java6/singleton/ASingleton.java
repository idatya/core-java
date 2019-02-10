package com.sh.java6.singleton;

public class ASingleton {

	private static volatile ASingleton instance;

	private ASingleton() {
	}

	public static ASingleton getInstance() {
		ASingleton result = instance;
		if (result == null) {
			synchronized (ASingleton.class) {
				result = instance;
				if (result == null)
					instance = result = new ASingleton();
			}
		}
		return result;
	}

	public void log() {
		System.out.println("In log");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getClass().getSimpleName());
		System.out.println(Thread.currentThread().getClass().getName());
		StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
		System.out.println(stackTrace[2].getClassName());
		System.out.println(stackTrace[2].getMethodName());
		System.out.println(stackTrace[2].getFileName());
		System.out.println(stackTrace[2].getLineNumber());
		
	}

}