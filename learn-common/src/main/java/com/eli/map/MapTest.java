package com.eli.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by elizhou on 2018/7/3.
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = null;

        System.out.println(map);

        System.out.println(map.keySet());

        System.out.println(new ArrayList(map.keySet()));

    }
}
