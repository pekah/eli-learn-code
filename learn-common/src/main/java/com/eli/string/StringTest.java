package com.eli.string;

import java.math.BigDecimal;
import java.util.*;

/**
 * Created by elizhou on 2017/7/7.
 */
public class StringTest {
    public static void main(String[] args) {

        System.out.println(getMonthFromTransId("T20180710004314654209"));
        System.out.println(getMonthFromTransId("T20181110004314654209"));




        Double doubleV = 223.11;
        System.out.println(yuan2fen(doubleV));
        System.out.println(yuan2fen(-2333.11));
        System.out.println(doubleV.toString().startsWith("-"));

        String sss = "12345678哈";

        System.out.println(sss.trim().substring(0, 8));
        System.out.println("----");

        String s = "你好%s";
        String s2 = String.format(s, "试试");
        System.out.println(s2);

        String[] ss = s.split("\\.");
        System.out.println(ss);
        System.out.println("--");

        System.out.println( new BigDecimal(1.00 * 100 ).setScale(2,BigDecimal.ROUND_HALF_UP).intValue());
        System.out.println("---");


        List<Integer> integers = new ArrayList<Integer>();
        integers.add(1);
        integers.add(2);
        integers.add(3);

        System.out.println(integers);

        System.out.println("---");

        List<Integer> needRemove = new ArrayList<Integer>();

        for (Integer i : integers){

            if(i == 2){
                needRemove.add(i);
                continue;
            }

            System.out.println(i);

        }

        integers.removeAll(needRemove);
        System.out.println(integers);



//
//
//
//
////        System.out.println(0|1|2|4);
//
//        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
//        linkedHashMap.put(2, "a");
//        linkedHashMap.put(1, "b");
//        linkedHashMap.put(3, "c");
//        linkedHashMap.put(4, "d");
//
//        Set<Map.Entry<Integer,String>> set = linkedHashMap.entrySet();
//
//        for (Map.Entry entry : set){
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }
//
////        String number = "11.234";
////        String[] numbers = number.split("'.'");
////
////        for (String n : numbers){
////            System.out.println(n);
////        }
    }

    public static long yuan2fen(double amount) {
        return amount % 1.0D == 0.0D?(long)amount * 100L:(long)amount * 100L;
    }

    private static String getMonthFromTransId(String transId) {

        String monthStr = transId.substring(5, 7);

        // 如果是0开头，去掉0
        return monthStr.startsWith("0") ? monthStr.substring(1, monthStr.length()) : monthStr;
    }
}
