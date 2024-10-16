package ejercicios_java;

import javax.swing.*;
import java.security.KeyStore;
import java.util.Map;
import java.util.TreeMap;

public class treeMap2 {
    public static void main(String[] args) {
        TreeMap<String, Integer> mapa = new TreeMap<>();

        String texto = "En un lugar de la mancha de cuyo";

        String[] palabras = texto.split(" ");

        for (String palabra : palabras) {
            if (mapa.containsKey(palabra)) {
                Integer num = mapa.get(palabra);
                num++;
                mapa.put(palabra, num);
            }else{
                mapa.put(palabra, 1);
            }
        }

        for (Map.Entry<String, Integer> entrada : mapa.entrySet()){
            System.out.println(entrada.getKey() + " - " + entrada.getValue());
        }
    }
}
