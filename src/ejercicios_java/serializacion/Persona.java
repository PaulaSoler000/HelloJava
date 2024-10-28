package ejercicios_java.serializacion;

import java .io.*;

class Persona extends Serializable {
    private static final long serialVersionUID = 1L; // Esto asegura una deserialización compatible
    private String nombre;
    private transient int edad; // 'transient' significa que este campo no será serializado

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String toString() {
        return "Persona{nombre='" + nombre + "', edad=" + edad + "}";
    }
}

