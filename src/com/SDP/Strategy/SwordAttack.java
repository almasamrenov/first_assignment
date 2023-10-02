package com.SDP.Strategy;

public class SwordAttack implements IAttackBehavior{
    @Override
    public void attack() {
        System.out.println("Attacks with the sword!");
    }
}
