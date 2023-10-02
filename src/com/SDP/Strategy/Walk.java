package com.SDP.Strategy;

public class Walk implements IMovementBehavior{
    @Override
    public void move() {
        System.out.println("Walking.");
    }
}
