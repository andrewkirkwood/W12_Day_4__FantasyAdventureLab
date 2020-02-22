package Character;

import Arm.Arm;
import Treasure.ITreasurable;

import java.util.ArrayList;

public abstract class FightingCharacter extends Player {

    private double attackMultiplier;
    private double defenceMultiplier;
    private double health;

    public FightingCharacter(String name) {
        super(name);
        this.attackMultiplier = 2;
        super.defenceMultiplier = 2;
        super.health = 100;
    }

    public double getAttackMultiplier() {
        return attackMultiplier;
    }

}
