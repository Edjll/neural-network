package ru.edjll.neural.network;

import ru.edjll.neural.network.function.impl.Sigmoid;
import ru.edjll.neural.network.neuron.Neuron;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Neuron neuron = new Neuron(new Sigmoid());
        neuron.init(5);
        System.out.println(neuron.run(Arrays.asList(1.0, 2.1, 3.3, 4.1, 5.4)));
    }
}
