package com.eli.json;

import java.text.DecimalFormat;
import java.util.Date;

/**
 * Created by elizhou on 2017/7/7.
 */
public class JsonTest {
    public static void main(String[] args) {

//        System.out.println("A" + null);
//
//        Object i = 1;
//
//        Integer i1 = Integer.valueOf(i.toString());
//
//        System.out.println(i1);

//        Person p1 = new Person();
//        p1.setBeginTime(new Date());
//        p1.setEndTime(new Date());


        DecimalFormat df = new DecimalFormat("#,###");
        String newQ = df.format(1111110.00);

        System.out.println(newQ);
    }
}
