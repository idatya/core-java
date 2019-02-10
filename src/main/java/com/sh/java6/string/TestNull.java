package com.sh.java6.string;

import java.util.ArrayList;
import java.util.List;

class Employee {

	String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		if (name != null)
			this.name = name.trim();
		else
			this.name = name;
	}

}

public class TestNull {
	public static void main(String aa[]) {
		Employee emp = new Employee();
		String str = "//aditya\nsingh//";
		emp.setName(str.trim());
		System.out.println("Employee---->" + emp.getName());
		List a = new ArrayList();
		if (a == null) {
			System.out.println("null");
		} else {
			System.out.println("not null---" + a.size());
		}

	}

}