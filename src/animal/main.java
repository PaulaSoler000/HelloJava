package animal;

import circulo.Circulo;

import java.util.ArrayList;
import java.util.List;


public class main {
    public static void main(String[] args) {

        List<Animal> myList = new ArrayList();
        Perro perrito = new Perro();
        Gato gatito = new Gato();
        myList.add(perrito);
        myList.add(gatito);

        for (Animal a:myList){
            a.hacerSonido();
            a.dormir();

        }

    }
}
