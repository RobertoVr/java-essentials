package src.com.essentials.java.design.patterns.factory.classes;

import src.com.essentials.java.design.patterns.factory.interfaces.Character;

public class Hero implements Character {
    private CharacterProps props;

    public Hero(CharacterProps props) {

        this.props = props;
    }

    @Override
    public void greetNewCharacter() {
        System.out.println("Hi " + this.props.getName() + " the new Hero!!!");
    }

    @Override
    public void health() {
        System.out.println("Health " + ("❤".repeat((int) this.props.getHealth())));
    }

    @Override
    public void getKindAttack() {
        System.out.println("Main attack: " + this.props.getMainAttack() + " !!!!!!!!!");
    }

    @Override
    public void isArmed() {
        System.out.println("Heroes does not use weapons...!!");
    }
}
