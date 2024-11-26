package practice;

public class Artifact extends Item{
    private final String type;
    private final String artifactName;

    public Artifact(String type, String artifactName, double weight, double price) {
        super(weight, price);
        this.type = type;
        this.artifactName = artifactName;
    }

    @Override
    public String toString() {
        return "Artifact{" +
                "type:" + type +
                ", artifactName:" + artifactName +
                super.toString() +
                '}';
    }
}
