public class Circulo implements CalculosFormas{

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo() {}

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return pi * Math. pow(this.radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * pi * this.radio;
    }
}
