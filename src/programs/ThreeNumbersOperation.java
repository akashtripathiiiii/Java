package programs;

import java.util.Scanner;

public class ThreeNumbersOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float a = sc.nextFloat();
        System.out.print("Enter second number: ");
        float b = sc.nextFloat();
        System.out.print("Enter third number: ");
        float c = sc.nextFloat();

        if (a > b && a > c) {
            System.out.println(a + " is greater than " + b + " and " + c);
        } else if (a > b) {
            System.out.println(a + " is greater than " + b + " but less than " + c);
        } else if (a > c && a == b) {
            System.out.println(a + " is greater than " + c);
        } else if (a < b && a < c) {
            System.out.println(a + " is less than " + b + " and " + c);
        } else if (a < b) {
            System.out.println(a + " is less than " + b + " but greater than " + c);
        } else if (a < c && a == b) {
            System.out.println(a + " is less than " + c);
        } else {
            System.out.println("All are equals");
        }
    }
}
