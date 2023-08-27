package pl.globallogic.exercises.intermediate;

public class PerfectNumber {
    public static void main(String[] args){
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }
    public static boolean isPerfectNumber(int number){
        if (number<1) {
            return false;
        }
        int sumOfDivorese = 0;
        for (int i = 1; i < number; i++){
            if (number%i ==0){
                sumOfDivorese += i;
            }
        }
        return sumOfDivorese == number;
    }
}
