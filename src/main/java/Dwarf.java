import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.BitSet;

public class Dwarf {
    private String name;
    private double attackMultiplier;
    private double defenceMultiplier;
    private double health;
    private ArrayList<IArmed> arms;

    public Dwarf(String name) {
        this.name = name;
        this.attackMultiplier = 6;
        this.defenceMultiplier = 8;
        this.health = 100;
        this.arms = new ArrayList<IArmed>();

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

    public ArrayList<IArmed> getArmsList() {
        return this.arms;
    }

    public void addWeapon(IArmed arm) {
        this.arms.add(arm);
    }

    public void reduceHealth(double amount) {
        this.health -= amount;
    }

    public void increaseHealth(double amount) {
        this.health += amount;
    }
}
