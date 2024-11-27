package practice;

import java.util.LinkedList;
import java.util.List;

/**
 * Class {@code PlayerMemento} stores the state of a {@code Player} object.
 * Used to save and restore a player's state via the Memento pattern.
 * Ensures immutability of stored state.
 * @author Kyrylo Kusovskyi
 */
public class PlayerMemento {

    private final String nickname;
    private final int health;
    private final int maxHealth;
    private final int positionX;
    private final int positionY;
    private final List<Item> inventory;

    /**
     * Creates a memento with the specified player attributes.
     * @param nickname player's nickname
     * @param health player's current health
     * @param maxHealth player's maximum health
     * @param positionX X-coordinate
     * @param positionY Y-coordinate
     * @param inventory player's inventory
     */
    public PlayerMemento(String nickname, int health, int maxHealth, int positionX, int positionY, List<Item> inventory) {
        this.nickname = nickname;
        this.health = health;
        this.maxHealth = maxHealth;
        this.positionX = positionX;
        this.positionY = positionY;
        this.inventory = new LinkedList<>(inventory);
    }

    /** @return player's nickname */
    public String getNickname() {
        return nickname;
    }

    /** @return player's current health */
    public int getHealth() {
        return health;
    }

    /** @return player's maximum health */
    public int getMaxHealth() {
        return maxHealth;
    }

    /** @return player's X-coordinate */
    public int getPositionX() {
        return positionX;
    }

    /** @return player's Y-coordinate */
    public int getPositionY() {
        return positionY;
    }

    /** @return copy of the player's inventory */
    public List<Item> getInventory() {
        return inventory;
    }
}
