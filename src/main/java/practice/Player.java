package practice;

import java.util.LinkedList;
import java.util.List;

/**
 * Class {@code Player} represents a game player with health, position, and inventory.
 * Supports saving and restoring state.
 * @author Kyrylo Kusovskyi
 */
public class Player {

    private String nickname;
    private int health;
    private int maxHealth;
    private int positionX;
    private int positionY;
    private List<Item> inventory;

    /**
     * Initializes a player.
     * @param nickname player's name
     * @param maxHealth maximum health
     * @param positionX X-coordinate
     * @param positionY Y-coordinate
     */
    public Player(String nickname, int maxHealth, int positionX, int positionY) {
        this.nickname = nickname;
        this.maxHealth = maxHealth;
        this.positionY = positionY;
        this.positionX = positionX;
        health = maxHealth;
        inventory = new LinkedList<>();
    }

    /** @return player's nickname */
    public String getNickname() {
        return nickname;
    }

    /** Sets the player's nickname. */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /** @return player's X-coordinate */
    public int getPositionX() {
        return positionX;
    }

    /** Sets the player's X-coordinate. */
    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    /** @return player's Y-coordinate */
    public int getPositionY() {
        return positionY;
    }

    /** Sets the player's Y-coordinate. */
    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    /** @return player's current health */
    public int getHealth() {
        return health;
    }

    /** @return player's maximum health */
    public int getMaxHealth() {
        return maxHealth;
    }

    /** Sets the player's maximum health. */
    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    /** @return player's inventory */
    public List<Item> getInventory() {
        return inventory;
    }

    /**
     * Adds an item to the inventory.
     * @param item item to add
     */
    public void addItem(Item item) {
        inventory.add(item);
    }

    /**
     * Removes an item from the inventory.
     * @param item item to remove
     */
    public void deleteItem(Item item) {
        inventory.remove(item);
    }

    /**
     * Heals the player.
     * @param hp amount to heal
     */
    public void heal(int hp) {
        if (health < maxHealth) {
            health = Math.min(health + hp, maxHealth);
        } else {
            System.out.println("Health is already full.");
        }
    }

    /**
     * Damages the player.
     * @param hp amount of damage
     */
    public void takeDamage(int hp) {
        health -= hp;
    }

    /** @return a memento of the player's state */
    public PlayerMemento save() {
        return new PlayerMemento(nickname, health, maxHealth, positionX, positionY, inventory);
    }

    /**
     * Restores the player's state from a memento.
     * @param memento saved state
     */
    public void restore(PlayerMemento memento) {
        nickname = memento.getNickname();
        health = memento.getHealth();
        maxHealth = memento.getMaxHealth();
        positionX = memento.getPositionX();
        positionY = memento.getPositionY();
        inventory = memento.getInventory();
    }

    /** @return player's details as a string */
    @Override
    public String toString() {
        return "Player{" +
                "\n  nickname: '" + nickname + '\'' +
                "\n  health: " + health +
                "\n  maxHealth: " + maxHealth +
                "\n  positionX: " + positionX +
                "\n  positionY: " + positionY +
                "\n  inventory:" + getItems() +
                "\n}";
    }

    /** @return inventory items as a formatted string */
    private String getItems() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Item item : inventory) {
            stringBuilder.append("\n   • ").append(item.toString()).append(";");
        }
        return stringBuilder.toString();
    }
}
