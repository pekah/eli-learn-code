package com.eli.dynamic_proxy_validate;

/**
 * Created by zhouyilin on 2017/2/26.
 */
public class UserImpl implements User {

    private String name = null;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void test1() {
        System.out.println("test1");
        test2();
    }

    public void test2() {
        System.out.println("test2");
    }
}
