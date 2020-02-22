package Character;

import Treasure.ITreasurable;

import java.util.ArrayList;

public abstract class Player {
    protected String name;
    protected double defenceMultiplier;
    protected double health;
    protected ArrayList<ITreasurable> treasureList;

    public Player(String name, double deferenceMultiplier) {
        this.name = name;
        this.defenceMultiplier = deferenceMultiplier;
        this.health = 100;
        this.treasureList = new ArrayList<ITreasurable>();
    }

    public String getName() {
        return name;
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
}
