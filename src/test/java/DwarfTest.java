import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    private Dwarf dwarf;
    @Before
    public void before(){
        dwarf = new Dwarf("Jeff");
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

//    @Test
//    public void has_a_weapon(){
//        assertEquals();
//    }


}
