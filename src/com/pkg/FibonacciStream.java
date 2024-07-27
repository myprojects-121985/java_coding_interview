package com.pkg;

import java.util.Scanner;
import java.util.stream.Stream;

public class FibonacciStream {
    public static void main(String[] args) {
        /*Stream.iterate(new long[]{0, 1}, fib -> new long[]{fib[1], fib[0] + fib[1]})
                .limit(10) // Limit to first 10 Fibonacci numbers
                .forEach(fib -> System.out.print(fib[0] + " "));*/

        /*Stream.iterate(1,n -> n).limit(20)
                .forEach(x -> System.out.println(x));*/

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Stream.iterate(new int[]{0,1},fib->new int[]{fib[1], fib[0]+fib[1]})
                .limit(number)
                .forEach(fib-> System.out.print(fib[0] +" "));
    }
}

