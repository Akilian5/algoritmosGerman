import java.util.Scanner;

public class ejerciciosAdicionalesFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ============================================
        // 1. Números del 1 al 50 indicando par o impar
        // ============================================
        System.out.println("--- Ejercicio 1: Par o impar del 1 al 50 ---");

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " - par");
            } else {
                System.out.println(i + " - impar");
            }
        }

        // ============================================
        // 2. Números del 1 al 30, "Fizz" si es múltiplo de 3
        // ============================================
        System.out.println("\n--- Ejercicio 2: Fizz ---");

        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }

        // ============================================
        // 3. Suma de los números pares entre 1 y 100
        // ============================================
        System.out.println("\n--- Ejercicio 3: Suma de pares (1 a 100) ---");

        int sumaPares = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sumaPares += i;
            }
        }
        System.out.println("La suma de los números pares es: " + sumaPares);

        // ============================================
        // 4. Contar cuántos de diez números son negativos
        // ============================================
        System.out.println("\n--- Ejercicio 4: Contar negativos ---");

        int negativos = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            double num = sc.nextDouble();
            if (num < 0) {
                negativos++;
            }
        }
        System.out.println("Cantidad de números negativos: " + negativos);

        // ============================================
        // 5. Múltiplos de 4 entre 1 y 20
        // ============================================
        System.out.println("\n--- Ejercicio 5: Múltiplos de 4 (1 a 20) ---");

        for (int i = 1; i <= 20; i++) {
            if (i % 4 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // ============================================
        // 6. Mayor de n números ingresados
        // ============================================
        System.out.println("\n--- Ejercicio 6: Mayor de n números ---");

        System.out.print("Ingrese cuántos números va a ingresar: ");
        int n6 = sc.nextInt();

        double mayor = 0;
        for (int i = 1; i <= n6; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            double num = sc.nextDouble();

            // En la primera vuelta el mayor es el primer número ingresado
            if (i == 1 || num > mayor) {
                mayor = num;
            }
        }
        System.out.println("El mayor número ingresado es: " + mayor);

        // ============================================
        // 7. Suma de los números del 1 al 50 divisibles por 3 o por 5
        // ============================================
        System.out.println("\n--- Ejercicio 7: Suma de divisibles por 3 o 5 ---");

        int suma7 = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                suma7 += i;
            }
        }
        System.out.println("La suma es: " + suma7);

        // ============================================
        // 8. Contar calificaciones aprobatorias (>= 60) de cinco notas
        // ============================================
        System.out.println("\n--- Ejercicio 8: Calificaciones aprobatorias ---");

        int aprobados = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese la calificación " + i + ": ");
            double calificacion = sc.nextDouble();
            if (calificacion >= 60) {
                aprobados++;
            }
        }
        System.out.println("Cantidad de calificaciones aprobatorias: " + aprobados);

        // ============================================
        // 9. Del 1 al n, imprimir "positivo" si el número es mayor a 0
        // ============================================
        System.out.println("\n--- Ejercicio 9: Positivos del 1 al n ---");

        System.out.print("Ingrese el valor de n: ");
        int n9 = sc.nextInt();

        for (int i = 1; i <= n9; i++) {
            if (i > 0) {
                System.out.println(i + " - positivo");
            }
        }

        // ============================================
        // 10. Números del 1 al n mayores al promedio de 1 a n
        // ============================================
        System.out.println("\n--- Ejercicio 10: Mayores al promedio ---");

        System.out.print("Ingrese el valor de n: ");
        int n10 = sc.nextInt();

        // Primero se calcula el promedio de los números del 1 al n
        int suma10 = 0;
        for (int i = 1; i <= n10; i++) {
            suma10 += i;
        }
        double promedio10 = (double) suma10 / n10;

        System.out.println("El promedio de 1 a " + n10 + " es: " + promedio10);
        System.out.println("Números mayores al promedio:");
        for (int i = 1; i <= n10; i++) {
            if (i > promedio10) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // ============================================
        // 11. Contar días calurosos entre diez temperaturas (> 30°C)
        // ============================================
        System.out.println("\n--- Ejercicio 11: Días calurosos ---");

        int diasCalurosos = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese la temperatura del día " + i + ": ");
            double temperatura = sc.nextDouble();
            if (temperatura > 30) {
                diasCalurosos++;
            }
        }
        System.out.println("Cantidad de días calurosos: " + diasCalurosos);

    }
}
