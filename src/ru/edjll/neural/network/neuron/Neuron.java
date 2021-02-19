package ru.edjll.neural.network.neuron;

import ru.edjll.neural.network.function.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Neuron {

    private List<Double> weights;

    private Function function;

    public Neuron(Function function) {
        this.function = function;
    }

    public void init(int size) {
        weights = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            weights.add(random.nextDouble());
        }
    }

    public double run(List<Double> inputs) {
        if (inputs == null) {
            throw new IllegalArgumentException("inputs must not be null");
        }
        if (inputs.size() != weights.size()) {
            throw new IllegalArgumentException("size of inputs must be equals size of weights");
        }

        double result = 0.0;

        for (int i = 0; i < inputs.size(); i++) {
            result += inputs.get(i) * weights.get(i);
        }

        return function.apply(result);
    }
}
