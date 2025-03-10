package models;

import interfaces.ICalculator;

public class Subtruction implements ICalculator {
    @Override
    public Integer calculate(int a, int b) {
        return a-b;
    }
}
