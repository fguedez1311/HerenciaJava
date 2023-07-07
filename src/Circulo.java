public class Circulo extends  Figura {
    private float radio;


    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float calcularArea() {
        return (float)Math.PI*radio*radio;
    }
}
