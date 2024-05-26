package com.streams.java;

import java.util.List;
import java.util.function.DoublePredicate;
import java.util.stream.DoubleStream;

public class StreamsEnteros {

    public static void main(String[] args) {

        List<Double> listaDoubles = List.of(3.4, 5.6, 74.8, 95.0, 22.0, 64.0, 2.0);

        DoubleStream streamDouble = listaDoubles.stream().mapToDouble(v -> Double.valueOf(v));

        // System.out.println("Hay: " + streamDouble.count() + " elementos");
        // System.out.println("Minimo "+streamDouble.min());
        // System.out.println("Maximo "+streamDouble.max());
        // System.out.println(streamDouble.average());

        // hallar los numeros mayores a 20
        // crear predicado para los numeros mayores a 20
        DoublePredicate mayoresA20 = (n) -> n >= 20;
        DoublePredicate pares = (n) -> n % 2 == 0;
        DoublePredicate menoresA70 = (n) -> n <= 70;
        Long conteo = streamDouble.filter(mayoresA20).filter(pares).filter(menoresA70).count();
        System.out.println("Mayores a 20,Menores a 70 y pares " + conteo);

    }

}
