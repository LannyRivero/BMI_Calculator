package dev.lanny.bmi_calculator.model;

public enum BMICategory {
    NORMAL("Peso Normal", 18.5, 25),
    OVERWEIGHT("Sobrepeso", 25, 30),
    OBESITY_I("Obesidad tipo I", 30, 35),
    OBESITY_II("Obesidad tipo II", 35, 40),
    OBESITY_III("Obesidad tipo III", 40, 60),
    MILD_THINNESS("Delgadez leve", 17, 18.5),
    MODERATE_THINNESS("Delgadez moderada", 16, 17),
    SEVERE_THINNESS("Delgadez severa", 0, 16);

    private final String description;
    private final double min;
    private final double max;

    BMICategory(String description, double min, double max) {
        this.description = description;
        this.min = min;
        this.max = max;
    }

    public static String getCategory(double bmi) {
        if (bmi < 0 || bmi > 60) {
            return "Valor inválido";
        }

        for (BMICategory category : values()) {
            if (bmi >= category.min && bmi < category.max) {
                return category.description;
            }
        }

        return "Valor inválido";
    }

}
