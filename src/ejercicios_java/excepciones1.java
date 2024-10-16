package ejercicios_java;

import java.util.Scanner;

public class excepciones1 {
    public static void main(String[] args) {

        boolean condicion = true;
        Scanner lectura = new Scanner(System.in);
        Integer num1, num2;

        while (condicion) {
            System.out.println("Introduce el primer numero");
            num1 = lectura.nextInt();
            System.out.println("Introduce el segundo numero");
            num2 = lectura.nextInt();


            try {

                System.out.println(num1 / num2);
                condicion = false;


            } catch (ArithmeticException e) {

                System.out.println("El segundo numero no puede ser 0");
            }
        }
        lectura.close();


    }
}
