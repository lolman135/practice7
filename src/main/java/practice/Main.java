package practice;

/**
 * {@code Main} class that demonstrates work of pattern;
 * @author Kyrylo Kusovslyi
 */
public class Main {
    /**
     * main method
     * @param args starter arguments for program
     */
    public static void main(String[] args) {
        Player player = new Player("lolman", 100,0, 10);
        Weapon sword = new Weapon("sword", 10.4, 100, 9);
        Artifact sun = new Artifact("fire artifact", "Sun", 10, 1000);
        player.addItem(sword);

        System.out.println(player);

        SavesHistory savesHistory = new SavesHistory();
        savesHistory.createSave(player.save());

        player.takeDamage(20);
        player.setPositionX(10);
        player.addItem(sun);
        System.out.println("\nState after changes: \n" + player);

        savesHistory.createSave(player.save());

        player.heal(13);
        player.setPositionX(player.getPositionX() + 10);
        player.deleteItem(sword);
        System.out.println("\nState after fight:\n" + player);


        player.restore(savesHistory.getLastSave());
        System.out.println("\nState after restoring last save:\n" + player);

        player.restore(savesHistory.getLastSave());
        System.out.println("\nState after restoring initial save:\n" + player);
    }
}
