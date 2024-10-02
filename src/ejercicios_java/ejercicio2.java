package ejercicios_java;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
    String cadena1 ="CadenaDePrueba";
    String cadena2="CADEnaDEPRUEBA";

    String cadena1min=cadena1.toLowerCase();
    String cadena2min=cadena2.toLowerCase();

    if (cadena1min.equals(cadena2min)){
        System.out.println("son iguales");
    }else{
        System.out.println("no son iguales");
    }


    System.out.println(cadena1.substring(0,5));

    System.out.println(cadena2.replace('A', '@'));






    }

}
