package com.example.mywebap.mywebappspringboot.Controller;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class DemoDiffblueTest {
    /**
     * Method under test: {@link Demo#show()}
     */
    @Test
    void testShow() {
        // Arrange, Act and Assert
        assertThrows(RuntimeException.class, () -> Demo.show());
    }
}
