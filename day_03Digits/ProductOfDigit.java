package day_03;

import java.util.Scanner;

public class ProductOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number: ");
        int inp = input.nextInt();
        int product = 1;        //it will initialize with every cycle of loop.
        while (inp > 0) {    //condition should false according to condition .
            int d = inp % 10; //another variable to store th single digit
            product = product * d;    //product of single digit add in every cycle
            inp = inp / 10;   //incremental or decremental for run the loop as per condition.
        }
        System.out.println("Product Of TheD igit is: " + product); //it will print the final sum value.
    }
}
