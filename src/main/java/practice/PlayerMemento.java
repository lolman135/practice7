package practice;

import java.util.LinkedList;
import java.util.List;

public class PlayerMemento {

    private String nickname;
    private int health;
    private int maxHealth;
    private int positionX;
    private int positionY;
    private List<Item> inventory;

    public PlayerMemento(String nickname, int health, int maxHealth, int positionX, int positionY, List<Item> inventory) {
        this.nickname = nickname;
        this.health = health;
        this.maxHealth = maxHealth;
        this.positionX = positionX;
        this.positionY = positionY;
        this.inventory = new LinkedList<>(inventory) ;
    }

    public String getNickname() {
        return nickname;
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public List<Item> getInventory() {
        return inventory;
    }
}
