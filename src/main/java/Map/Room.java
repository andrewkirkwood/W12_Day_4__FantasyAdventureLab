package Map;

import Character.Player;
import Character.Player;

import Treasure.ITreasurable;

import java.util.ArrayList;

public class Room {
    private ArrayList<Player> enemies;
    private ArrayList<ITreasurable> treasures;

    public Room( ArrayList<Player> enemies, ArrayList<ITreasurable> treasures) {
        this.enemies = enemies;
        this.treasures = treasures;
    }


}
