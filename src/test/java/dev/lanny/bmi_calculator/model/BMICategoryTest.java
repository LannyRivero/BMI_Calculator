package dev.lanny.bmi_calculator.model;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BMICategoryTest {

    
    @Test
    @DisplayName("Validate return'Normal weight' when BMI is between 18.5 and 25")
    void test_BMICategory_Normal() {
        assertThat(BMICategory.getCategory(22.0), is("Peso Normal"));
    }

}
