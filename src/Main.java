import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static List<Figura>  figuras=new ArrayList<>();
    public static void main(String[] args) {
        String[] opciones={
                "Crear Figura",
                "Mostrar la sumatoria de areas de las figuras",
                "Salir"
        };
        boolean mostrarMenu=true;


        do {
            switch(menu(opciones)){
                case 1:
                    crearFigura();
                    break;
                case 2:
                    mostrarSumatoriaFigura();
                    break;

                case 3:
                    mostrarMenu=false;
                    break;
            }
        } while(mostrarMenu);




    }

    private static void crearFigura() {
        String[] opciones={
                "Circulo",
                "Cuadrado",
                "Triangulo"
        };
        switch(menu(opciones)){
            case 1:
                Circulo circulo=new Circulo();
                circulo.cargarDatos();
                System.out.println("El area del circulo es: "+circulo.calcularArea());
                figuras.add(circulo);
                break;
            case 2:
                Cuadrado cuadrado=new Cuadrado();
                cuadrado.cargarDatos();
                System.out.println("El area del cuadrado es: "+cuadrado.calcularArea());
                figuras.add(cuadrado);
                break;
            case 3:
                Triangulo triangulo=new Triangulo();
                triangulo.cargarDatos();
                System.out.println("El area del Triangulo es: "+triangulo.calcularArea());
                figuras.add(triangulo);
                break;


        }
    }
    private static void mostrarSumatoriaFigura(){
        double sumatoriaAreas=0;
        for(Figura figura:figuras){
            sumatoriaAreas+=figura.calcularArea();
        }
        System.out.println("La sumatoria de areas de todas las figuras es: "+sumatoriaAreas+"cm");
    }

    public static int menu(String[] opciones)
    {   int opcion;
        //Escribir las opciones en pantalla
        System.out.println("\n\n----------------------\n\n");
        for (int i=1;i<=opciones.length;i++) {
            System.out.println("  "+i+". "+opciones[i-1]);
            System.out.println("----------------------");
        }
        //Leer las opciones en pantalla
        do{
            Scanner teclado=new Scanner(System.in);
            System.out.print("\n"+"Opcion(1-"+opciones.length+"): ");
            opcion=teclado.nextInt();

        } while (opcion<1 || opcion>opciones.length);
        return opcion;
    }


}
