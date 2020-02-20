import Arm.Axe;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AxeTest {

    private Axe axe;

    @Before
    public void before(){
        axe = new Axe("Long Arm.Axe", 10);
    }

    @Test
    public void has_name(){
        assertEquals("Long Arm.Axe", axe.getName());
    }

    @Test
    public void has_damage(){
        assertEquals(10, axe.getDamage(), 0.01);
    }
}

