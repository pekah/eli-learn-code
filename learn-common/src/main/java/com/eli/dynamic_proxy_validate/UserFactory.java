package com.eli.dynamic_proxy_validate;

import java.lang.reflect.Proxy;

/**
 * Created by zhouyilin on 2017/2/26.
 */
public class UserFactory {

    public static User create(){

        return (User)Proxy.newProxyInstance(User.class.getClassLoader(), new Class[]{User.class}
                , new BussinessValidateNameLengthHandler(new UserImpl()));
    }
}
