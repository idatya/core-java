package com.sh.java6.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateUtil {
    public static void main(String[] args) {
        System.out.println(getCurrentDate());
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
        }
        return date;
    }

}