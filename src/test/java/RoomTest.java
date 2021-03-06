import Character.Fighting.Dwarf;
import Character.Fighting.Wizard;
import Character.NonFighting.Cleric;
import Healing.HealingTool;
import Map.Room;
import Treasure.Gem;
import Treasure.ITreasurable;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    private Room room;

    private Wizard enemyWizard;
    private Dwarf enemyDwarf;
    private Cleric enemyCleric;
    private ITreasurable treasureHealth;
    private ITreasurable treasureGem;

    private Wizard partyWizard;

    @Before
    public void before(){
        room = new Room("Loyal Lair");
        enemyWizard = new Wizard("John", 2, 2);
        treasureHealth = new HealingTool("Bread", 10, 1);
        treasureGem = new Gem("Ruby", 10);
        enemyDwarf = new Dwarf("Ron", 2, 2);
        enemyCleric = new Cleric("Bobby", 2);
        partyWizard = new Wizard("Austin", 10, 10);
    }

    @Test
    public void room_has_name(){
        assertEquals("Loyal Lair", room.getName());
    }

    @Test
    public void enemies_starts_empty(){
        assertEquals(0, room.getEnemies().size());
    }

    @Test
    public void can_add_a_WIZARD(){
        room.addEnemy(enemyWizard);
        assertEquals(1, room.getEnemies().size());
    }

    @Test
    public void can_add_a_dwarf(){
        room.addEnemy(enemyDwarf);
        assertEquals(1, room.getEnemies().size());
    }

    @Test
    public void can_add_cleric_to_enemies(){
        room.addEnemy(enemyCleric);
        assertEquals(1, room.getEnemies().size());
    }

    @Test
    public void can_remove_an_enemy(){
        room.addEnemy(enemyWizard);
        room.removeEnemy(enemyWizard);
        assertEquals(0, room.getEnemies().size());
    }

    @Test
    public void starts_with_no_treasure(){
        assertEquals(0, room.getTreasures().size());
    }

    @Test
    public void can_add_health_treasure(){
        room.addTreasure(treasureHealth);
        assertEquals(1, room.getTreasures().size());
        assertEquals(true, room.getTreasures().contains(treasureHealth));
    }

    @Test
    public void can_add_gem_treasure(){
        room.addTreasure(treasureGem);
        assertEquals(1, room.getTreasures().size());
        assertEquals(true, room.getTreasures().contains(treasureGem));
    }

    @Test
    public void can_remove_treasure(){
        room.addTreasure(treasureGem);
        room.addTreasure(treasureHealth);
        room.removeTreasure(treasureGem);
        assertEquals(1, room.getTreasures().size());
        assertEquals(false, room.getTreasures().contains(treasureGem));
    }

}
