package org.example;

public class Numbers {

    public int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    public int multiplication(int a, int b) {
        int result = a * b;
        return result;
    }

    public double division(double a, double b) {
        double result = a / b;
        return result;
    }

    public int subtraction(int a, int b) {

        int result = a - b;
        return result;
    }

    public int diverse(int a, int b, int c) {

        int result = (a + b) - c;
        return result;
    }

    public int diverse1(int a, int b, int c) {

        int result = (a - b) * c;
        return result;
    }

    public double diverse2(double a, double b, double c) {

        double result = (a + b) / c;
        return result;
    }

    public double diverse3(double a, double b, double c) {
        double result = a + (b / c);
        return result;
    }

    public double diverse4(double a, double b, double c, double d) {
        double result = (a + b - c) / d;
        return result;
    }

    public int diverse5(int a, int b, int c) {
        int result = (a - c) - b;
        return result;
    }
}
