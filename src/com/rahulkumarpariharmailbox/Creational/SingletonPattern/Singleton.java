package com.rahulkumarpariharmailbox.Creational.SingletonPattern;

public class Singleton {
    private static volatile Singleton instance = null;
    private static int counter = 0;

    private Singleton(){
        /**
         * Protecting refelection class make a instance of our class
         */
        if(instance != null)
            throw new RuntimeException("Use getInstance() method to create");
        System.out.println("Counter Value: " + counter);
    }

    public static Singleton getInstance(){
        /**
         * Double locking to make thread safe
         * https://en.wikipedia.org/wiki/Double-checked_locking
         */
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                    counter++;
                }
            }
        }
        return instance;
    }
}
