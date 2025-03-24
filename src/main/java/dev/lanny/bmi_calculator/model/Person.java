package dev.lanny.bmi_calculator.model;

public class Person {
    private double weight;
    private double height;

    public Person(double weight, double height) {
        validateValue(weight, "El peso debe ser mayor que cero.");
        validateValue(height, "La altura debe ser mayor que cero.");
        this.weight = weight;
        this.height = height;
    }

    private void validateValue(double value, String message) {
        if (value <= 0) {
            throw new IllegalArgumentException(message);
        }
    }

    public double getWeight() { return weight; }
    public double getHeight() { return height; }
}
