package com.SDP.Strategy;

public class FireBallAttack implements IAttackBehavior {
    @Override
    public void attack() {
        System.out.println("Launches a fireball!");
    }
}
