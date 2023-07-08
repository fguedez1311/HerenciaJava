import java.util.Scanner;

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

    public void cargarDatos() {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese el radio en cm: ");
        radio=teclado.nextFloat();

    }
}
