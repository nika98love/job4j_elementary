package ru.job4j.calculator;

public class ArgumentsMethod {
    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + ", age = " + age);
    }

    public static void main(String[] args) {
        String nik = "Job4j";
        int age = 6;
        ArgumentsMethod.hello(nik, age);
        ArgumentsMethod.hello(nik, age);
        ArgumentsMethod.hello(nik, age);
        ArgumentsMethod.hello(nik, age);
    }
}
