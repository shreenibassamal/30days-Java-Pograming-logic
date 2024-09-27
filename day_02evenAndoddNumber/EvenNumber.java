package day_02;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter any number: ");
        int i = input.nextInt();

            if (i % 2 == 0 ){
            System.out.println("this number is even number");

        }
            else {
                System.out.println("this number is not even number");
            }

    }
}
