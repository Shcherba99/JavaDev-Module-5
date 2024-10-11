package com.goit.pshcherba.fibonacci;

/**
 * This class provides an implementation of the Fibonacci sequence using recursion.
 * It calculates the Fibonacci number at a given position in the sequence by recursively
 * summing the previous two Fibonacci numbers.
 * Time complexity: O(2^n)
 * Space complexity: O(n)
 */
public class RecursiveFibonacci implements Fibonacci {

    /**
     * Returns the Fibonacci number at the specified position in the sequence.
     *
     * @param position the position in the Fibonacci sequence (0-based). Must be a non-negative integer.
     * @return the Fibonacci number at the given position.
     * @throws IllegalArgumentException if the position is negative.
     */
    @Override
    public int get(int position) {
        if (position < 0) {
            throw new IllegalArgumentException("Position number is less than zero");
        }

        if (position == 0) {
            return 0;
        }

        if (position == 1 || position == 2) {
            return 1;
        } else {
            return get(position - 1) + get(position - 2);
        }
    }
}
