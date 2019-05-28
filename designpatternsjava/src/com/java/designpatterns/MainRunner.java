package com.java.designpatterns;

import com.java.designpatterns.creational.singleton.EagerSingleton;

public class MainRunner {
    public static void main(String[] args) {
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();

        System.out.println("eagerSingleton.hashCode() :" + eagerSingleton.hashCode());

        eagerSingleton = EagerSingleton.getInstance();

        System.out.println("eagerSingleton.hashCode() :" + eagerSingleton.hashCode());

        EagerSingleton eagerSingleton_ = EagerSingleton.getInstance();

        System.out.println("eagerSingleton_.hashCode() :" + eagerSingleton_.hashCode());

        eagerSingleton_ = EagerSingleton.getInstance();

        System.out.println("eagerSingleton_.hashCode() :" + eagerSingleton_.hashCode());

    }
}
