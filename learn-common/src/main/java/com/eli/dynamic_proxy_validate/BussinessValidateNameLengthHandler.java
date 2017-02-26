package com.eli.dynamic_proxy_validate;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by zhouyilin on 2017/2/26.
 */
public class BussinessValidateNameLengthHandler implements InvocationHandler {

    private Object delegate = null;

    public BussinessValidateNameLengthHandler(Object delegate){
        this.delegate = delegate;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        this.check(args);

        Object retVal = null;
        try {
            retVal = method.invoke(delegate, args);
        } catch (InvocationTargetException ite) {
            /* the method invocation threw an exception, so "unwrap" and
               throw.
            */
            throw ite.getTargetException();
        }

        return retVal;
    }

    private void check(Object[] args){

        if (null != args){
            for (int i = 0; i < args.length; i++){
                if(null == args[i]){
                    throw new NullPointerException();
                }
            }
        }

    }
}
