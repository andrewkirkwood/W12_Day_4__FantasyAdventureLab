package MythicalCreature;

import Treasure.ITreasurable;
import Character.*;

import java.util.ArrayList;

public class Ogre extends MythicalCreature {
    private ArrayList<ITreasurable> treasures;

    public Ogre(String name, double attackMultiplier, double defenceMultiplier) {
        super(name, attackMultiplier, defenceMultiplier);
        this.treasures = new ArrayList<ITreasurable>();
    }

    public void attack(Player enemy){
        enemy.reduceHealth(this.getAttackMultiplier() * 3);
    }

    public ArrayList<ITreasurable> getTreasures(){
        return this.treasures;
    }

    public void addTreasure(ITreasurable treasure){
        this.treasures.add(treasure);
    }




}
