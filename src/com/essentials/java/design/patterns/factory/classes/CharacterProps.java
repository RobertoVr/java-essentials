package src.com.essentials.java.design.patterns.factory.classes;

public class CharacterProps {
    private long health;
    private String name;
    private boolean type;

    public CharacterProps(long health, String name, boolean type) {
        this.health = health;
        this.name = name;
        this.type = type;
    }

    public long getHealth() {
        return health;
    }

    public void setHealth(long health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }
}
