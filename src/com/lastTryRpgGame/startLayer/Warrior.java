package com.lastTryRpgGame.startLayer;

public class Warrior extends Character implements ICharacter {

    Warrior (){
        setStr(18);
        setDef(15);
    }

    @Override
    public void move() {
        System.out.println("Warrior move " + getStr()/10);
    }

    @Override
    public Integer attack() {
        System.out.println("Warrior attack " + getStr());
        return null;
    }
}
