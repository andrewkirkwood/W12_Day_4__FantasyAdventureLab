package Map;

import Character.*;
import Party.Party;
import Treasure.ITreasurable;

import java.util.ArrayList;
import java.util.BitSet;

public class Room {
    private String name;
    private Party enemies;
    private ArrayList<ITreasurable> treasures;
    private boolean active;

    public Room(String name) {
        this.name = name;
        this.enemies = new Party(name);
        this.treasures = new ArrayList<ITreasurable>();
        this.active = true;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Player> getEnemies() {
        return this.enemies.getMembers();
    }

    public void addEnemy(Player enemy) {
        this.enemies.getMembers().add(enemy);
    }

    public void removeEnemy(Player enemy) {
        this.enemies.getMembers().remove(enemy);
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
