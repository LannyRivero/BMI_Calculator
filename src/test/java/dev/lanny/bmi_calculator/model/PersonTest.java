package dev.lanny.bmi_calculator.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    @DisplayName("Validate  Person Creation")
    void test_Person_Creation() {
        new Person(70.0, 1.75); 
    }
}
