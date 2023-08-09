package pl.globallogic.exercises.basic;

public class EX2SpeedConverter {
    public static void main(String[] args) {
        printConversion(1.5); // → should return value 1
        printConversion(10.25); // → should return value 6
        printConversion(-5.6); // → should return value -1
        printConversion(25.42); // → should return value 16
        printConversion(75.114); //  → should return value 47
    }

    private static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.60934);
    }

    private static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
