package com.streams.java;

public class PruebaFuncionales {
    public static void main(String[] args) {

        Operacion sumar=
            (a,b)->a+b;
            System.out.println(sumar.ejecutar(10, 10));


        Operacion restar=
                (a,b)->a-b;
            System.out.println(restar.ejecutar(50, 10));


        //crear el metodo multiplicar pero
        // utlizar lambda
        Operacion multiplicar=
        //se puede omitir el return
        // si el cuerpo de la expresion lambda
        //tiene solo y solo una instruccion
                ( a, b)->a*b;
        System.out.println(multiplicar.ejecutar(5, 5));

        Operacion dividir=
            
            (a,b)-> a/b;
            System.out.println(dividir.ejecutar(10, 2));
    }

}
