package com.java.designpatterns.creational.singleton;

public class SingletonMainrunner {

    public static void main(String[] args) {
        execution(EagerSingleton.getInstance());
        execution(LazySingleton.getInstance());
        execution(StaticBlockSingleton.getInstance());
        execution(BillPughSingleton.getInstance());

        execution(EagerSingleton.getInstance());
        execution(LazySingleton.getInstance());
        execution(BillPughSingleton.getInstance());
        execution(StaticBlockSingleton.getInstance());

    }

    static void execution(SingletonAbstract singletonAbstract) {
        singletonAbstract.clone();
        System.out.println(singletonAbstract.getClass() + ":: HashCode ::" + singletonAbstract.hashCode());
    }

}
