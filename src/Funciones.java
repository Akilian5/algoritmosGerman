import java.util.Scanner;
public class Funciones {

    static Scanner sc = new Scanner(System.in);

    // Ejercicio 1: múltiplos de 3 o de 5 del 1 al 100
    static void multiplos() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i);
            }
        }
    }

    // Ejercicio 2: contar mayores y menores de edad
    static void contarEdades() {
        int mayores = 0;
        int menores = 0;

        System.out.print("¿Cuántas edades va a ingresar? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Edad " + i + ": ");
            int edad = sc.nextInt();
            if (edad >= 18) {
                mayores++;
            } else {
                menores++;
            }
        }

        System.out.println("Mayores de edad: " + mayores);
        System.out.println("Menores de edad: " + menores);
    }

    // Ejercicio 3: hasta 20 palabras, con bandera y break
    static void pedirPalabras() {
        boolean salir = false;
        int cantidad = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Palabra " + i + " (q para salir): ");
            String palabra = sc.next();

            if (palabra.equals("q")) {
                salir = true;
                break;
            }
            cantidad++;
        }

        System.out.println("Palabras escritas: " + cantidad);
        if (salir) {
            System.out.println("Salió porque escribió q");
        } else {
            System.out.println("Salió porque completó las 20 palabras");
        }
    }

    // Ejercicio 4: suma y promedio de 10 números
    static void sumaYPromedio() {
        double suma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            suma = suma + sc.nextDouble();
        }

        double promedio = suma / 10;
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
    }


    public static void main(String[] args) {
        System.out.println("--- Ejercicio 1 ---");
        multiplos();

        System.out.println("--- Ejercicio 2 ---");
        contarEdades();

        System.out.println("--- Ejercicio 3 ---");
        pedirPalabras();

        System.out.println("--- Ejercicio 4 ---");
        sumaYPromedio();
    }
}
