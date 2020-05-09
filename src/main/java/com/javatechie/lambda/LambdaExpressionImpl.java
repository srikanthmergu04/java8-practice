package com.javatechie.lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaExpressionImpl {
    public static void main(String args[]) {
        // adding 2 numbers using lambda expression.
        Calculate calculate = (x, y) -> x + y;

        System.out.println("sum =  " + calculate.sum(10, 2));

        // using forEach loop for printing List Items.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        System.out.print("\nPrinting Numbers using forEach loop");
        numbers.forEach(x -> System.out.println(x));

        System.out.println("\nproduct =  " + Calculate.multiply(5, 5));

    }


}
