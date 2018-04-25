package com.eli.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Eli on 2017/5/22.
 */
public class CalendarTest {

    public static void main(String[] args) throws Exception {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Date d = dateFormat.parse("2017-01-01");
        System.out.println(d);

        System.out.println("-----------");

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, cal.get(Calendar.HOUR_OF_DAY) - 48);// 开始时间24小时前
        Date beginTime = cal.getTime();

        cal = Calendar.getInstance();
        cal.set(Calendar.MINUTE, cal.get(Calendar.MINUTE) -5);// 结束时间5分钟前
        Date endTime = cal.getTime();

        System.out.println(beginTime);
        System.out.println(endTime);

        System.out.println("-----");

        Date x = dateFormat.parse("2017-01-01");

        Calendar calendar = new GregorianCalendar();
        calendar.setTime(x);
        calendar.add(Calendar.DATE, -10);
//        System.out.println("Date = "+ calendar.getTime());

        List<String> datesInRange = new ArrayList<String>();
        Calendar startCalendar = new GregorianCalendar();
        startCalendar.setTime(calendar.getTime());

        Calendar endCalendar = new GregorianCalendar();
        endCalendar.setTime(x);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        while (startCalendar.before(endCalendar)) {
            Date result = startCalendar.getTime();
            datesInRange.add(sdf.format(result.getTime()));
            startCalendar.add(Calendar.DATE, 1);
        }
        datesInRange.add(sdf.format(x));


        for (String date : datesInRange){
            System.out.println(date);
        }


        System.out.println("---------");

        System.out.println(getDatesInRange(dateFormat.parse("2017-01-01"), dateFormat.parse("2017-01-11")));

    }

    public static List<String> getDatesInRange(Date startDate, Date endDate){
        List<String> datesInRange = new ArrayList<String>();

        Calendar startCalendar = new GregorianCalendar();
        startCalendar.setTime(startDate);

        Calendar endCalendar = new GregorianCalendar();
        endCalendar.setTime(endDate);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        while (startCalendar.before(endCalendar)) {
            Date result = startCalendar.getTime();
            datesInRange.add(sdf.format(result.getTime()));

            startCalendar.add(Calendar.DATE, 1);
        }
        // 把传入的当天也加上
        datesInRange.add(sdf.format(endDate));

        return datesInRange;
    }
}
