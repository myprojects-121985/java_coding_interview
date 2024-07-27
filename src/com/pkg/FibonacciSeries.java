package com.pkg;

import java.util.Scanner;

public class FibonacciSeries {

    //0 1 1 2 3 5 8....
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int firstNumber = 0;
        int secondNumber = 1;

        for (int idx = 0; idx < number; idx++) {
            System.out.print(firstNumber + "  ");
            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }
}
