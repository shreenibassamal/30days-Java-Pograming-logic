package day_03;

import java.util.Scanner;

public class SumOfTheDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number: ");
        int inp = input.nextInt();
        int sum = 0;        //it will initialize with every cycle of loop.
        while (inp > 0) {    //condition should false according to condition .
            int d = inp % 10; //another variable to store th single digit
            sum = sum + d;    //sum of single digit add in every cycle
            inp = inp / 10;   //incremental or decremental for run the loop as per condition.
        }
        System.out.println("Sum Of TheD igit is: "+sum); //it will print the final sum value.
    }
}
