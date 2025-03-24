package dev.lanny.bmi_calculator.controller;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BMIControllerTest {

    @Test
    @DisplayName("VAlidate calculate BMI using weight and height correctly")
    void test_Calculate_BMI_From_Controller() {
        BMIController controller = new BMIController();
        double result = controller.calculateBMI(70, 1.75);
        assertThat(result, closeTo(22.86, 0.01));
    }

    @Test
    @DisplayName("Validate return BMI category based on weight and height")
    void test_Get_BMI_Category_From_Controller() {
        BMIController controller = new BMIController();
        String category = controller.getBMICategory(70, 1.75);
        assertThat(category, is("Peso Normal"));
    }

}
