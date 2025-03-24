package dev.lanny.bmi_calculator.model;

public class BMICalculator {
    
    public double calculateBMI(double weight, double height) {
        return weight / Math.pow(height, 2);
    }
}
