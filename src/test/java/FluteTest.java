import Instruments.Flute;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FluteTest {

    Flute flute;

    @Before
    public void setUp(){
        flute = new Flute("Oak", 50, 72.70);
    }

    @Test
    public void hasMaterial(){
        assertEquals("Oak", flute.getMaterial());
    }

    @Test
    public void hasCost(){
        assertEquals(50, flute.getCostPrice(), 0.01);
    }

    @Test
    public void hasSell(){
        assertEquals(72.70, flute.getSellPrice() ,0.01);

    }

    @Test
    public void hasMarkUp(){
        assertEquals(22.70, flute.markUp(), 0.01);
    }

    @Test
    public void canPlay(){
        assertEquals("Flute sound...", flute.play());
    }
}
