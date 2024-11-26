package practice;

public class Item {

    private double weight;
    private double price;

    public Item(double weight, double price) {
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return ", weight: " + weight + ", price: " + price;
    }
}
