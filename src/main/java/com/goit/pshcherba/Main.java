package com.goit.pshcherba;

import com.goit.pshcherba.fibonacci.DpFibonacci;
import com.goit.pshcherba.fibonacci.Fibonacci;
import com.goit.pshcherba.fibonacci.LoopFibonacci;
import com.goit.pshcherba.fibonacci.RecursiveFibonacci;


/**
 * The main class for checking the results.
 * **/
public class Main {
    public static void main(String[] args) {
        int position = 10;

        Fibonacci loopFibonacci = new LoopFibonacci();
        System.out.println("LoopFibonacci: " + loopFibonacci.get(position));

        Fibonacci recursiveFibonacci = new RecursiveFibonacci();
        System.out.println("RecursiveFibonacci: " + recursiveFibonacci.get(position));

        Fibonacci dpFibonacci = new DpFibonacci();
        System.out.println("DpFibonacci: " + dpFibonacci.get(position));
    }
}
