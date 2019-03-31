import Items.Item;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    private Item item;

    @Before
    public void setUp() throws Exception {
        item = new Item("Drum Sticks", 1.50, 2.45);
    }

    @Test
    public void hasDescription(){
        assertEquals("Drum Sticks", item.getDescription());
    }

    @Test
    public void hasCost(){
        assertEquals(1.50, item.getCostPrice(), 0.01);
    }

    @Test
    public void hasSell(){
        assertEquals(2.45, item.getSellPrice(), 0.01);
    }

    @Test
    public void hasMarkUp(){
        assertEquals(0.95, item.markUp(), 0.01);
    }
}
