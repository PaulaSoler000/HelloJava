package ejercicios_java.polimorfismo;

public class Main {
    public static void main(String[] args) {
        Animal sonido = new Perro();
        sonido.hacerSonido();

        sonido = new Gato();
        sonido.hacerSonido();

        sonido = new Vaca();
        sonido.hacerSonido();
    }

}
