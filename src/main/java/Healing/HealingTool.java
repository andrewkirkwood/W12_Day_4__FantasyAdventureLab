package Healing;

import Treasure.ITreasurable;

public class HealingTool implements ITreasurable {
    private String name;
    private double healingAmount;
    private double valueCost;

    public String getName() {
        return name;
    }

    public double getHealingAmount() {
        return healingAmount;
    }

    public HealingTool(String name, double healingAmount, double valueCost) {
        this.name = name;
        this.healingAmount = healingAmount;
        this.valueCost = valueCost;
    }

    public double getValue() {
        return valueCost;
    }
}
