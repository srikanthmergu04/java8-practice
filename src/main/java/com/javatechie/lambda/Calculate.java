package com.javatechie.lambda;

@FunctionalInterface
public interface Calculate {
    int sum(int x, int y);

    // we can use static methods in interface in java 8.
    static int multiply(int x, int y) {
        return x * y;
    }

}
