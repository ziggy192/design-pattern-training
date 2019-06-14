package com.ziggy192.proxyPattern.protectionProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler {
    private PersonBean personBeanImpl;

    public OwnerInvocationHandler(PersonBean personBeanImpl) {
        this.personBeanImpl = personBeanImpl;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().startsWith("set")) {
           return method.invoke(personBeanImpl, args);
        } else if (method.getName().equalsIgnoreCase("rate")) {
            throw new IllegalAccessException();
        } else if (method.getName().startsWith("get")) {
           return method.invoke(personBeanImpl, args);
        }
        return method.invoke(personBeanImpl, args);
    }
}
