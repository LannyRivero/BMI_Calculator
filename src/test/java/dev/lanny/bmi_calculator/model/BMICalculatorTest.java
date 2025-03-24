package dev.lanny.bmi_calculator.model;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    @DisplayName("Validate throw exception when weight or height is zero or negative")
    void test_Calculate_BMI_Invalid_Values() {
        BMICalculator calculator = new BMICalculator();

        assertThrows(IllegalArgumentException.class, () -> calculator.calculateBMI(0, 1.75));
        assertThrows(IllegalArgumentException.class, () -> calculator.calculateBMI(70, 0));
        assertThrows(IllegalArgumentException.class, () -> calculator.calculateBMI(-70, 1.75));
        assertThrows(IllegalArgumentException.class, () -> calculator.calculateBMI(70, -1.75));
    }

    @Test
    @DisplayName("Validate return BMI category based on BMI value")
    void test_Get_BMI_Category() {
        BMICalculator calculator = new BMICalculator();
        String category = calculator.getBMICategory(22.0);
        assertThat(category, is("Peso Normal"));
    }

}
