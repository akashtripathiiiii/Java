package programs;


import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        float num1 = sc.nextFloat();

        System.out.print("Enter operator (+, -, *, /, %) : ");
        char operator = sc.next().charAt(0);

        System.out.print("Enter second number : ");
        float num2 = sc.nextFloat();

        double result;

        switch (operator) {
            case '+' :
                result = num1 + num2;
                System.out.println("Addition of " + num1 + " and " + num2 + " : " + result);
                break;
            case '-' :
                result = num1 - num2;
                System.out.println("Subtraction of " + num1 + " and " + num2 + " : " + result);
                break;
            case '*' :
                result = num1 * num2;
                System.out.println("Multiplication of " + num1 + " and " + num2 + " : " + result);
                break;
            case '/' :
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Division of " + num1 + " and " + num2 + " : " + result);
                } else {
                    System.out.println("Error : Division by zero is not allowed");
                }
                break;
            case '%' :
                result = num1 % num2;
                System.out.println("Modulus of " + num1 + " and " + num2 + " : " + result);
                break;
            default :
                System.out.println("Enter operator (+, -, *, /, %) : ");
        }
    }
}
