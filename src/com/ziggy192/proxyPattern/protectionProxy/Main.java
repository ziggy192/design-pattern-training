package com.ziggy192.proxyPattern.protectionProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main
{
    public static void main(String[] args) {
        PersonBean joe = new PersonBeanImpl("joe", "girls");

        PersonBean joeProxy = (PersonBean) Proxy.newProxyInstance(joe.getClass().getClassLoader(), joe.getClass().getInterfaces(),
                new OwnerInvocationHandler(joe));

         joeProxy = (PersonBean) Proxy.newProxyInstance(joe.getClass().getClassLoader(), joe.getClass().getInterfaces(),
                new OwnerInvocationHandler(joeProxy));


        System.out.println(joeProxy);
        joeProxy.setName("nghia");
        try {

            joeProxy.rate(123);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println(joeProxy);
        System.out.println(Proxy.isProxyClass(joe.getClass()));
        System.out.println(Proxy.isProxyClass(joeProxy.getClass()));
    }
}
