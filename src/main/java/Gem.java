public class Gem implements ITreasurable {
    private String name;
    private double value;

    public Gem(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }
}
