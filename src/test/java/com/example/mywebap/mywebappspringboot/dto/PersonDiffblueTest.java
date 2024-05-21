package com.example.mywebap.mywebappspringboot.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PersonDiffblueTest {
    /**
     * Methods under test:
     * <ul>
     *   <li>{@link Person#setFname(String)}
     *   <li>{@link Person#setLname(String)}
     *   <li>{@link Person#toString()}
     *   <li>{@link Person#getFname()}
     *   <li>{@link Person#getLname()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange
        Person person = new Person();

        // Act
        person.setFname("Fname");
        person.setLname("Lname");
        String actualToStringResult = person.toString();
        String actualFname = person.getFname();

        // Assert that nothing has changed
        assertEquals("Fname", actualFname);
        assertEquals("Lname", person.getLname());
        assertEquals("Person [fname=Fname, lname=Lname]", actualToStringResult);
    }
}
