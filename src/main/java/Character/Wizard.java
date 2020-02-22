package Character;

import Arm.Spell;

import java.util.ArrayList;

public class Wizard extends Spellcaster {

    private ArrayList<Spell> spellList;

    public Wizard(String name, double attackMultiplier, double defenceMultiplier) {
        super(name, attackMultiplier, defenceMultiplier);
    }

}
