import Healing.HealingTool;
import Treasure.Gem;
import org.junit.Before;
import org.junit.Test;
import Character.*;

import static org.junit.Assert.assertEquals;

public class ClericTest {
    private Cleric cleric;
    private HealingTool healingTool;
    private Gem gem;
    private Dwarf dwarf;

    @Before
    public void before(){
        cleric = new Cleric("Bob", 1);
        healingTool = new HealingTool("bread", 10, 10);
        gem = new Gem("Ruby", 10);
        dwarf = new Dwarf("Jeff", 2, 2);

    }

    @Test
    public void has_name(){
        assertEquals("Bob", cleric.getName());
    }

    @Test
    public void starts_with_full_health(){
        assertEquals(100, cleric.getHealth(), 0.01);
    }

    @Test
    public void has_defence_multiplier(){
        assertEquals(1, cleric.getDefenceMultiplier(), 0.01);
    }

    @Test
    public void can_lose_health(){
        cleric.reduceHealth(3);
        assertEquals(97, cleric.getHealth(), 0.01);
    }

    @Test
    public void can_increase_health(){
        cleric.increaseHealth(5);
        assertEquals(105, cleric.getHealth(),0.01);
    }

    @Test
    public void treasure_starts_empty(){
        assertEquals(0, cleric.getTreasureList().size());
    }

    @Test
    public void can_accept_treasure(){
        cleric.addTreasure(gem);
        assertEquals(10, cleric.getTreasureValue(), 0.01);
        assertEquals(1, cleric.getTreasureList().size());
    }

    @Test
    public void can_heal_dwarf(){
        cleric.addHealingTool(healingTool);
        cleric.heal(dwarf, healingTool);
        assertEquals(110, dwarf.getHealth(), 0.01);
        assertEquals(0, cleric.getHealingTools().size());
    }

    @Test
    public void healing_tools_start_empty(){
        assertEquals(0, cleric.getHealingTools().size());
    }

    @Test
    public void can_add_healing_tool(){
        cleric.addHealingTool(healingTool);
        assertEquals(1, cleric.getHealingTools().size());
    }

}
