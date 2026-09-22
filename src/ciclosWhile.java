import java.util.Scanner;

public class ciclosWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ============================================
        // 1. Números naturales de 1 a n
        // ============================================
        System.out.println("--- Ejercicio 1: Naturales de 1 a n ---");

        System.out.print("Ingrese el valor de n: ");
        int n1 = sc.nextInt();

        int i1 = 1;
        while (i1 <= n1) {
            System.out.print(i1 + " ");
            i1++;
        }
        System.out.println();

        // ============================================
        // 2. Suma de los primeros n números naturales
        // ============================================
        System.out.println("\n--- Ejercicio 2: Suma de los primeros n naturales ---");

        System.out.print("Ingrese el valor de n: ");
        int n2 = sc.nextInt();

        int suma2 = 0;
        int i2 = 1;
        while (i2 <= n2) {
            suma2 += i2;
            i2++;
        }

        System.out.println("La suma de los primeros " + n2 + " números naturales es: " + suma2);

        // ============================================
        // 3. Tabla de multiplicar del 10, del 1 al 50
        // ============================================
        System.out.println("\n--- Ejercicio 3: Tabla del 10 (1 a 50) ---");

        int i3 = 1;
        while (i3 <= 50) {
            System.out.println("10 x " + i3 + " = " + (10 * i3));
            i3++;
        }

        // ============================================
        // 4. Números impares entre 1 y n
        // ============================================
        System.out.println("\n--- Ejercicio 4: Impares entre 1 y n ---");

        System.out.print("Ingrese el valor de n: ");
        int n4 = sc.nextInt();

        int i4 = 1;
        while (i4 <= n4) {
            // Se imprime el número solo si es impar
            if (i4 % 2 != 0) {
                System.out.print(i4 + " ");
            }
            i4++;
        }
        System.out.println();

        // ============================================
        // 5. Preguntar al usuario si desea salir (S/N)
        // El programa se detiene cuando el usuario teclea "S"
        // ============================================
        System.out.println("\n--- Ejercicio 5: Salir con S/N ---");

        String respuesta = "";
        // No se usa "S".equals(respuesta) hasta preguntar al usuario al menos una vez
        while (!respuesta.equalsIgnoreCase("S")) {
            System.out.print("¿Desea salir? (S/N): ");
            respuesta = sc.next();

            if (respuesta.equalsIgnoreCase("S")) {
                System.out.println("El programa se detiene.");
            } else {
                System.out.println("El programa continúa ejecutándose.");
            }
        }

        // ============================================
        // 6. Promedio de 10 números
        // ============================================
        System.out.println("\n--- Ejercicio 6: Promedio de 10 números ---");

        double suma6 = 0;
        int contador6 = 1;
        while (contador6 <= 10) {
            System.out.print("Ingrese el número " + contador6 + ": ");
            double num = sc.nextDouble();
            suma6 += num;
            contador6++;
        }

        double promedio6 = suma6 / 10;
        System.out.println("El promedio de los 10 números es: " + promedio6);

        // ============================================
        // 7. Promedio de n números, se detiene al ingresar 0
        // ============================================
        System.out.println("\n--- Ejercicio 7: Promedio hasta ingresar 0 ---");

        double suma7 = 0;
        int cantidad7 = 0;

        System.out.print("Ingrese un número (0 para terminar): ");
        double num7 = sc.nextDouble();

        while (num7 != 0) {
            suma7 += num7;
            cantidad7++;

            System.out.print("Ingrese un número (0 para terminar): ");
            num7 = sc.nextDouble();
        }

        // Se valida que se haya ingresado al menos un número antes del 0
        if (cantidad7 > 0) {
            double promedio7 = suma7 / cantidad7;
            System.out.println("El promedio de los " + cantidad7 + " números ingresados es: " + promedio7);
        } else {
            System.out.println("No se ingresó ningún número antes del 0.");
        }

        // ============================================
        // 8. Suma de los cuadrados de los números entre 1 y n
        // ============================================
        System.out.println("\n--- Ejercicio 8: Suma de cuadrados entre 1 y n ---");

        System.out.print("Ingrese el valor de n: ");
        int n8 = sc.nextInt();

        long sumaCuadrados = 0;
        int i8 = 1;
        while (i8 <= n8) {
            sumaCuadrados += (long) i8 * i8;
            i8++;
        }

        System.out.println("La suma de los cuadrados entre 1 y " + n8 + " es: " + sumaCuadrados);

    }
}
