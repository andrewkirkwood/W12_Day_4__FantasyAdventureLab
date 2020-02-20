package Arm;

public abstract class Arm {
    private String name;
    private double damage;

    public Arm(String name, double damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public double getDamage() {
        return damage;
    }
}
