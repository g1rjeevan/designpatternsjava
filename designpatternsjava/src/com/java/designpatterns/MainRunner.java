package com.java.designpatterns;

import com.java.designpatterns.creational.singleton.BillPughSingleton;
import com.java.designpatterns.creational.singleton.EagerSingleton;
import com.java.designpatterns.creational.singleton.LazySingleton;
import com.java.designpatterns.creational.singleton.StaticBlockSingleton;

public class MainRunner {
    public static void main(String[] args) {
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();

        System.out.println("eagerSingleton.hashCode() :" + eagerSingleton.hashCode());

        eagerSingleton = EagerSingleton.getInstance();

        System.out.println("eagerSingleton.hashCode() :" + eagerSingleton.hashCode());

        LazySingleton lazySingleton = LazySingleton.getInstance();

        System.out.println("lazySingleton.hashCode() :" + lazySingleton.hashCode());

        lazySingleton = LazySingleton.getInstance();

        System.out.println("lazySingleton.hashCode() :" + lazySingleton.hashCode());

        StaticBlockSingleton staticBlockSingleton = StaticBlockSingleton.getInstance();

        System.out.println("staticBlockSingleton.hashCode() :" + staticBlockSingleton.hashCode());

        staticBlockSingleton = StaticBlockSingleton.getInstance();

        System.out.println("staticBlockSingleton.hashCode() :" + staticBlockSingleton.hashCode());

        BillPughSingleton billPughSingleton = BillPughSingleton.getInstance();

        System.out.println("billPughSingleton.hashCode() :" + billPughSingleton.hashCode());

        billPughSingleton = BillPughSingleton.getInstance();

        System.out.println("billPughSingleton.hashCode() :" + billPughSingleton.hashCode());

    }

}
