package circulo;

public class ejercicioRadio {

    public static void main(String[] args) {

        Circulo circulito = new Circulo();
        circulito.setRadio(4);

        System.out.println("El area del circulo es: " + circulito.calcularArea() + ", su radio era: " + circulito.getRadio());


    }
}
