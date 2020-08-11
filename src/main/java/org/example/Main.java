package org.example;

public class Main {
    public static void main(String[] args) {
        Numbers results = new Numbers();

        int displaySum = results.sum(60, 70);
        System.out.println("The sum is: " + displaySum);

        int displayMultiplication = results.multiplication(60, 70);
        System.out.println("The multiplication result is: " + displayMultiplication);

        double displayDivision = results.division(60.0, 70.0);
        System.out.println("The division result is: " + displayDivision);

        int displaySubtraction = results.subtraction(60, 70);
        System.out.println("The subtraction result is: " + displaySubtraction);

        int displayDiverse = results.diverse(60, 70, 15);
        System.out.println("The diverse result is: " + displayDiverse);

        int displayDiverse1 = results.diverse1(60, 70, 15);
        System.out.println("The diverse1 result is: " + displayDiverse1);

        double displayDiverse2 = results.diverse2(60, 70, 15);
        System.out.println("The diverse2 result is: " + displayDiverse2);

        double displayDiverse3 = results.diverse3(60, 70, 15);
        System.out.println("The diverse3 result is: " + displayDiverse3);

        double displayDiverse4 = results.diverse4(60, 70, 15, 5);
        System.out.println("The diverse4 result is: " + displayDiverse4);

        int displayDiverse5 = results.diverse5(60, 70, 15);
        System.out.println("The diverse5 result is: " + displayDiverse5);
    }


}
