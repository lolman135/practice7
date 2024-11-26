package practice;

public class Weapon extends Item {

    private String type;
    private int damage;

    public Weapon(String type, double weight, double price, int damage) {
        super(weight, price);
        this.type = type;
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "type: " + type +
                super.toString() +
                ", damage: " + damage +
                '}';
    }
}
