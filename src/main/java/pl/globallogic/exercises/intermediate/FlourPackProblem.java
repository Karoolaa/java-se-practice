package pl.globallogic.exercises.intermediate;

public class FlourPackProblem {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int totalKilos = bigCount * 5 + smallCount;

        if (totalKilos >= goal && goal % 5 <= smallCount) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));  // false
        System.out.println(canPack(1, 0, 5));  // true
        System.out.println(canPack(0, 5, 4));  // true
        System.out.println(canPack(2, 2, 11)); // true
        System.out.println(canPack(-3, 2, 12));// false
    }
}
