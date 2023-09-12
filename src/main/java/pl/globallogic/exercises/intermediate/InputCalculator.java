package pl.globallogic.exercises.intermediate;

import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        long average = 0;
        int count = 0;

        while (true) {
            System.out.println("Wprowadź liczbę całkowitą lub naciśnij Enter, aby zakończyć:");

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                String input = scanner.next();
                if (input.equals("\n") || input.equals("")) {
                    break;
                } else {
                    System.out.println("To nie jest liczba całkowita. Spróbuj jeszcze raz.");
                }
            }
        }

        scanner.close();

        if (count > 0) {
            average = Math.round((double) sum / count);
        }

        System.out.println("SUM = " + sum + " AVG = " + average);
    }
}

