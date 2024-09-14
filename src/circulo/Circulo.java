package circulo;

public class Circulo {

    double radio;

    public Circulo() {

    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularArea(){

        double area= Math.PI * Math.pow(radio, 2);
        return area;

    }
}
