package Character;

import Arm.Arm;
import Arm.Spell;
import MythicalCreature.Dragon;
import MythicalCreature.MythicalCreature;

import java.util.ArrayList;
import java.util.BitSet;

public abstract class Spellcaster extends FightingCharacter {
    private ArrayList<Spell> spells;
    private ArrayList<MythicalCreature> mythicalCreatures;

    public Spellcaster(String name, double attackMultiplier, double defenceMultiplier) {
        super(name, attackMultiplier, defenceMultiplier);
        this.spells = new ArrayList<Spell>();
        mythicalCreatures = new ArrayList<MythicalCreature>();
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

    public ArrayList<MythicalCreature> getMythicalCreatures(){
        return this.mythicalCreatures;
    }

    public void addMythicalCreature(MythicalCreature creature){
        this.mythicalCreatures.add(creature);
    }
}
