package Map;

import Character.*;
import Treasure.ITreasurable;

import java.util.ArrayList;

public class Room {
    private String name;
    private ArrayList<Player> enemies;
    private ArrayList<ITreasurable> treasures;

    public Room(String name) {
        this.name = name;
        this.enemies = new ArrayList<Player>();
        this.treasures = new ArrayList<ITreasurable>();
    }

    public String getName() {
        return this.name;
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

    public void removeEnemy(Player enemy) {
        this.enemies.remove(enemy);
    }


}
