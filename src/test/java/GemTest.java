import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GemTest {

    private Gem gem;

    @Before
    public void before(){
        gem = new Gem("Ruby", 10);
    }

    @Test
    public void has_name(){
        assertEquals("Ruby", gem.getName());
    }

    @Test
    public void has_value(){
        assertEquals(10, gem.getValue(), 0.01);
    }
}