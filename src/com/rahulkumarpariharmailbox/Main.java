package com.rahulkumarpariharmailbox;

import com.rahulkumarpariharmailbox.Creational.SingletonPattern.Singleton;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Singleton instance = Singleton.getInstance();

        System.out.println(instance);

        Singleton anotherInstance = Singleton.getInstance();

        System.out.println(anotherInstance);

        System.out.println(instance.equals(anotherInstance));
    }
}
