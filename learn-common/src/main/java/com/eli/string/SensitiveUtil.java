package com.eli.string;

import com.eli.bean.Person;

/**
 * Created by elizhou on 2017/9/25.
 */
public class SensitiveUtil {
    public static String sensitiveMobile(String mobile){
        StringBuffer buffer = new StringBuffer(mobile);
        buffer.replace(3, 7, "****");
        return buffer.toString();
    }

    public static void main(String[] args) {

        Integer i = 126;
        int i2 = 10000;
        Integer i3 = 126;

        System.out.println(i==i3);

    }


}
