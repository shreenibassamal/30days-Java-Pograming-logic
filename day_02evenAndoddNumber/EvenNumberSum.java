package day_02;

import java.util.Scanner;

public class EvenNumberSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the starting range: ");
        int start= input.nextInt();
        System.out.print("enter the ending range: ");
        int end = input.nextInt();
        int sum = 0;
        for (int i = start;i<=end ;i++){
            if (i %2==0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}
