package ejercicios_java;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduce el primer texto");
        String texto1 = lectura.next();
        System.out.println("Introduce el segundo texto");

        String texto2 = lectura.next();

        String textoFinal = texto1 + texto2;

        System.out.println("La cadena resultante es: " + textoFinal);

    }

}