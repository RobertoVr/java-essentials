package src.com.essentials.java.design.patterns.factory.classes;

public class CharacterProps {
    private long health;
    private String name;
    private String type;
    private String mainAttack;

    public CharacterProps(long health, String name, String type, String mainAttack) {
        this.health = health;
        this.name = name;
        this.type = type;
        this.mainAttack = mainAttack;
    }

    public long getHealth() {
        return health;
    }

    public void setHealth(long health) {
        this.health = health;
    }

    public String getType() {
        return type;
    }

    public String getMainAttack() {
        return mainAttack;
    }

    public void setMainAttak(String mainAttack) {
        this.mainAttack = mainAttack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String isType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
