package org.psnbtech;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DirectionTest {

    @Test
    public void testEnumValues() {
        // Test if the Direction enum has the correct values
        assertEquals(Direction.North, Direction.valueOf("North"));
        assertEquals(Direction.East, Direction.valueOf("East"));
        assertEquals(Direction.South, Direction.valueOf("South"));
        assertEquals(Direction.West, Direction.valueOf("West"));
    }

    @Test
    public void testEnumToString() {
        // Test the string representation of each Direction
        assertEquals("North", Direction.North.toString());
        assertEquals("East", Direction.East.toString());
        assertEquals("South", Direction.South.toString());
        assertEquals("West", Direction.West.toString());
    }

    // You could add more tests here if the Direction enum had other methods
}
