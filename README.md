# BMI Calculator

La **Calculadora de IMC** es una aplicación desarrollada en Java que permite calcular el Índice de Masa Corporal (IMC) de una persona y clasificarlo en diferentes categorías según su rango de IMC.

---

## **Tabla de Contenidos**
- [Descripción del Proyecto](#descripción-del-proyecto)
- [Requisitos](#requisitos)
- [Instalación y Uso](#instalación-y-uso)


---

## **Descripción del Proyecto**
La Calculadora de IMC realiza las siguientes funciones principales:
1. Permite ingresar el peso (kg) y la altura (m) de una persona.
2. Calcula el IMC usando la fórmula:
   \[
   IMC = \frac{\text{peso}}{\text{altura}^2}
   \]
3. Clasifica el IMC en categorías según los estándares de la Organización Mundial de la Salud:
   - Delgadez severa: IMC < 16
   - Delgadez moderada: 16 <= IMC < 17
   - Delgadez leve: 17 <= IMC < 18.5
   - Peso normal: 18.5 <= IMC < 25
   - Sobrepeso: 25 <= IMC < 30
   - Obesidad tipo I: 30 <= IMC < 35
   - Obesidad tipo II: 35 <= IMC < 40
   - Obesidad tipo III (mórbida): IMC >= 40

---

## **Requisitos**
### **Software Necesario**
- **Java**: Versión 11 o superior.
- **JUnit 5**: Framework para pruebas unitarias.
- **IDE**: Visual Studio Code, IntelliJ IDEA, o Eclipse.
