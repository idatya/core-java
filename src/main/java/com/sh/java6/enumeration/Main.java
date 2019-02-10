package com.sh.java6.enumeration;

import java.time.LocalTime;

public class Main {

	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		System.out.println(time);
		System.out.println(HistoryEnum.INITIATED);
	}

}

enum HistoryEnum {
	INITIATED, RUNNING, FINISHED, CANCELLED;
}