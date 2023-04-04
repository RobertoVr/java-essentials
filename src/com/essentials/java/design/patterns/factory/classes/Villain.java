package src.com.essentials.java.design.patterns.factory.classes;

import src.com.essentials.java.design.patterns.factory.interfaces.Character;

public class Villain implements Character {
    private String name;

    public Villain(String name) {
        this.name = name;
    }

    @Override
    public void newCharacter() {
        System.out.println("Hi " + this.name + " to the new Villain!!!");
    }
}
