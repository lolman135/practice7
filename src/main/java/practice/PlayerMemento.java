package practice;

public class PlayerMemento {

    private String saveState;

    public PlayerMemento(String saveState) {
        this.saveState = saveState;
    }

    public String getSaveState() {
        return saveState;
    }
}
