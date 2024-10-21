package ejercicios_java;

import java.io.*;
import java.util.Scanner;

public class ejericioFileOutputStream2 {

    public static void main(String[] args) throws IOException {

        PrintWriter pw = new PrintWriter(new FileOutputStream(new File("data.bin")));
        for (int i = 1; i <= 10; ++i)
            pw.print(i);

        pw.close();

        FileReader fr = new FileReader("data.bin");
        int c;
        while ((c = fr.read()) != -1)
            System.out.print((char) c);
        fr.close();

    }
}
