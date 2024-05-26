package com.streams.java;
import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class Empleado {

    private String nombre;
    private String apellido;
    private Integer salario;
    private String departamento;
    
    public Empleado(Integer dato) {
        this.salario = dato;
    }

    
}
