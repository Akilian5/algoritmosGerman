import java.util.Scanner;

public class ejercicioFuncion {


    static Scanner sc = new Scanner(System.in);

    public static String pedirNombre(){
        System.out.println("Nombre del empleado: ");
        return sc.nextLine();

    }
    public static double pedirPromedio(){
        double suma = 0;
        for (int i = 1; i <=3 ; i++) {
            System.out.println("Ingrese su sueldo "+i+": ");
            suma = suma + sc.nextDouble();

        }
        return suma /3;

    }

    public static double pedirAntiguedad(){
        System.out.println("Ingrese su antiguedad en la empresa (años): ");
        return sc.nextInt();
    }


    public static boolean verificar(double promedio, double antiguedad){

        return promedio < 4000000 && antiguedad > 6;
    }


    public static void mostrar(String nombre, double promedio, boolean puede){
        System.out.printf("Promedio de sueldos: $%.2f%n", promedio);
        if (puede){

            System.out.println(nombre + " si recibe apoyo de vivienda");
        }else{
            System.out.println(nombre + " no recibe apoyo de vivienda");
        }
    }












    public static void main(String[] args) {
        String nombre = pedirNombre();
        double promedio = pedirPromedio();
        double antiguedad = pedirAntiguedad();
        boolean verificar = verificar(promedio,antiguedad);
        mostrar(nombre,promedio,verificar);

    }
}
