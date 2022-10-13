package flower_store;

public enum FlowerColor {
    RED("#FF0000"), GREEN("#00FF00"), BLUE("#0000FF");
    private final String stringRepresentation;
    FlowerColor(String stringrepresentation) {
        this.stringRepresentation = stringrepresentation;
    }
}
