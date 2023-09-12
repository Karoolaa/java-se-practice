package pl.globallogic.exercises.intermediate;

import java.util.Scanner;

public class MinimumElement {

    public static void main(String[] args) {
        int count = readInteger();
        int[] elements = readElements(count);
        int minValue = findMin(elements);

        System.out.println("Minimum value in the array is: " + minValue);
    }

    public static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        return scanner.nextInt();
    }

    public static int[] readElements(int count) {
        Scanner scanner = new Scanner(System.in);
        int[] elements = new int[count];

        System.out.println("Enter " + count + " elements:");
        for (int i = 0; i < count; i++) {
            elements[i] = scanner.nextInt();
        }

        return elements;
    }

    public static int findMin(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }
}
