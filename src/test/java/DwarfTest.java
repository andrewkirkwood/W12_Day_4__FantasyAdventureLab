import Arm.Axe;
import Arm.Weapon;
import Treasure.Gem;
import org.junit.Before;
import org.junit.Test;
import Character.*;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    private Dwarf dwarf;
    private Weapon axe;
    private Gem gem;

    @Before
    public void before(){
        dwarf = new Dwarf("Jeff");
        axe = new Axe("Long Arm.Axe", 10);
        gem = new Gem("Ruby", 10);

    }
    @Test
    public void can_get_name(){
        assertEquals("Jeff", dwarf.getName());
    }

    @Test
    public void starts_with_full_health(){
        assertEquals(100, dwarf.getHealth(), 0.01);
    }

    @Test
    public void has_attack_multiplier(){
        assertEquals(6, dwarf.getAttackMultiplier(), 0.01);
    }

    @Test
    public void has_defence_multiplier(){
        assertEquals(8, dwarf.getDefenceMultiplier(), 0.01);
    }

    @Test
    public void has_a_weapon(){
        dwarf.addArm(axe);
        assertEquals(1, dwarf.getArmList().size());
    }

    @Test
    public void can_lose_health(){
        dwarf.reduceHealth(3);
        assertEquals(97, dwarf.getHealth(), 0.01);
    }

    @Test
    public void can_increase_health(){
        dwarf.increaseHealth(5);
        assertEquals(105, dwarf.getHealth(),0.01);
    }

    @Test
    public void treasure_starts_empty(){
        assertEquals(0, dwarf.getTreasureList().size());
    }

    @Test
    public void can_accept_treasure(){
        dwarf.addTreasure(gem);
        assertEquals(10, dwarf.getTreasureValue(), 0.01);
        assertEquals(1, dwarf.getTreasureList().size());
    }





}
