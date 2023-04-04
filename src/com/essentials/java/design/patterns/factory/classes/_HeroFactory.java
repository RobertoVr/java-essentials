package src.com.essentials.java.design.patterns.factory.classes;

import src.com.essentials.java.design.patterns.factory.interfaces.CFactory;
import src.com.essentials.java.design.patterns.factory.interfaces.Character;

public class _HeroFactory implements CFactory {

    @Override
    public Character createNewCharacter (CharacterProps props) {
        return new Hero(props);
    }
}
