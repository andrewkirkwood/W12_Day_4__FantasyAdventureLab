import java.util.ArrayList;

public abstract class FightingCharacter {

    private String name;
    private double attackMultiplier;
    private double defenceMultiplier;
    private double health;
    private ArrayList<IArmed> arms;
    private ArrayList<ITreasurable> treasureList;


    public FightingCharacter(String name) {
        this.name = name;
        this.attackMultiplier = 6;
        this.defenceMultiplier = 8;
        this.health = 100;
        this.arms = new ArrayList<IArmed>();
        this.treasureList = new ArrayList<ITreasurable>();

    }

    public String getName() {
        return name;
    }

    public double getAttackMultiplier() {
        return attackMultiplier;
    }

    public double getDefenceMultiplier() {
        return defenceMultiplier;
    }

    public double getHealth() {
        return health;
    }

    public ArrayList<IArmed> getArmsList() {
        return this.arms;
    }

    public void addWeapon(IArmed arm) {
        this.arms.add(arm);
    }

    public void reduceHealth(double amount) {
        this.health -= amount;
    }

    public void increaseHealth(double amount) {
        this.health += amount;
    }

    public ArrayList<ITreasurable> getTreasureList() {
        return this.treasureList;
    }

    public double getTreasureValue() {
        double total = 0;
        for (ITreasurable treasureItem: this.treasureList){
            total += treasureItem.getValue();
        }
        return total;
    }

    public void addTreasure(ITreasurable treasureItem) {
        this.treasureList.add(treasureItem);
    }
}
