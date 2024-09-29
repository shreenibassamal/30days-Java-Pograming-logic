package day_04;

import java.util.Scanner;

public class TableOfNumberForward {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter any number to get the table: ");
        int inp = input.nextInt();
        System.out.println("the table of given number "+inp+" is:");
        for (int i=1;i<=10;i++){
            System.out.println(inp+" * "+i+" = "+inp*i);
        }
    }
}
