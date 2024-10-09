package ejercicios_java;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class set2 {
    public static void main(String[] args) {
        TreeSet<Integer> conjunto = new TreeSet<Integer>();
        conjunto.add(1);
        conjunto.add(50);
        conjunto.add(5);
        conjunto.add(100);

        System.out.println(conjunto);



        System.out.println(conjunto.first());
        System.out.println(conjunto.last());


        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduce el primer texto");
        Integer numero = lectura.nextInt();

        conjunto.add(numero);

        Integer numMayor = conjunto.higher(numero);


        if (numMayor != null) {

            System.out.println("el siguiente mas alto es: " + numMayor);

        } else {
            System.out.println("número no válido");
        }

        Integer numMenor = conjunto.lower(numero);

        if (numMenor != null) {

            System.out.println("el anterior mas bajo es: " + numMenor);

        } else {
            System.out.println("número no válido");
        }


    }


}

