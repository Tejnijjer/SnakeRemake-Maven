package org.psnbtech;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.psnbtech.Clock;

class ClockTest {

   private Clock clock;

    @BeforeEach
    void setUp() {
        // Initialize a Clock with 2 cycles per second
        clock = new Clock(2.0f); 
    }

    @Test
    void testClockInitialization() {
        // Check if the initial state is as expected
        assertNotNull(clock);
        assertFalse(clock.isPaused()); // Clock should not be paused initially
        assertEquals(0, clock.peekElapsedCycle()); // No cycles have elapsed at start
    }

    @Test
    void testClockUpdate() {
        // Initially no cycles have elapsed
        clock.update();
        assertTrue(clock.peekElapsedCycle()); // A cycle should have elapsed after calling update
    }

    @Test
    void testPauseClock() {
        // Update and check the state
        clock.update();
        assertTrue(clock.peekElapsedCycle());

        // Pause the clock and update again
        clock.setPaused(true);
        clock.update();
        assertFalse(clock.peekElapsedCycle()); // No new cycles should be added when paused
    }

    @Test
    void testUnpauseClock() {
        // Pause the clock
        clock.setPaused(true);
        clock.update();
        assertFalse(clock.peekElapsedCycle()); // No cycles should have elapsed while paused

        // Unpause the clock and update again
        clock.setPaused(false);
        clock.update();
        assertTrue(clock.peekElapsedCycle()); // New cycle should be added after unpausing
    }

    @Test
    void testHasElapsedCycle() {
        // Test hasElapsedCycle method
        clock.update();
        assertTrue(clock.hasElapsedCycle()); // Should return true since a cycle has elapsed

        // Now call it again, it should return false because the cycle count was decremented
        assertFalse(clock.hasElapsedCycle()); // Should return false after the first call
    }

    @Test
    void testMultipleUpdates() {
        // Perform multiple updates and check the elapsed cycles
        clock.update();
        clock.update();
        clock.update();
        
        // Should have 3 elapsed cycles after 3 updates
        assertTrue(clock.peekElapsedCycle());
        assertEquals(3, clock.hasElapsedCycle() ? 1 : 0); // Should return true after 3 updates
    }
}
