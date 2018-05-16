package java8.stream.zadanie2;

import java.util.stream.Stream;

public class Fibonacci {
    private static void printFibonacci(int howMany)
    {
        Stream
                .iterate(new int[] {0, 1}, f -> new int[] { f[1], f[0] + f[1] })
                .limit(howMany)
                .map(f -> f[0])
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        printFibonacci(10);

        //TODO: Generate modified fibonacci sequence: each element is a sum of THREE (not two) preceding elements
    }
}
