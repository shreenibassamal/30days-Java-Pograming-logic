package day_02;

import java.util.Scanner;

public class OddNumber2 {
    public static void odd(){
        Scanner input = new Scanner(System.in);
        System.out.print("enter the starting range: ");
        int start = input.nextInt();

        System.out.print("enter the ending range: ");
        int end = input.nextInt();
        int i = start;
        if(i<=end){
            if (start%2!=0) {
                System.out.println(i);
                i++;
            }
            else {
                System.out.println(i % 2);
                i++;
            }
        }


        OddNumber2.odd();
    }
    public static void main(String[] args) {
        OddNumber2.odd();

    }
}
