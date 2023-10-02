package com.SDP.Strategy;

public class Run implements IMovementBehavior {
    @Override
    public void move() {
        System.out.println("Running.");
    }
}
