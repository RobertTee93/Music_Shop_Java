import Enums.GuitarType;
import Enums.InstrumentType;
import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;


    @Before
    public void setUp(){
        guitar = new Guitar(GuitarType.ELECTRIC, 5, "Ash", 85.99, 120.30);
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.GUITAR, guitar.getType());
    }

    @Test
    public void hasGuitarType(){
        assertEquals(GuitarType.ELECTRIC, guitar.getGuitarType());
    }

    @Test
    public void hasNumberOfStrings(){
        assertEquals(5, guitar.getNumOfStrings());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Ash", guitar.getMaterial());
    }

    @Test
    public void hasCost(){
        assertEquals(85.99, guitar.getCostPrice(), 0.01);
    }

    @Test
    public void hasSell(){
        assertEquals(120.30, guitar.getSellPrice(), 0.01);
    }

    @Test
    public void hasMarkUp(){
        assertEquals(34.31, guitar.markUp(), 0.01);
    }

    @Test
    public void canPlay(){
        assertEquals("Guitar noise...", guitar.play());
    }
}
