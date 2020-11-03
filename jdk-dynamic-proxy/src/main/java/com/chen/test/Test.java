package com.chen.test;


import com.chen.service.TestService;
import com.chen.service.serviceImpl.TestServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * User: JINCHENCHEN
 * Date: 2020/11/02
 */
public class Test {
    public static void main(String[] args) {
        TestService service = new TestServiceImpl();
        TestService proxy = (TestService) getProxy(service);
        proxy.doSome();
    }

    public static Object getProxy(final Object target) {
        Object o = Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("方法开始执行......");
                        Object result = method.invoke(target, args);
                        System.out.println("方法执行完毕......");
                        return result;
                    }
                });
        return o;
    }
}
