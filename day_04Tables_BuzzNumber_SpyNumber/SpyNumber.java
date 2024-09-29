package day_04;

import java.util.Scanner;

public class SpyNumber {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("enter the number: ");
            int inp = input.nextInt();
            int sum = 0;
            int prdt = 1;
            while (inp > 0) {
                int d = inp % 10;
                sum = sum + d;
                prdt = prdt * d;
                inp = inp / 10;

            }
            if (sum == prdt) {
                System.out.println("this number is spy number: " + inp);
            } else {
                System.out.println("this number is not spy number: " + inp);
            }

        }
    }

