package pl.globallogic.exercises.intermediate;

import java.util.Scanner;
import java.util.Arrays;

public class SortedArray {

    public static void main(String[] args) {
        int[] myArray = getIntegers(5); // You can specify the size of the array here
        System.out.println("Original array:");
        printArray(myArray);

        int[] sortedArray = sortIntegers(myArray);
        System.out.println("\nSorted array in descending order:");
        printArray(sortedArray);
    }

    public static int[] getIntegers(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[size];

        System.out.println("Enter " + size + " integer values:\r");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);

        // Reverse the sorted array to get descending order
        for (int i = 0; i < sortedArray.length / 2; i++) {
            int temp = sortedArray[i];
            sortedArray[i] = sortedArray[sortedArray.length - 1 - i];
            sortedArray[sortedArray.length - 1 - i] = temp;
        }

        return sortedArray;
    }
}

