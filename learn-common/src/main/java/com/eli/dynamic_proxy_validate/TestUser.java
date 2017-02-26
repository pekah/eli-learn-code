package com.eli.dynamic_proxy_validate;

/**
 * Created by zhouyilin on 2017/2/26.
 */
public class TestUser {

    public static void main(String[] args) {
        User user = UserFactory.create();
        user.setName(null);
        user.getName();

    }
}
