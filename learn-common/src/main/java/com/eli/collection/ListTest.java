package com.eli.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by elizhou on 2018/7/3.
 */
public class ListTest {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("h", "e");

        List<String> list2 = Arrays.asList("h", "e");

        System.out.println(list1.equals(list2));
        System.out.println(list1 == list2);
    }
}
