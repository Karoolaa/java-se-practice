package pl.globallogic.exercises.basic;

import java.util.Scanner;

public class EX1PositiveNegativeorZero {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pass the number: ");
        int number = scanner.nextInt();

        checkNumber(number);
    }

    private static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}
