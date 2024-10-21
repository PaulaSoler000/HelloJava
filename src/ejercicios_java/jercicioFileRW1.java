package ejercicios_java;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class jercicioFileRW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el texto: ");
        String texto = sc.nextLine();

        try (FileWriter fw = new FileWriter("diario.txt", true); FileReader fr = new FileReader("diario.txt")) {

            fw.write(texto + "\n");

            fw.flush();

            int valor = fr.read();
            while (valor != -1) {
                System.out.print((char) valor);
                valor = fr.read();
            }


        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
