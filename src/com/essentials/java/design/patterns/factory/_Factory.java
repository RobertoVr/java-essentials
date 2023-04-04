package src.com.essentials.java.design.patterns.factory;

import src.com.essentials.java.design.patterns.factory.classes.CharacterProps;
import src.com.essentials.java.design.patterns.factory.classes._Application;
import src.com.essentials.java.design.patterns.factory.classes._HeroFactory;
import src.com.essentials.java.design.patterns.factory.classes._VillainFactory;
import src.com.essentials.java.functional.FunctionBase;

import java.util.List;

/*
*
* Define an interface for building products
*
* */
public class _Factory extends FunctionBase {
    @Override
    public void function() {
        _Application game = configCharacters();
        game.print();
    }

    private _Application configCharacters(){
        _Application app = new _Application();

        app.build(new _HeroFactory(), new CharacterProps(10, "hulk", "Hero", "smash"));
        app.build(new _VillainFactory(), new CharacterProps(20, "Venom", "Villain", "Mind Control"));


        return app;

    }

}
