package dev.lanny.bmi_calculator.model;

public enum BMICategory {
    NORMAL("Peso Normal", 18.5, 25);

    private final String description;
    private final double min;
    private final double max;

    BMICategory(String description, double min, double max) {
        this.description = description;
        this.min = min;
        this.max = max;
    }

    public static String getCategory(double bmi) {
        if (bmi >= 18.5 && bmi < 25) {
            return "Peso Normal";
        }
        return "Valor inválido";
    }
}

