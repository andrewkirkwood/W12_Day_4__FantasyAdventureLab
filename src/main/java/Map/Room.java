package Map;

import Character.*;
import Treasure.ITreasurable;

import java.util.ArrayList;
import java.util.BitSet;

public class Room {
    private String name;
    private ArrayList<Player> party;
    private ArrayList<Player> enemies;
    private ArrayList<ITreasurable> treasures;
    private boolean active;

    public Room(String name) {
        this.name = name;
        this.party = new ArrayList<Player>();
        this.enemies = new ArrayList<Player>();
        this.treasures = new ArrayList<ITreasurable>();
        this.active = true;
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


    public ArrayList<Player> getParty() {
        return this.party;
    }

    public void addParty(Player partyMember) {
        this.party.add(partyMember);
    }
}
