package com.lastTryRpgGame.startLayer;

public class CharacterService {

    private final ICharacter iCharacter;

    public CharacterService(ICharacter iCharacter) {
        this.iCharacter = iCharacter;
    }

    public void move(Character character){
        System.out.println("move in Service");
        iCharacter.move();
    }

    public void attack(Character character){
        System.out.println("attack in Service");
        iCharacter.attack();
    }

    public void warmUp(Character character){
        move(character);
        attack(character);
    }
}
