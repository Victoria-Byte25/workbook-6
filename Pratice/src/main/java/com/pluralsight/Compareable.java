package com.pluralsight;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LaptopTest {

    @Test
    void testCompareTo() {
        String dave = "dave";
        String alex = "alex";

        int actual = dave.compareTo(alex);
        assertTrue(actual > 0); // "dave" comes after "alex", so result should be positive
    }

    @Test
    void testAlex() {
        String alex = "alex";
        String dave = "dave";

        int actual = alex.compareTo(dave);
        assertTrue(actual < 0); // "alex" comes before "dave", so result should be negative
    }
}
