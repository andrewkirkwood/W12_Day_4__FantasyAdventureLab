public class Dwarf {
    private String name;
    private double attackMultiplier;
    private double defenceMultiplier;
    private double health;

    public Dwarf(String name) {
        this.name = name;
        this.attackMultiplier = 6;
        this.defenceMultiplier = 8;
        this.health = 100;
    }

    public String getName() {
        return name;
    }

    public double getAttackMultiplier() {
        return attackMultiplier;
    }

    public double getDefenceMultiplier() {
        return defenceMultiplier;
    }

    public double getHealth() {
        return health;
    }
}
