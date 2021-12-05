package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void testInput() {

        App x = new App();
        String txt = x.inString;
        String res = x.countSomeLetter(txt);
        assertEquals("a1", x.countSomeLetter("a"));
        assertEquals("a4d2w3c1r3y1u1", res);

        assertEquals("a4", x.countSomeLetter("aaaa"));
        assertEquals("a4b2", x.countSomeLetter("aaaabb"));

    }

}
