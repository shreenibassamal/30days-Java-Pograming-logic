package day_03;

import java.util.Scanner;
//here we count the loop to get the result .

public class CountTheGivenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number: ");
        int inp=input.nextInt();
        int sum=0;    //for count the loop to get the result
        while (inp>0){
            int d =inp/10;
            sum=sum+d;
            inp=inp/10;


        }
        System.out.println(sum);

    }
}
