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

    @Test
    @DisplayName("VAlidate return 'Mild thinness' when BMI is between 17 and 18.5")
    void test_BMICategory_Mild_Thinness() {
        assertThat(BMICategory.getCategory(17.5), is("Delgadez leve"));
    }

    @Test
    @DisplayName("Validate return 'Moderate thinness' when BMI is between 16 and 17")
    void test_BMICategory_Moderate_Thinness() {
        assertThat(BMICategory.getCategory(16.5), is("Delgadez moderada"));
    }

    @Test
    @DisplayName("Validate return 'Severe thinness' when BMI is less than 16")
    void test_BMICategory_Severe_Thinness() {
        assertThat(BMICategory.getCategory(15.0), is("Delgadez severa"));
    }

    @Test
    @DisplayName("Validate return 'Invalid value' when BMI is negative or unrealistic")
    void test_BMICategory_Invalid() {
        assertThat(BMICategory.getCategory(-3.0), is("Valor inválido"));
        assertThat(BMICategory.getCategory(1000.0), is("Valor inválido"));
    }

}
