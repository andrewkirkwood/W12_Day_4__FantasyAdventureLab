import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealingToolTest {
    private HealingTool healingTool;

    @Before
    public void before(){
        healingTool = new HealingTool("bread", 10);
    }

    @Test
    public void can_get_name(){
        assertEquals("bread", healingTool.getName());
    }

    @Test
    public void can_get_value(){
        assertEquals(10, healingTool.getHealingAmount(), 0.01);
    }
}
