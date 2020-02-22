import Character.Fighting.Dwarf;
import MythicalCreature.Ogre;
import Treasure.Gem;
import Treasure.ITreasurable;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OgreTest {
    private Ogre ogre;
    private Dwarf enemyDwarf;
    private ITreasurable treasure;

    @Before
    public void before(){
        ogre = new Ogre("Herby", 10, 10);
        enemyDwarf = new Dwarf("harry", 2, 2);
        treasure = new Gem("Ruby", 10);
    }

    @Test
    public void get_name(){
        assertEquals("Herby", ogre.getName());
    }

    @Test
    public void can_attack(){
        ogre.attack(enemyDwarf);
        assertEquals(70, enemyDwarf.getHealth(),0.01);
    }

    @Test
    public void treasures_start_empty(){
        assertEquals(0, ogre.getTreasures().size());
    }

    @Test
    public void can_add_treasures(){
        ogre.addTreasure(treasure);
        assertEquals(1, ogre.getTreasures().size());
    }
}
