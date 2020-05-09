package com.javatechie.lambda;


public interface Vehicle {
    default String display() {
        return "it is a Vehicle.";
    }
}
