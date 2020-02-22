package Character;

import Arm.Arm;
import Arm.Spell;

import java.util.ArrayList;

public abstract class Spellcaster extends FightingCharacter {
    private ArrayList<Spell> spells;

    public Spellcaster(String name, double attackMultiplier, double defenceMultiplier) {
        super(name, attackMultiplier, defenceMultiplier);
        this.spells = new ArrayList<Spell>();
    }
    public ArrayList<Spell> getSpellList() {
        return this.spells;
    }

    public void addSpell(Spell spell) {
        this.spells.add( spell);
    }

    public Spell getSpellByName(String name){
        for (Spell spell : this.spells){
            if (spell.getName() == name){
                return spell;
            }
        }
        return null;
    }


    public void castSpell(Player enemy) {
        Spell currentSpell = this.getSpellList().get(0);
        enemy.reduceHealth((currentSpell.getDamage()*this.getAttackMultiplier())/enemy.getDefenceMultiplier());
    }
}
