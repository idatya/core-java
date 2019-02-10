package com.sh.java6.switchcase;

public class Main {
	public static void main(String[] args) {
		final int a = 1;
		final int bb;
		bb = 2;
		int x = 1;
		switch (x) {
		case a: // ok
			System.out.println("a");
		//case bb: // compiler error ; case expressions must be constant expressions
		}
		
		switch( 14 )
		{
		
			default:
				System.out.println("Invalid Package Category");
			case 1:System.out.println("default1");
			case 2:
			case 3:
				
				System.out.println("default3");break;
				
			case 4:
			case 5:
				System.out.println("default5");break;
				
			
			
		}
		System.out.println(String.format("%1$-1s",((String) "ACS_LN").trim()));
	}
}
