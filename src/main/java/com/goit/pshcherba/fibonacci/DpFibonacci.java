package com.goit.pshcherba.fibonacci;

import java.util.ArrayList;
import java.util.List;

/**
 * This class provides an implementation of the Fibonacci sequence using dynamic programming.
 * It calculates Fibonacci numbers by storing previously computed values in a list.
 * Time complexity: O(n)
 * Space complexity: O(n)
 */
public class DpFibonacci implements Fibonacci {
    private final List<Integer> subResults = new ArrayList<>();

    {
        subResults.add(0);
        subResults.add(1);
    }


    /**
     * Retrieves the Fibonacci number at the specified position.
     *
     * @param position the position in the Fibonacci sequence (zero-based index)
     * @return the Fibonacci number at the given position
     * @throws IllegalArgumentException if the position is less than zero
     */
    @Override
    public int get(int position) {
        if (position < 0) {
            throw new IllegalArgumentException("Position number is less than zero");
        }

        if (position < subResults.size()) {
            return subResults.get(position);
        }

        while (subResults.size() <= position) {
            subResults.add(subResults.get(subResults.size() - 1) + subResults.get(subResults.size() - 2));

        }

        return subResults.get(position);
    }
}
