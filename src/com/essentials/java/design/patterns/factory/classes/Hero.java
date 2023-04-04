package src.com.essentials.java.design.patterns.factory.classes;

import src.com.essentials.java.design.patterns.factory.interfaces.Character;

public class Hero implements Character {
    private String name;

    public Hero(String name) {

        this.name = name;
    }

    @Override
    public void newCharacter() {
        System.out.println("Hi " + this.name + " to the new Hero!!!");
    }
}
