package src.com.essentials.java.design.patterns.factory.classes;

import src.com.essentials.java.design.patterns.factory.interfaces.CFactory;
import src.com.essentials.java.design.patterns.factory.interfaces.Character;

import java.util.ArrayList;
import java.util.List;

public class _Application {
    public List<Character> characters = new ArrayList<>();

    public void build(CFactory factory, String name){
        characters.add(factory.createNewCharacter(name));

    }
    public void print(){
        this.characters.stream().forEach(c -> c.newCharacter());
    }

}
