package MythicalCreature;

public class Dragon {
    private String name;
    private double attackMultiplier;
    private double defenceMultiplier;
    private double health;

    public Dragon(String name, double attackMultiplier, double defenceMultiplier) {
        this.name = name;
        this.attackMultiplier = attackMultiplier;
        this.defenceMultiplier = defenceMultiplier;
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

    public void reduceHealth(double amount) {
        this.health -= amount;
    }
}