package com.sh.java8.functionalinterface;

import java.util.Arrays;

public class UseVarArgInterface {
	static String useOp() {

		VarArgInterface var = Arrays::toString;
		// VarArgInterface var = Object::toString;
		var = args -> String.valueOf(args.length);

		return var.op(new String[] { "", "" });
	}
}
