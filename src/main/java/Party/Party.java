package Party;
import Character.*;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;

public class Party {
    private String name;
    private ArrayList<Player> members;

    public Party(String name) {
        this.name = name;
        this.members = new ArrayList<Player>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Player> getMembers() {
        return members;
    }


    public void addMember(Player player) {
        this.members.add(player);
    }

    public double getTotalHealth() {
        double total = 0;
        for (Player member : this.members){
            total += member.getHealth();
        }
        return total;
    }

    public Boolean getPlayingStatus() {
        if (this.getTotalHealth() >= 1){
            return true;
        }
        else {
            return false;
        }
    }
}
