package com.sh.java6.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
public static void main(String[] args) {
	List<String> list = new ArrayList<>();
	list.add("Aditya");
	list.add("aditya");
	list.add("samar");
	list.add("Sudha");
	
	System.out.println(list);
	
	Collections.sort(list);
	
	System.out.println(list);
}
}
