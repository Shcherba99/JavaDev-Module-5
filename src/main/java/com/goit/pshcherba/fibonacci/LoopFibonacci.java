package com.goit.pshcherba.fibonacci;

/**
 * This class provides an implementation of the Fibonacci sequence using an iterative approach.
 * It calculates the Fibonacci number for a given non-negative integer input.
 * Time complexity: O(n)
 * Space complexity: O(1)
 */
public class LoopFibonacci implements Fibonacci {

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

        if (position <= 1) {
            return position;
        }

        int prev = 0;
        int next = 1;
        int result = 0;

        for (int i = 2; i <= position; i++) {
            result = prev + next;
            prev = next;
            next = result;
        }

        return result;
    }
}
