package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double minusAndDevision(double first, double second) {
        return minus(first, second) + devision(first, second);
    }

    public static double sumSum(double first, double second) {
        return multiply(first, second) + devision(first, second) + sum(first, second) + minus(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат суммы 2 чисел(сложение и умножение) равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат суммы 2 чисел(разность и деление) равен: " + minusAndDevision(60, 30));
        System.out.println("Результат суммы 4 чисел(4 операций) равен: " + sumSum(6, 2));

    }
}