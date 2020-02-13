package com.zytrust.junit5.disabled;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

//@Disabled("Disabled until bug #99 has been fixed")
class DisabledDemo {

    @Disabled("Disabled until bug #42 has been resolved")
    @Test
    void testWillBeSkipped() {
		assertEquals(3, 2 + 1);

    }

    @Test
    void testWillBeExecuted() {
		assertEquals(3, 2 + 1);
    }
}