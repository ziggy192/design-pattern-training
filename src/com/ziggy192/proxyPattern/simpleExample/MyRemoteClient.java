package com.ziggy192.proxyPattern.simpleExample;

import java.rmi.Naming;
import java.rmi.Remote;

public class MyRemoteClient {
    public static void main(String[] args) {
        try {
            MyRemote service = (MyRemote) Naming.lookup("rmi://localhost/RemoteHello");

            String s = service.sayHello();
            System.out.println(s);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
