package com.sh.java6.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateUtil {
	public static void main(String[] args) throws ParseException {
		System.out.println(getCurrentDate());
		String strdate = "2017-05-29 14:34:22.1";
		DateFormat form = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
		Date d = form.parse(strdate);
		System.out.println(d);
	}

	public static Date getCurrentDate() {
		Date date = null;
		try {
			DateFormat dfUtc = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
			dfUtc.setTimeZone(TimeZone.getTimeZone("UTC"));
			DateFormat dfLocal = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
			date = dfLocal.parse(dfUtc.format(new Date()));
			System.out.println(date);
			DateFormat dateFormatUtc = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
			dateFormatUtc.setTimeZone(TimeZone.getTimeZone("UTC"));
			DateFormat dateFormatLocal = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
			System.out.println(dateFormatUtc.format(new Date()));
			date = dateFormatLocal.parse(dateFormatUtc.format(new Date()));

		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

}