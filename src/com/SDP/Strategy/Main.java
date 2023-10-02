package com.SDP.Strategy;

public class Main {
    public static void main(String[] args) {

        GameCharacter knight = new GameCharacter("knight", new SwordAttack(), new Walk());
        GameCharacter archer = new GameCharacter("archer", new BowAndArrowAttack(), new Run());
        GameCharacter mage = new GameCharacter("mage", new FireBallAttack(), new Teleport());

        System.out.println(knight.getName() + " actions:");
        knight.performAttack();
        knight.move();
        System.out.println(archer.getName() + " actions:");
        archer.performAttack();
        archer.move();
        System.out.println(mage.getName() + " actions");
        mage.performAttack();
        mage.move();
        System.out.println("Changing " + archer.getName() + " attack behavior:");
        archer.setAttackBehavior(new SwordAttack());
        archer.performAttack();
        System.out.println("Changing " + mage.getName() + " movement behavior:");
        mage.setMovementBehavior(new Walk());
        mage.move();
    }
}