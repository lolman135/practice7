package practice;

import java.util.Stack;

public class SavesHistory {

    private Stack<PlayerMemento> saves = new Stack<>();

    public void createSave(PlayerMemento playerMemento){
        saves.push(playerMemento);
    }

    public PlayerMemento getLastSave() {
        return saves.pop();
    }
}
