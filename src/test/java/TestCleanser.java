import org.junit.Test;
import ua.odessa.bondary.Cleanser;

import static org.junit.Assert.assertEquals;

public class TestCleanser {

    @Test
    public void testNormalize(){

        Cleanser cleanser = new Cleanser();
        String word = "World";
        assertEquals("world",cleanser.normalize(word));

        assertEquals("world corporation",cleanser.normalize("World inc"));
        assertEquals("world corporation",cleanser.normalize("World inc."));
        assertEquals("world limited partner",cleanser.normalize("World l.c."));



    }
}
