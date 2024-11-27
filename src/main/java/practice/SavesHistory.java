package practice;

import java.util.Stack;

/**
 * Class {@code SavesHistory} manages a stack of {@code PlayerMemento} objects.
 * Used to store and retrieve the player's saved states.
 * Implements a last-in, first-out (LIFO) system for managing saves.
 * @author Kyrylo Kusovskyi
 */
public class SavesHistory {

    private Stack<PlayerMemento> saves = new Stack<>();

    /**
     * Saves the player's current state.
     * @param playerMemento the player's state to save
     */
    public void createSave(PlayerMemento playerMemento) {
        saves.push(playerMemento);
    }

    /**
     * Retrieves and removes the most recent saved state.
     * @return the last saved {@code PlayerMemento}
     */
    public PlayerMemento getLastSave() {
        return saves.pop();
    }
}
