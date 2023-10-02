package com.SDP.Strategy;

public class BowAndArrowAttack implements IAttackBehavior {
    @Override
    public void attack() {
        System.out.println("Shoots with the bow and arrow!");
    }
}
