package ejercicios_java;

import java.io.*;
import java.util.Scanner;

public class ejericioFileOutputStream2 {

    public static void main(String[] args) {

//        PrintWriter pw = new PrintWriter(new FileOutputStream(new File("data.bin")));
//        for (int i = 1; i <= 10; ++i)
//            pw.print(i);
//
//        pw.close();
//
//        FileReader fr = new FileReader("data.bin");
//        int c;
//        while ((c = fr.read()) != -1) {
//            System.out.print(c);
//        }
//        fr.close();


        File fr2 = new File("data2.bin");

        try {
            FileOutputStream fos = new FileOutputStream(fr2);
            fos.write(0);
            fos.write(1);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            FileInputStream fis = new FileInputStream(fr2);
            try {
                int num = fis.read();
                while (num != -1) {
                    System.out.print(num);
                    num = fis.read();
                }
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
