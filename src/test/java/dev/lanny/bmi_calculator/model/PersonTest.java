package dev.lanny.bmi_calculator.model;

import static org.hamcrest.MatcherAssert.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    @DisplayName("Validate  Person Creation")
    void test_Person_Creation() {
        new Person(70.0, 1.75);
    }

    @Test
    @DisplayName("Validate Person Getters")
    void test_Person_Getters() {
        Person person = new Person(70.0, 1.75);

        assertThat(person.getWeight(), is(70.0));
        assertThat(person.getHeight(), is(1.75));
    }

    @Test
    void test_Person_Invalid_Weight_And_Height() {
        assertThrows(IllegalArgumentException.class, () -> new Person(0, 1.75));
        assertThrows(IllegalArgumentException.class, () -> new Person(70.0, 0));
    }
}
