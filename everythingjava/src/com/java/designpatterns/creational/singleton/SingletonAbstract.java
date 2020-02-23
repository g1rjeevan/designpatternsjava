package com.java.designpatterns.creational.singleton;

public abstract class SingletonAbstract {
    
    @Override
    protected Object clone(){
        try {
            throw new CloneNotSupportedException();
        } catch (CloneNotSupportedException e) {
            System.out.println(this.getClass() + "::Singleton object cannot be clone, This is despise main objective of Singleton.");
            //e.printStackTrace();
        }
        return null;
    }
}
