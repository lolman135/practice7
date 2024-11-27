package practice;

/**
 * Class {@code Artifact} extends {@code Item} to represent a specific type of item with additional properties.
 * @author Kyrylo Kusovskyi
 */
public class Artifact extends Item {
    private final String type;
    private final String artifactName;

    /**
     * Initializes an artifact with the specified attributes.
     * @param type artifact type
     * @param artifactName artifact name
     * @param weight artifact weight
     * @param price artifact price
     */
    public Artifact(String type, String artifactName, double weight, double price) {
        super(weight, price);
        this.type = type;
        this.artifactName = artifactName;
    }

    /** @return artifact details as a string */
    @Override
    public String toString() {
        return "Artifact{" +
                "type:" + type +
                ", artifactName:" + artifactName +
                super.toString() +
                '}';
    }
}
