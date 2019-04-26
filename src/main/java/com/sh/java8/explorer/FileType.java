package com.sh.java8.explorer;

public enum FileType {
	CLASS, INTERFACE, ENUM, UNKNOWN;

	public static FileType ofFullType(String fullType) {
		if (fullType.startsWith("Class")) {
			return CLASS;
		}
		if (fullType.startsWith("Interface")) {
			return INTERFACE;
		}
		if (fullType.startsWith("Enum")) {
			return ENUM;
		}
		return UNKNOWN;
	}
}
