package com.ziggy192.proxyPattern.simpleExample;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.ExportException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {


    public MyRemoteImpl() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException{
        return "Server says, 'Hey'!";
    }

    public static void main(String[] args) throws RemoteException {
        try {
            MyRemote myRemote = new MyRemoteImpl();
            Naming.rebind("RemoteHello", myRemote);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
