package com.example.demo;

public interface Vehicle {
    public void move();
    default void hoot() {
        System.out.println("default hoot method from interface!");
    }
}
