import java.util.Scanner;

public abstract class PoligonoRegular extends Figura {
    protected float base;
    protected float altura;

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    public void cargarDatos(){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese la altura en cm: ");
        altura=teclado.nextFloat();
        System.out.println("Ingrese la base en cm: ");
        base=teclado.nextFloat();
    }

    @Override
    public abstract float calcularArea();
}
