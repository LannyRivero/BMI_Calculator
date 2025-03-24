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

    @Test
    @DisplayName("Validate return 'Overweight' when BMI is between 25 and 30")
    void test_BMICategory_Overweight() {
        assertThat(BMICategory.getCategory(27.0), is("Sobrepeso"));
    }

    @Test
    @DisplayName("Validate return 'Obesity class I' when BMI is between 30 and 35")
    void test_BMICategory_Obesity_I() {
        assertThat(BMICategory.getCategory(32.0), is("Obesidad tipo I"));
    }

    @Test
    @DisplayName("Validate return 'Obesity class II' when BMI is between 35 and 40")
    void test_BMICategory_Obesity_II() {
        assertThat(BMICategory.getCategory(37.0), is("Obesidad tipo II"));
    }

    @Test
    @DisplayName("Validate return 'Obesity class III' when BMI is greater than or equal to 40")
    void test_BMICategory_Obesity_III() {
        assertThat(BMICategory.getCategory(42.0), is("Obesidad tipo III"));
    }

}
