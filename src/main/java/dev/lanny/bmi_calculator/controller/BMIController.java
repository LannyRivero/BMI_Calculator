package dev.lanny.bmi_calculator.controller;

import dev.lanny.bmi_calculator.model.BMICalculator;

public class BMIController {

    private final BMICalculator calculator;

    public BMIController() {
        this.calculator = new BMICalculator();
    }

    public double calculateBMI(double weight, double height) {
        return calculator.calculateBMI(weight, height);
    }

}
