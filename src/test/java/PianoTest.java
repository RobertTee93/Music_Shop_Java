import Enums.InstrumentType;
import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void setUp(){
        piano = new Piano("Mahogany", "White", 250, 299.99);
    }

    @Test
    public void hasType(){
        assertEquals(InstrumentType.PIANO, piano.getType());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Mahogany", piano.getMaterial());
    }

    @Test
    public void hasCost(){
        assertEquals(250, piano.getCostPrice(), 0.01);
    }

    @Test
    public void hasSell(){
        assertEquals(299.99, piano.getSellPrice(), 0.01);
    }

    @Test
    public void canPlay(){
        assertEquals("Piano sound...", piano.play());
    }

    @Test
    public void hasKeyColor(){
        assertEquals("White", piano.getKeyColor());
    }

}
