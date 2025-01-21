package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 90;
    }

    public static float rubleToDollar(float value) {
        return value / 70;
    }

    public static void main(String[] args) {
        float input = 630;
        float expected = 9;
        float output = Converter.rubleToDollar(input);
        boolean passed = expected == output;
        System.out.println("630 rubles are 9. Test result : " + passed);
        float input1 = 270;
        float expected1 = 3;
        float output1 = Converter.rubleToEuro(input1);
        boolean passed1 = expected1 == output1;
        System.out.println("270 rubles are 3. Test result : " + passed1);
    }
}