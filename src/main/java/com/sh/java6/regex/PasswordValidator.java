package com.sh.java6.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.Math;

public class PasswordValidator {

	private Pattern pattern;
	private Matcher matcher;

	private static final String PASSWORD_PATTERN = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*\\W).{8,16})";

	public PasswordValidator() {
		pattern = Pattern.compile(PASSWORD_PATTERN);
	}

	/**
	 * Validate password with regular expression
	 * 
	 * @param password password for validation
	 * @return true valid password, false invalid password lenght should 8 to 16 one
	 *         special charactor required one Caps later required one numeric
	 *         charactor required one small charector required
	 */
	public boolean validate(final String password) {

		matcher = pattern.matcher(password);
		return matcher.matches();

	}

	public static void main(String[] args) {
		
		PasswordValidator p = new PasswordValidator();
		if (p.validate("A2AA!A2AaAA"))
			System.out.println("Right");
		else
			System.out.println("wrong");

	}

}