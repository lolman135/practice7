package practice;

/**
 * Class {@code Weapon} extends {@code Item} to represent a weapon with specific attributes like type and damage.
 * Used in a player's inventory or combat scenarios.
 * @author Kyrylo Kusovskyi
 */
public class Weapon extends Item {

    private String type;
    private int damage;

    /**
     * Initializes a weapon with the specified attributes.
     * @param type weapon type
     * @param weight weapon weight
     * @param price weapon price
     * @param damage weapon damage
     */
    public Weapon(String type, double weight, double price, int damage) {
        super(weight, price);
        this.type = type;
        this.damage = damage;
    }

    /** @return weapon details as a string */
    @Override
    public String toString() {
        return "Weapon{" +
                "type: " + type +
                super.toString() +
                ", damage: " + damage +
                '}';
    }
}
