package pl.globallogic.exercises.intermediate;

public class GretestCommonDivisor {
    public static void main(String[] args){
        System.out.println(getGreatestCommonDivision(25,15));
        System.out.println(getGreatestCommonDivision(12,30));
        System.out.println(getGreatestCommonDivision(9,18));
        System.out.println(getGreatestCommonDivision(81,153));
    }
    public static int getGreatestCommonDivision(int first, int second){
        if (first < 10 || second < 10){
            return -1;
        }
        while (first!=second){
            if (first > second){
                first = first - second;
            }else{
                second= second - first;
            }
        }
        return first;
    }
}
