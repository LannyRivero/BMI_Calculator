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

}
