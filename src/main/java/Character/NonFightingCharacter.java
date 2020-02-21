package Character;

import Healing.HealingTool;
import Treasure.ITreasurable;

import java.util.ArrayList;



public abstract class NonFightingCharacter extends Player {
    private ArrayList<HealingTool> healingTools;
    private double defenceMultiplier;
    private double health;

    public NonFightingCharacter(String name) {
        super(name);
        this.healingTools = new ArrayList<HealingTool>();
        super.defenceMultiplier = 1;
        super.health = 100;
    }

    public ArrayList<HealingTool> getHealingTools() {
        return healingTools;
    }

    public void heal(Dwarf dwarf, HealingTool healingTool) {
        if (this.healingTools.contains(healingTool)){
            dwarf.increaseHealth(healingTool.getHealingAmount());
            this.healingTools.remove(healingTool);
        }
    }

    public void addHealingTool(HealingTool healingTool) {
        this.healingTools.add(healingTool);
    }

}
