package com.lastTryRpgGame.startLayer;

public class Character {

    private Integer str = 10;
    private Integer dex = 10;
    private Integer def = 10;

    public Integer getStr() {
        return str;
    }

    public void setStr(Integer str) {
        this.str = str;
    }

    public Integer getDex() {
        return dex;
    }

    public void setDex(Integer dex) {
        this.dex = dex;
    }

    public Integer getDef() {
        return def;
    }

    public void setDef(Integer def) {
        this.def = def;
    }

    public ICharacter create(){
        return new Warrior();
    }

    public ICharacter createCreature(){
        return new GeneralCreature();
    }

}
