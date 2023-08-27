package pl.globallogic.exercises.intermediate;

public class EvenDigitSum {
    public static void main(String[] args){
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }
    public static int getEvenDigitSum(int number){
        if(number <1) {
            return -1;
        }
        int evendigitsum = 0;

        while (number>0){
            int digit = number % 10;
            if (digit%2 ==0){
                evendigitsum += digit;
            }
            number /=10;
        }
        return evendigitsum;
    }
}
