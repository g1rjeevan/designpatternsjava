package com.java.designpatterns.creational.singleton;

public abstract class SingletonAbstract implements Singleton {
    
    @Override
    protected Object clone(){
        try {
            throw new CloneNotSupportedException();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
