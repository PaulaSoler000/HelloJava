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

        System.out.println("Introduce una letra a buscar");

        char letra = lectura.next().charAt(0);

        String letraString = String.valueOf(letra);

        int posicion = textoFinal.indexOf(letraString)+1;

        if (posicion != -1) {
            System.out.println("El carácter '" + letra + "' se encuentra en la posición " + posicion);
        } else {
            System.out.println("El carácter '" + letra + "' no está presente en la cadena concatenada");
        }


    }

}