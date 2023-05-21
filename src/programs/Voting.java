package programs;

import java.util.Scanner;

public class Voting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age : ");
        float age = sc.nextFloat();
        if(age>=18){
            System.out.println("You're eligible to vote. Please vote for right candidate");
        } else{
            System.out.println("You're not eligible for vote. Wait for "+(18-age)+(" years"));
        }
    }
}
