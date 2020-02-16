package com.java.designpatterns.creational.singleton;

public class MainRunnerProtected {

    public static void main(String[] args) {
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();

        System.out.println("eagerSingleton.hashCode() :" + eagerSingleton.hashCode());

        eagerSingleton = EagerSingleton.getInstance();
        eagerSingleton.clone();
        Singleton singleton = eagerSingleton;
        SingletonAbstract singletonAbstract = (SingletonAbstract) singleton;
        singletonAbstract.clone();

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
