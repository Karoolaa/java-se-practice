package pl.globallogic.exercises.intermediate;

public class ReverseArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.print("Array = ");
        printArray(array);

        reverse(array);

        System.out.print("Reversed array = ");
        printArray(array);
    }

    public static void reverse(int[] array) {
        int length = array.length;
        int temp;

        for (int i = 0; i < length / 2; i++) {
            temp = array[i];
            array[i] = array[length - 1 - i];
            array[length - 1 - i] = temp;
        }
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

