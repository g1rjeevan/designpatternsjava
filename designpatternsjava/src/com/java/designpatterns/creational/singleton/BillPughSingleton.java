package com.java.designpatterns.creational.singleton;

public class BillPughSingleton extends SingletonAbstract {
    private BillPughSingleton() {
    }

    public static BillPughSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
}
