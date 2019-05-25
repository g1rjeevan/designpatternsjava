package com.java.designpatterns;

public class EagerSingleton {
	private static volatile EagerSingleton eagerSingleton = new EagerSingleton();

	private EagerSingleton() {

	}

	public static EagerSingleton getInstance() {
		return eagerSingleton;
	}
}
