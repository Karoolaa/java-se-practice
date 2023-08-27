package pl.globallogic.exercises.intermediate;

public class NumberPalindrome {
    public static void main (String[] args){
        System.out.println(isPalindrom(-1221));
        System.out.println(isPalindrom(707));
        System.out.println(isPalindrom(11212));
    }
    public static boolean isPalindrom(int number){
        int orginalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number /= 10;
        }
        return orginalNumber == reversedNumber;
    }
}
