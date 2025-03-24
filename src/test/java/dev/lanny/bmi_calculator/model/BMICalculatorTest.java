package dev.lanny.bmi_calculator.model;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.closeTo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BMICalculatorTest {

    @Test
    @DisplayName("Should return BMI value for valid weight and height")
    void test_Calculate_BMI_Valid_Values() {
        BMICalculator calculator = new BMICalculator();
        double bmi = calculator.calculateBMI(70.0, 1.75);
        assertThat(bmi, closeTo(22.86, 0.01)); 
    }

}
