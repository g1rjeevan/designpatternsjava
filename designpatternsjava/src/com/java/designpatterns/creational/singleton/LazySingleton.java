package com.java.designpatterns.creational.singleton;

public class LazySingleton {
    private static volatile LazySingleton instance = null;

    // private constructor
    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            //Due to static method 'this' can be passed into synchronized
            synchronized (LazySingleton.class) {
                //Double checking if multiple threads race to create instance.
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

    /*  Singleton with lazy initialization      */

/*    In computer programming, lazy initialization is the tactic of delaying the creation of an object,
    the calculation of a value, or some other expensive process, until the first time it is needed.
    In a singleton pattern, it restricts the creation of the instance until it is requested for first time.

    On the first invocation, the above method will check if the instance is already created using the instance variable.
    If there is no instance i.e. the instance is null, it will create an instance and will return its reference.
    If the instance is already created, it will simply return the reference of the instance.
    But, this method also has its own drawbacks. Let’s see how. Suppose there are two threads T1 and T2.
    Both come to create the instance and check if “instance==null”.
    Now both threads have identified instance variable as null thus they both assume they must create an instance.
    They sequentially go into a synchronized block and create the instances.
    In the end, we have two instances in our application.
    This error can be solved using double-checked locking.
    This principle tells us to recheck the instance variable again in a synchronized block as given above.*/

}
