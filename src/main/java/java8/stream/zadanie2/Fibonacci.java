package java8.stream.zadanie2;

import java.util.stream.Stream;

public class Fibonacci {
    private static void printFibonacci(int howMany)
    {
        Stream.iterate(new int[] {0, 1}, n -> new int[] {n[1], n[0] + n[1]}).map(n -> n[0]).limit(howMany).forEach(System.out::println);
    }

    public static void main(String[] args) {
        printFibonacci(10);
    }
}
