package Map;

import Party.Party;
import Character.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Quest {
    private String name;
    private ArrayList<Room> rooms;
    private Party party;
    private boolean isStillActive;

    public Quest(String name) {
        this.name = name;
        this.rooms = new ArrayList<Room>();
        this.party = new Party(name);
        this.isStillActive = true;
    }

    public Party getParty() {
        return this.party;
    }

    public void addToParty(Player partyMember) {
        this.party.getMembers().add(partyMember);
    }


}
