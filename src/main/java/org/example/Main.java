package org.example;

public class Main {

    public static void main(String[] args) {
        int num1 = 60;
        int num2 = 70;
        int num3 = 15;

        Numbers results = new Numbers();

        int displaySum = results.sum(num1, num2);
        System.out.println("The sum is: " + displaySum);
        double displaySum2 = results.sum(60.5, 70.5);
        System.out.println("The overloaded sum is: " + displaySum2);

        int displayMultiplication = results.multiplication(60, 70);
        System.out.println("The multiplication result is: " + displayMultiplication);
        double displayMultiplication2 = results.multiplication(60.5, 70.5);
        System.out.println("The overloaded multiplication2 is: " + displayMultiplication2);

        double displayDivision = results.division(60.0, 70.0);
        System.out.println("The division result is: " + displayDivision);
        int displayDivision2 = results.division(60, 70);
        System.out.println("The overloaded division2 result is: " + displayDivision2);

        int displaySubtraction = results.subtraction(60, 70);
        System.out.println("The subtraction result is: " + displaySubtraction);
        double displaySubtraction2 = results.subtraction(60.5, 70.5);
        System.out.println("The overloaded subtraction2 result is: " + displaySubtraction2);

        int displayDiverse = results.diverse(60, 70, 15);
        System.out.println("The diverse result is: " + displayDiverse);
        float displayDiverseA = results.diverse(60.5f, 70.5f, 15.5f);
        System.out.println("The overloaded diverseA result is: " + displayDiverseA);

        int displayDiverse1 = results.diverse1(60, 70, 15);
        System.out.println("The diverse1 result is: " + displayDiverse1);
        double displayDiverse1A = results.diverse1(60.5, 70.5, 15.5);
        System.out.println("The overloaded diverse1A result is: " + displayDiverse1A);

        double displayDiverse2 = results.diverse2(60, 70, 15);
        System.out.println("The diverse2 result is: " + displayDiverse2);
        int displayDiverse2A = results.diverse2(60, 70, 15);
        System.out.println("The overloaded diverse2A result is: " + displayDiverse2A);

        double displayDiverse3 = results.diverse3(60, 70, 15);
        System.out.println("The diverse3 result is: " + displayDiverse3);
        int displayDiverse3A = results.diverse3(60, 70, 15);
        System.out.println("The overloaded diverse3A result is: " + displayDiverse3A);

        double displayDiverse4 = results.diverse4(60, 70, 15, 5);
        System.out.println("The diverse4 result is: " + displayDiverse4);
        int displayDiverse4A = results.diverse4(60, 70, 15, 5);
        System.out.println("The overloaded diverse4A result is: " + displayDiverse4A);

        int displayDiverse5 = results.diverse5(60, 70, 15);
        System.out.println("The diverse5 result is: " + displayDiverse5);
        double displayDiverse5A = results.diverse5(60.5, 70.5, 15.5);
        System.out.println("The overloaded diverse5A result is: " + displayDiverse5A);
    }
}
