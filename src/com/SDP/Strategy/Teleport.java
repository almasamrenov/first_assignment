package com.SDP.Strategy;

public class Teleport implements IMovementBehavior{
    @Override
    public void move() {
        System.out.println("Teleporting.");
    }
}
