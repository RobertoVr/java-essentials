package src.com.essentials.java.design.patterns.factory.classes;

import src.com.essentials.java.design.patterns.factory.interfaces.Character;

public class Villain implements Character {
    private CharacterProps props;

    public Villain(CharacterProps props) {

        this.props = props;
    }

    @Override
    public void greetNewCharacter() {
        System.out.println("Hi " + this.props.getName() + " the new Villain!!!");
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
        System.out.println("Villains does not use weapons...!!");
    }
}
