package com.lastTryRpgGame.startLayer;

public class GeneralCreature extends Character implements ICharacter {

    GeneralCreature(){
        setStr(26);
        setDef(12);
    }

    @Override
    public void move() {
        System.out.println("GeneralCreature move " + getStr()/10);
    }

    @Override
    public Integer attack() {
        System.out.println("GeneralCreature attack " + getStr());
        return null;
    }
}
