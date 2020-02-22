package Character;

import Arm.Arm;
import Arm.Weapon;

import java.util.ArrayList;

public abstract class Warrior extends FightingCharacter {
    private ArrayList<Arm> arms;

    public Warrior(String name) {
        super(name);
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
        enemy.reduceHealth(

                        (currentWeapon.getDamage()*this.getAttackMultiplier())/enemy.defenceMultiplier
        );
    }

}
