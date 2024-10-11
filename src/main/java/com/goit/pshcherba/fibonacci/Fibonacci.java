package com.goit.pshcherba.fibonacci;


/**
 * Interface representing a contract for Fibonacci sequence implementations.
 * Implementations of this interface should provide a method to retrieve
 * the Fibonacci number at a specified position.
 */
public interface Fibonacci {

    /**
     * Returns the Fibonacci number at the specified position in the sequence.
     *
     * @param position the position in the Fibonacci sequence (0-based). Must be a non-negative integer.
     * @return the Fibonacci number at the given position.
     * @throws IllegalArgumentException if the number is negative.
     */
    int get(int position);
}
