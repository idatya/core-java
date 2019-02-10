package com.sh.java6.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDiff {
	public static void main(String[] args) throws ParseException {
		System.out.println(date());
	}

	private static boolean date() throws ParseException {
		DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		Date dt2 = formatter.parse("31-03-2018 23:59:59");
		Date dt1 = formatter.parse("01-04-2018 13:00:00");

		long diff = dt2.getTime() - dt1.getTime();
		long diffSeconds = diff / 1000 % 60;
		long diffMinutes = diff / (60 * 1000) % 60;
		long diffHours = diff / (60 * 60 * 1000);
		int diffInDays = (int) ((dt2.getTime() - dt1.getTime()) / (1000 * 60 * 60 * 24));

		if (diffInDays > 1) {
			System.err.println("Difference in number of days (2) : " + diffInDays);
			return false;
		} else if (diffHours > 24) {

			System.err.println(">24");
			return false;
		} else if ((diffHours == 24) && (diffMinutes >= 1)) {
			System.err.println("minutes");
			return false;
		}
		return true;

	}
}