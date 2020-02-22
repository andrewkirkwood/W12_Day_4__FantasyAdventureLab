package Character.NonFighting;

import Character.Fighting.Dwarf;
import Healing.HealingTool;

import java.util.ArrayList;



public abstract class NonFightingCharacter extends Player {
    private ArrayList<HealingTool> healingTools;

    public NonFightingCharacter(String name, double defenceMultiplier) {
        super(name, defenceMultiplier);
        this.healingTools = new ArrayList<HealingTool>();
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
