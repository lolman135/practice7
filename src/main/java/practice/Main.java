package practice;

public class Main {

    public static void main(String[] args) {
        Player player = new Player("lolman", 100,10, 10);
        Weapon sword = new Weapon("sword", 10.4, 100, 9);
        player.addItem(sword);
        System.out.println(player);
    }
}
