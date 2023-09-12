package pl.globallogic.exercises.basic;

import java.util.Scanner;

public class EX5LeapYearCalculator {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600)); // Should return false
        System.out.println(isLeapYear(1600));  // Should return true
        System.out.println(isLeapYear(2017));  // Should return false
        System.out.println(isLeapYear(2000));  // Should return true
        }
    public static boolean isLeapYear(int year){
       if (year < 1 || year > 9999) {
           return false;
       }
       if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
           return true;
       }
       else {
           return false;
       }
    }
}
