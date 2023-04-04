package src.com.essentials.java.design.patterns.factory.classes;

import src.com.essentials.java.design.patterns.factory.interfaces.CFactory;
import src.com.essentials.java.design.patterns.factory.interfaces.Character;

import java.util.ArrayList;
import java.util.List;

public class _Application {
    public List<Character> characters = new ArrayList<>();

    public void build(CFactory factory, CharacterProps props) {
        characters.add(factory.createNewCharacter(props));
    }

    public void print() {
        this.characters.stream().forEach(c -> {
            System.out.println("-----> #Character: ");
            c.greetNewCharacter();
            c.getKindAttack();
            c.health();
            c.isArmed();
        });
    }

}
