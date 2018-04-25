package com.eli.dynamic_proxy_validate;

/**
 * Created by zhouyilin on 2017/2/26.
 */
public class TestUser {

    public static void main(String[] args) {
        User user = UserFactory.create();
//        user.setName(null);
//        user.getName();

        System.out.println("=======");

        /**
         * 只有代理对象proxy直接调用的那个方法才是真正的走代理的
         * test1和test2分开调用时，会走两次动态代理
         * test1的实现里嵌套test2时，只有test1走动态代理
         */
        user.test1();
//        user.test2();

    }
}
