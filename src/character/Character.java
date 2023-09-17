package character;

public class Character {
    private String name;
    private String weapon;
    private int damage;

    public Character(String name, String weapon, int damage) {
        this.name = name;
        this.weapon = weapon;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
