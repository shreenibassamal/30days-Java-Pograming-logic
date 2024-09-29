package day_04;

import java.util.Scanner;

public class BuzzNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number: ");
        int inp = input.nextInt();
        System.out.println();
        if(inp%7 ==0|| inp%10==7){
            System.out.print(+ inp+ " :this number is BUZZ number");
        }
        else {
            System.out.print(+ inp+ "; this number is NOT BUZZ number"+ inp);
        }

        }
}
