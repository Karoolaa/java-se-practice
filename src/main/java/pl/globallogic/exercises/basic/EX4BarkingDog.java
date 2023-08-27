package pl.globallogic.exercises.basic;

import java.util.Scanner;

public class EX4BarkingDog {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Is the dog barking? (Yes/No): ");
        String barkingInput = scanner.nextLine();
        boolean isBarking = barkingInput.equalsIgnoreCase("Yes");
        System.out.println("Enter the hour of the day (0-23): ");
        int hour = scanner.nextInt();

        boolean shouldWake = shouldWakeUp(isBarking, hour);
        if (shouldWake) {
            System.out.println("You should wake up!");
        } else {
            System.out.println("You can sleep.");
        }
        scanner.close();

    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
            return true;
        }
        return false;
    }
}
