package introduction;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args){
        //switch cases are a substitute for long if-else statements
        // compare a variable of multiple values
        // after founding match, it executes the corresponding code of that value case
        // use break at last of every case to jump on next case without executing that case

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of day in a week : ");
        int day = sc.nextInt();

        switch(day){
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter valid number to print the day of a month");
        }
    }
}
