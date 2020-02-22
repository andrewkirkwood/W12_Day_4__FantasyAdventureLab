package MythicalCreature;
import Character.*;

public class Dragon extends MythicalCreature {


    public Dragon(String name, double attackMultiplier, double defenceMultiplier) {
        super(name, attackMultiplier, defenceMultiplier);
    }


    public void attack(Player enemy){
        enemy.reduceHealth(this.getAttackMultiplier() * 5);
    }


}
