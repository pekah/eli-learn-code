package com.eli.regex;

import java.util.regex.Pattern;

/**
 * Created by elizhou on 2017/7/10.
 */
public class RegexTest {
    public static void main(String[] args) {
        String email = "xiongzixuan-wh@58ganji.com";
        System.out.println(RegexTest.checkEmailValid(email));
    }

    public static boolean checkEmailValid(String email) {
        String loewEmail = email.toLowerCase();
        return Pattern.matches("^(\\w)+(\\.\\w+)*@(\\w)+((\\.\\w+)+)$", loewEmail);
    }
}
