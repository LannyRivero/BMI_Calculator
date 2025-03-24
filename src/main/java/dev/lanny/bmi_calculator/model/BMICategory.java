package dev.lanny.bmi_calculator.model;

public enum BMICategory {
    NORMAL("Peso Normal", 18.5, 25),
    OVERWEIGHT("Sobrepeso", 25, 30),
    OBESITY_I("Obesidad tipo I", 30, 35),
    OBESITY_II("Obesidad tipo II", 35, 40),
    OBESITY_III("Obesidad tipo III", 40, Double.MAX_VALUE),
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
        if (bmi >= 18.5 && bmi < 25) {
            return "Peso Normal";
        }
        if (bmi >= 25 && bmi < 30) {
            return "Sobrepeso";
        }
        if (bmi >= 30 && bmi < 35) {
            return "Obesidad tipo I";
        }
        if (bmi >= 35 && bmi < 40) {
            return "Obesidad tipo II";
        }
        if (bmi >= 40) {
            return "Obesidad tipo III";
        }
        if (bmi >= 17 && bmi < 18.5) {
            return "Delgadez leve";
        }
        if (bmi >= 16 && bmi < 17) {
            return "Delgadez moderada";
        }
        if (bmi >= 0 && bmi < 16) {
            return "Delgadez severa";
        }

        return "Valor inválido";
    }

}
