package com.example.demo;

public class VehicleIml implements Vehicle {

    @Override
    public void move() {
      System.out.println("App running");
    }
    
    @Override
    public void hoot() {
       
        Vehicle.super.hoot();
    }
}
