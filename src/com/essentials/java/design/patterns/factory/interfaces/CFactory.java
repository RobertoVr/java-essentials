package src.com.essentials.java.design.patterns.factory.interfaces;

import src.com.essentials.java.design.patterns.factory.classes.CharacterProps;

public interface CFactory {
    Character createNewCharacter(CharacterProps props);
}
