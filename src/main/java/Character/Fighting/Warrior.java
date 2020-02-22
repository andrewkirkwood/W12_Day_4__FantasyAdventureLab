package Character.Fighting.FightingCharacter;
package Character.Player;
import Arm.Arm;

import java.util.ArrayList;

public abstract class Warrior extends Character.Player.FightingCharacter {
    private ArrayList<Arm> arms;

    public Warrior(String name, double attackMultiplier, double defenceMultiplier) {
        super(name, attackMultiplier, defenceMultiplier);
        this.arms = new ArrayList<Arm>();
    }

    public ArrayList<Arm> getArmList() {
        return this.arms;
    }

    public void addArm(Arm arm) {
        this.arms.add(arm);
    }

    public void attack(Player enemy){
        Arm currentWeapon = this.arms.get(0);
        if (enemy.getHealth() > 1){
            enemy.reduceHealth(
                (currentWeapon.getDamage()*this.getAttackMultiplier())/enemy.defenceMultiplier);
        }

    }

}
