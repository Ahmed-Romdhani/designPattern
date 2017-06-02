package com.designpattern;

/**
 * create a Singleton class with Generic type
 * @author Ahmed Romdhani
 * 
 */
public class Singleton {
	static Object instance;

	private Singleton() {
	}

	static public <T> T getInstnace(Class<T> inst) {
		if (instance != null) {
			return (T) instance;
		} else {
			try {
				return inst.newInstance();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}

		}
		return (T) instance;
	}

}
