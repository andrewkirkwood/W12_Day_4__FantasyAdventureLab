package Map;

import Character.Player;
import Character.Player;

import Treasure.ITreasurable;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.BitSet;

public class Room {
    private ArrayList<Player> enemies;
    private ArrayList<ITreasurable> treasures;

    public Room() {
        this.enemies = new ArrayList<Player>();
        this.treasures = new ArrayList<ITreasurable>();
    }


    public ArrayList<Player> getEnemies() {
        return this.enemies;
    }

    public void addEnemy(Player enemy) {
        this.enemies.add(enemy);
    }

    public ArrayList<ITreasurable> getTreasures() {
        return this.treasures;
    }

    public void addTreasure(ITreasurable treasure) {
        this.treasures.add(treasure);
    }

    public void removeTreasure(ITreasurable treasure) {
        this.treasures.remove(treasure);
    }
}
