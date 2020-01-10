package com.lastTryRpgGame.startLayer;

public class Hunter implements ICharacter {

    @Override
    public void move() {
        System.out.println("Hunter move");
    }

    @Override
    public Integer attack() {
        System.out.println("Hunter attack");
        return null;
    }
}
