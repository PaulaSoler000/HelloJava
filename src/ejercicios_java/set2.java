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
//        for (Integer i : conjunto) {
//            System.out.println(i);
//        }

        System.out.println( conjunto.first());
        System.out.println( conjunto.last());


        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduce el primer texto");
        Integer texto1 = lectura.nextInt();

//        if(texto1){
//
//        }





    }


}
