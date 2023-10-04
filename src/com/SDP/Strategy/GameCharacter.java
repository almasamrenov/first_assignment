package com.SDP.Strategy;

public class GameCharacter {
    private String name;
    private IAttackBehavior attackBehavior;
    private IMovementBehavior movementBehavior;

    public GameCharacter(String name, IAttackBehavior attackBehavior, IMovementBehavior movementBehavior) {
        this.name = name;
        this.attackBehavior = attackBehavior;
        this.movementBehavior = movementBehavior;
    }

    public String getName() {
        return name;
    }

    public void setAttackBehavior(IAttackBehavior attackBehavior) {
        this.attackBehavior = attackBehavior;
    }

    public void setMovementBehavior(IMovementBehavior movementBehavior) {
        this.movementBehavior = movementBehavior;
    }

    public void performAttack() {
        attackBehavior.attack();
    }

    public void move() {
        movementBehavior.move();
    }
}
