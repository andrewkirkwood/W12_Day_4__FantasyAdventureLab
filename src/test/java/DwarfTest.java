import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    private Dwarf dwarf;
    private IArmed axe;
    @Before
    public void before(){
        dwarf = new Dwarf("Jeff");
        axe = new Axe("Long Axe", 10);
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
        dwarf.addWeapon(axe);
        assertEquals(1, dwarf.getArmsList().size());
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

}
