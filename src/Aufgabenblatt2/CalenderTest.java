package Aufgabenblatt2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalenderTest {

        Calender cal = new Calender();
    @Test
    void tagGültig() {
            assertTrue(cal.tagGültig(23, 1));
            assertTrue(cal.tagGültig(12, 2));
            assertFalse(cal.tagGültig(8, 26));
            assertFalse(cal.tagGültig(34, 16));

    }
}