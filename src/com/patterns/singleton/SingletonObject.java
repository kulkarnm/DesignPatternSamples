package com.patterns.singleton;

public class SingletonObject {
    private static SingletonObject ref;
    private SingletonObject()
    {
        // no code req'd
        System.out.println("IN Singleton Instance");
    }
    public static synchronized SingletonObject getSingletonObject()
    {
        if (ref == null)
        {
            ref = new SingletonObject();
        }
        return ref;
    }

    public Object clone() throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException();
    }


} 
