package com.fibonacci;

/**
 * This class contains methods for calculating Fibonacci numbers.
 * The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones,
 * usually starting with 0 and 1.
 */
public class FibonacciProgram {

    /**
     * Calculates the Fibonacci number at the given index.
     *
     * @param n The index at which to calculate the Fibonacci number. Must be a non-negative integer.
     * @return The Fibonacci number at the given index.
     *         Returns 0 for n = 0 and 1 for n = 1.
     *         For any other value of n, it recursively calculates the Fibonacci value.
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        int result = fibonacci(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");
    }
}
