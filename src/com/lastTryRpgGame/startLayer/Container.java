package com.lastTryRpgGame.startLayer;

public class Container {

    public static void main(String[] args) {

        System.out.println("Hello, First RPG Game !!!");

        Character charToPlay = new Character();
        CharacterService createdCharacter = new CharacterService(charToPlay.create());

        createdCharacter.warmUp(charToPlay);

        CharacterService createdCreature = new CharacterService(charToPlay.createCreature());

        createdCreature.warmUp(charToPlay);


    }

}
