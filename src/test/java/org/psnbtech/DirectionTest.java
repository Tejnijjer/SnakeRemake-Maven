package org.psnbtech;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import org.psnbtech.Direction;

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

        fail("Intentional failure to demonstrate Jenkins build failure.");

    }


}
