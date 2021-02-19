package ru.edjll.neural.network.function.impl;

import ru.edjll.neural.network.function.Function;

public class Sigmoid implements Function {

    private final double coefficient;

    public Sigmoid(double coefficient) {
        this.coefficient = coefficient;
    }

    public Sigmoid() {
        this.coefficient = 1;
    }

    public double getCoefficient() {
        return coefficient;
    }

    @Override
    public double apply(double value) {
        return 1 / (1 + Math.exp(-coefficient * value));
    }
}
