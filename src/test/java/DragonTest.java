import MythicalCreature.Dragon;
import Character.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DragonTest {

    private Dragon dragon;
    private Player enemyDwarf;

    @Before
    public void before(){
        dragon = new Dragon("Eva", 10, 10);
        enemyDwarf = new Dwarf("Jude", 2, 2);
    }

    @Test
    public void can_get_name(){
        assertEquals("Eva", dragon.getName());
    }

    @Test
    public void can_get_attack_multiplier(){
        assertEquals(10, dragon.getAttackMultiplier(), 0.01);
    }

    @Test
    public void can_get_defence_multiplier(){
        assertEquals(10, dragon.getDefenceMultiplier(), 0.01);
    }

    @Test
    public void can_get_health(){
        assertEquals(100, dragon.getHealth(), 0.01);
    }

    @Test
    public void can_reduce_health(){
        dragon.reduceHealth(10);
        assertEquals(90, dragon.getHealth(), 0.01);
    }

    @Test
    public void can_fire_attack(){
        dragon.attack(enemyDwarf);
        assertEquals(50, enemyDwarf.getHealth(), 0.01);
    }

}
