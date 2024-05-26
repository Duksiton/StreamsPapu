package com.streams.java;
import java.util.List;

public class MetodosReferenciados {
    public static void main(String[] args) {
        //lista de enteros
        List<Integer> listaEnteros =
        List.of(1, 90, 7, 5, 20 );
        System.out.println(listaEnteros);

        listaEnteros.forEach(elemento-> System.out.println(elemento));
    System.out.println("---------------");
    listaEnteros.forEach(dato -> new Empleado(dato));
    listaEnteros.forEach(Empleado::new);
}}