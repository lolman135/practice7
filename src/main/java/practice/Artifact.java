package practice;

public class Artifact extends Item{
    private final String type;
    private final String artifactName;

    public Artifact(String type, double weight, double price, String artifactName) {
        super(weight, price);
        this.type = type;
        this.artifactName = artifactName;
    }

    @Override
    public String toString() {
        return "Artifact{" +
                "type=" + type +
                ", artifactName=" + artifactName +
                super.toString() +
                '}';
    }
}
