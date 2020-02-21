import Map.Room;
import Character.Player;
import Treasure.ITreasurable;
import org.junit.Before;

import java.util.ArrayList;

public class RoomTest {

    private Room room;
    private ArrayList<Player> enemies;
    private ArrayList<ITreasurable> treasures;

    private Player playerWizard;
    private Player playerDwarf;

    @Before
    public void before(){
        room = new Room( enemies, treasures);
    }

}
