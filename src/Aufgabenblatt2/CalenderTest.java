package Aufgabenblatt2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalenderTest {

    Kalender cal;

    @BeforeEach
    void setUp() {
        cal = new Kalender();
    }

    @AfterEach
    void tearDown() {
        cal = null;
    }

    @Test
    void tagGültig() {
        assertTrue(cal.tagGültig(23, 1));
        assertTrue(cal.tagGültig(12, 2));
        assertFalse(cal.tagGültig(8, 26));
        assertFalse(cal.tagGültig(34, 16));
    }
}