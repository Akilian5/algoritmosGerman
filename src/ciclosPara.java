import java.util.Scanner;

public class ciclosPara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ============================================
        // 1. Números entre 0 y 100 en orden ascendente y descendente
        // ============================================
        System.out.println("--- Ejercicio 1: Ascendente y descendente ---");

        System.out.println("Orden ascendente:");
        for (int i = 0; i <= 100; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\nOrden descendente:");
        for (int i = 100; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // ============================================
        // 2. Números del 1 al 20 excepto el 11
        // ============================================
        System.out.println("\n--- Ejercicio 2: Del 1 al 20 sin el 11 ---");

        for (int i = 1; i <= 20; i++) {
            // Si el número es 11, se salta esta iteración con continue
            if (i == 11) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        // ============================================
        // 3. Suma de los números naturales entre 1 y n
        // ============================================
        System.out.println("\n--- Ejercicio 3: Suma de 1 a n ---");

        System.out.print("Ingrese el valor de n: ");
        int n3 = sc.nextInt();

        int suma3 = 0;
        for (int i = 1; i <= n3; i++) {
            suma3 += i;
        }

        System.out.println("La suma de los números naturales entre 1 y " + n3 + " es: " + suma3);

        // ============================================
        // 4. Suma de los números entre m y n
        // ============================================
        System.out.println("\n--- Ejercicio 4: Suma entre m y n ---");

        System.out.print("Ingrese el valor de m: ");
        int m4 = sc.nextInt();

        System.out.print("Ingrese el valor de n: ");
        int n4 = sc.nextInt();

        int suma4 = 0;
        // Se recorre desde el menor hasta el mayor de los dos valores
        for (int i = Math.min(m4, n4); i <= Math.max(m4, n4); i++) {
            suma4 += i;
        }

        System.out.println("La suma de los números entre " + m4 + " y " + n4 + " es: " + suma4);

        // ============================================
        // 5. Suma de los números entre 1 y 100
        // ============================================
        System.out.println("\n--- Ejercicio 5: Suma entre 1 y 100 ---");

        int suma5 = 0;
        for (int i = 1; i <= 100; i++) {
            suma5 += i;
        }

        System.out.println("La suma de los números entre 1 y 100 es: " + suma5);

        // ============================================
        // 6. Promedio de cinco números ingresados por el usuario
        // ============================================
        System.out.println("\n--- Ejercicio 6: Promedio de cinco números ---");

        double suma6 = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            double num = sc.nextDouble();
            suma6 += num;
        }

        double promedio6 = suma6 / 5;
        System.out.println("El promedio de los cinco números es: " + promedio6);

        // ============================================
        // 7. Tabla de multiplicar del 3, del 0 al 50
        // ============================================
        System.out.println("\n--- Ejercicio 7: Tabla del 3 (0 a 50) ---");

        for (int i = 0; i <= 50; i++) {
            System.out.println("3 x " + i + " = " + (3 * i));
        }

        // ============================================
        // 8. Promedio de tres notas para n estudiantes
        // ============================================
        System.out.println("\n--- Ejercicio 8: Promedio de notas por estudiante ---");

        System.out.print("Ingrese la cantidad de estudiantes: ");
        int numEstudiantes = sc.nextInt();

        for (int i = 1; i <= numEstudiantes; i++) {
            System.out.println("Estudiante " + i + ":");

            System.out.print("  Ingrese la nota 1: ");
            double nota1 = sc.nextDouble();

            System.out.print("  Ingrese la nota 2: ");
            double nota2 = sc.nextDouble();

            System.out.print("  Ingrese la nota 3: ");
            double nota3 = sc.nextDouble();

            double promedioEstudiante = (nota1 + nota2 + nota3) / 3;
            System.out.println("  Promedio del estudiante " + i + ": " + promedioEstudiante);
        }

        // ============================================
        // 9. Factorial de un número entero n
        // ============================================
        System.out.println("\n--- Ejercicio 9: Factorial de n ---");

        System.out.print("Ingrese un número entero para calcular su factorial: ");
        int n9 = sc.nextInt();

        long factorial = 1;
        // El factorial de n es el producto de todos los enteros de 1 a n
        for (int i = 1; i <= n9; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + n9 + " es: " + factorial);

        // ============================================
        // 10. Promedio de 10 números
        // ============================================
        System.out.println("\n--- Ejercicio 10: Promedio de 10 números ---");

        double suma10 = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            double num = sc.nextDouble();
            suma10 += num;
        }

        double promedio10 = suma10 / 10;
        System.out.println("El promedio de los 10 números es: " + promedio10);

    }
}
