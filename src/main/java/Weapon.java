public abstract class Weapon implements IArmed {
    private String name;
    private double damage;

    public Weapon(String name, double damage) {
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
