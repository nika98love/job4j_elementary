package ru.job4j.condition;

public class RectangleArea {
    public static double square(int p, double k) {
        return (p / (2 * (k - 1)) * k) * (p / (2 * (k + 1)));
    }

    public static void main(String[] args) {
        double result = RectangleArea.square(13, 8);
        System.out.println(" p = 6, k = 2, s = 1, real = " + result);
    }
}
