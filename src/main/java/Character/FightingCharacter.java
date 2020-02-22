package Character;

import Arm.Arm;
import Treasure.ITreasurable;

import java.util.ArrayList;

public abstract class FightingCharacter extends Player {

    private double attackMultiplier;

    public FightingCharacter(String name, double attackMultiplier, double defenceMultiplier) {
        super(name, defenceMultiplier );
        this.attackMultiplier = attackMultiplier;
    }

    public double getAttackMultiplier() {
        return attackMultiplier;
    }

}
