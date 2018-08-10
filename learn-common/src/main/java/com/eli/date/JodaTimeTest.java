package com.eli.date;

import org.joda.time.DateTimeComparator;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by elizhou on 2018/8/6.
 */
public class JodaTimeTest {
    public static void main(String[] args) {
        System.out.println(compareDate("2018-01-03 00:00:02", "2018-01-04 00:00:01"));


//        System.out.println(DateTimeComparator.getInstance().compare("2018-01-04 00:00:00", "2018-01-04 00:00:00"));
    }

    public static int compareDate(String date1, String date2) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        try {
            Date dt1 = df.parse(date1);
            Date dt2 = df.parse(date2);
            if (dt1.getTime() > dt2.getTime()) {
                return 1;
            } else if (dt1.getTime() < dt2.getTime()) {
                return -1;
            } else {
                return 0;
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        return 0;
    }

}
