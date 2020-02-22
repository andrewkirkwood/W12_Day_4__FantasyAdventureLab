package Map;

import Party.Party;
import Character.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.BitSet;

public class Quest {
    private String name;
    private Party party;
    private ArrayList<Party> enemiesList;
    private ArrayList<Room> rooms;
    private boolean isStillActive;

    public Quest(String name) {
        this.name = name;
        this.party = new Party(name);
        this.enemiesList = new ArrayList<Party>();
        this.rooms = new ArrayList<Room>();
        this.isStillActive = true;
    }

    public Party getParty() {
        return this.party;
    }

    public ArrayList<Room> getRooms() {
        return this.rooms;
    }

    public ArrayList<Party> getEnemiesList() {
        return this.enemiesList;
    }
}
