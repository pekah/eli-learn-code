package com.eli.main;

import com.eli.bean.Person;

import java.util.*;

/**
 * Created by zhouyilin on 2016/11/13.
 */
public class BeanUtilTest {
    private transient static int a;

    public static void main(String[] args) {

        System.out.println(Integer.valueOf(null));

//        A a1 = new A();
//        A a2 = new A();
//        System.out.println(a1.equals(a2));

    }
}


class A {

    @Override
    public int hashCode() {
        return 1;
    }
}
