package ejercicios_java;

import java.io.File;
import java.util.Scanner;

public class ejercicioFile1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la ruta: ");
        String ruta = sc.nextLine();

        File objFile = new File(ruta);

        String[] archivos = objFile.list();
        for (String archivo : archivos) {
            //System.out.println(archivo);

            if(new File(objFile, archivo).isDirectory()) {
                System.out.println("**" + archivo);
            } else {
                System.out.println(archivo);
            }


        }
        // poner dos asterisco delante todos los que sean directorios(File)

        sc.close();


    }
}
