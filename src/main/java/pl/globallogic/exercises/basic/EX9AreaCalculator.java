package pl.globallogic.exercises.basic;

public class EX9AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(rectagleArea(5.0,4.0));
        System.out.println(rectagleArea(-1.0,4.0));
    }
    public static double area(double radius){
       if (radius < 0) {
           return -1.0;
       }
       return radius * radius * Math.PI;
    }
    public static double rectagleArea(double X, double Y) {
        if (X < 0 || Y < 0) {
            return -1.0;
        }
        return  X * Y;
    }
}
