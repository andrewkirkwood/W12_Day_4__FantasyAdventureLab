import java.util.ArrayList;
import java.util.BitSet;

public class Cleric {
    private String name;
    private ArrayList<HealingTool> healingTools;
    private double defenceMultiplier;
    private double health;
    private ArrayList<ITreasurable> treasureList;

    public Cleric(String name) {
        this.name = name;
        this.healingTools = new ArrayList<HealingTool>();
        this.defenceMultiplier = 1;
        this.health = 100;
        this.treasureList = new ArrayList<ITreasurable>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<HealingTool> getHealingTools() {
        return healingTools;
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

    public void increaseHealth(double amount) {
        this.health += amount;
    }


    public ArrayList<ITreasurable> getTreasureList() {
        return this.treasureList;
    }

    public double getTreasureValue() {
        double total = 0;
        for (ITreasurable treasureItem: this.treasureList){
            total += treasureItem.getValue();
        }
        return total;
    }

    public void addTreasure(ITreasurable treasureItem) {
        this.treasureList.add(treasureItem);
    }

    public void heal(Dwarf dwarf, HealingTool healingTool) {
        dwarf.increaseHealth(healingTool.getHealingAmount());
    }

    public void addHealingTool(HealingTool healingTool) {
        this.healingTools.add(healingTool);
    }
}