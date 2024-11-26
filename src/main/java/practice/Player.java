package practice;

import java.util.LinkedList;
import java.util.List;

public class Player {

    private String nickname;
    private int health;
    private int maxHealth;
    private int positionX;
    private int positionY;
    private List<Item> inventory;

    public Player(String nickname, int maxHealth, int positionX, int positionY) {
        this.nickname = nickname;
        this.maxHealth = maxHealth;
        this.positionY = positionY;
        this.positionX = positionX;
        health = maxHealth;
        inventory = new LinkedList<>();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public List<Item> getInventory() {
        return inventory;
    }

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

    private String getItems(){
        StringBuilder stringBuilder = new StringBuilder();
        for (Item item : inventory) {
            stringBuilder.append("\n   • " + item.toString() + ";");
        }
        return stringBuilder.toString();
    }

    public void addItem(Item item){
        inventory.add(item);
    }

    public void deleteItem(Item item){
        inventory.remove(item);
    }

    public void heal(int hp){
        if (health < maxHealth){
            if ((health + hp) > maxHealth){
                health = maxHealth;
            } else {
                health += hp;
            }
        } else {
            System.out.println("Your health is already on the max level");
        }
    }

    public void takeDamage(int hp){
        health -= hp;
    }
}
