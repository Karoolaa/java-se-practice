package pl.globallogic.exercises.intermediate;

public class SharedDigit {
    public static void main(String[] args){
        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,55));
    }
    public static boolean hasSharedDigit(int num1, int num2){
        if (num2 < 10 || num2 > 99 || num1 < 10 || num1 > 99){
            return false;
        }
        while (num1 > 0){
            int digit1 = num1 % 10;
            int tempNum2 = num2;

            while (tempNum2 > 0){
                int digit2 = tempNum2 % 10;

                if (digit1 == digit2) {
                    return true;
                }
                tempNum2 /= 10;
            }
            num1 /= 10;
        }
        return false;
    }
}
