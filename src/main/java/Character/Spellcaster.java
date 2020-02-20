package Character;

import Arm.Arm;
import Arm.Spell;

import java.util.ArrayList;

public class Spellcaster extends FightingCharacter {
    private ArrayList<Spell> spells;

    public Spellcaster(String name) {
        super(name);
        this.spells = new ArrayList<Spell>();
    }
    public ArrayList<Spell> getSpellList() {
        return this.spells;
    }

    public void addSpell(Spell spell) {
        this.spells.add( spell);
    }


}
