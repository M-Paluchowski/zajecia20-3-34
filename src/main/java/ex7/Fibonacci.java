package ex7;

import java.util.stream.Stream;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacciRecursive(10000000));
    }

    private static int fibonacciRecursive(int number) {
        if (number < 1) {
            throw new IllegalArgumentException("There is no " + number + " fibonacci number");
        }
        return number < 3 ? 1 : fibonacciRecursive(number - 1) + fibonacciRecursive(number - 2);
    }
}
