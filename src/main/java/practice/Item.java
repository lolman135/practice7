package practice;

/**
 * Class {@code Item} represents an item with weight and price properties.
 * Used in a player's inventory.
 * @author Kyrylo Kusovskyi
 */
public class Item {

    private double weight;
    private double price;

    /**
     * Initializes an item with the specified weight and price.
     * @param weight item weight
     * @param price item price
     */
    public Item(double weight, double price) {
        this.weight = weight;
        this.price = price;
    }

    /** @return item details as a string */
    @Override
    public String toString() {
        return ", weight: " + weight + ", price: " + price;
    }
}
