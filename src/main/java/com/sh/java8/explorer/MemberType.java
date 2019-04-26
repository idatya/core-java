package com.sh.java8.explorer;

public enum MemberType {
	METHOD ("success"),
    CONSTRUCTOR ("info"),
    FIELD ("default"),
    UNKNOWN ("default");

	private String color;

	MemberType(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}
}
