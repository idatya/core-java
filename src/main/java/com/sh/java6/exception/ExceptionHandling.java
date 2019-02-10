package com.sh.java6.exception;


public class ExceptionHandling {
	private static int test() {

		try {
			System.out.println("try");
			int r = 10/0;
			return 1;
		} catch (Exception e) {
			System.out.println("catch");
			return 2;
		} finally {
			System.out.println("finally");
			return 3; //always retunr this line : no matter exception occur or not
		}
	

	}

	public static void main(String[] args) {
		
		System.out.println(test());
	}
}
