import java.util.Scanner;

public class algoritmos4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ============================================
        // 1. Mayoría de edad
        // Lee la edad del usuario y muestra si es mayor de edad o no.
        // ============================================
        System.out.println("--- Ejercicio 1: Mayoría de edad ---");

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        if (edad >= 18) {
            System.out.println("Usted es mayor de edad.");
        } else {
            System.out.println("Usted es menor de edad.");
        }

        // ============================================
        // 2. Validar triángulo
        // Lee los tres ángulos internos y verifica si suman 180°,
        // condición necesaria para que formen un triángulo.
        // Además cada ángulo debe ser mayor que cero.
        // ============================================
        System.out.println("\n--- Ejercicio 2: Ángulos de un triángulo ---");

        System.out.print("Ingrese el primer ángulo: ");
        double angulo1 = sc.nextDouble();

        System.out.print("Ingrese el segundo ángulo: ");
        double angulo2 = sc.nextDouble();

        System.out.print("Ingrese el tercer ángulo: ");
        double angulo3 = sc.nextDouble();

        // La suma de los tres ángulos internos de un triángulo debe ser 180°
        // y ninguno de los ángulos puede ser menor o igual a 0
        if (angulo1 > 0 && angulo2 > 0 && angulo3 > 0 && (angulo1 + angulo2 + angulo3 == 180)) {
            System.out.println("Los ángulos SÍ corresponden a un triángulo.");
        } else {
            System.out.println("Los ángulos NO corresponden a un triángulo.");
        }

        // ============================================
        // 3. Par o impar
        // Lee un número y muestra si es par o impar.
        // ============================================
        System.out.println("\n--- Ejercicio 3: Par o impar ---");

        System.out.print("Ingrese un número entero: ");
        int numero3 = sc.nextInt();

        // Si el residuo de dividir entre 2 es 0, el número es par
        if (numero3 % 2 == 0) {
            System.out.println("El número " + numero3 + " es par.");
        } else {
            System.out.println("El número " + numero3 + " es impar.");
        }

        // ============================================
        // 4. Divisible entre cinco
        // Lee un número y muestra si es divisible entre 5 o no.
        // ============================================
        System.out.println("\n--- Ejercicio 4: Divisible entre cinco ---");

        System.out.print("Ingrese un número entero: ");
        int numero4 = sc.nextInt();

        // Si el residuo de dividir entre 5 es 0, el número es divisible entre 5
        if (numero4 % 5 == 0) {
            System.out.println("El número " + numero4 + " SÍ es divisible entre cinco.");
        } else {
            System.out.println("El número " + numero4 + " NO es divisible entre cinco.");
        }

        // ============================================
        // 5. Número primo (entre 1 y 15)
        // Lee un número entre 1 y 15 y muestra si es primo o no.
        // Un número primo solo es divisible entre 1 y él mismo.
        // ============================================
        System.out.println("\n--- Ejercicio 5: Número primo ---");

        System.out.print("Ingrese un número entre 1 y 15: ");
        int numero5 = sc.nextInt();

        boolean esPrimo = true;

        // El 1 no se considera número primo
        if (numero5 == 1) {
            esPrimo = false;
        } else {
            // Se revisa si tiene algún divisor distinto de 1 y de sí mismo
            for (int i = 2; i < numero5; i++) {
                if (numero5 % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        if (esPrimo) {
            System.out.println("El número " + numero5 + " SÍ es primo.");
        } else {
            System.out.println("El número " + numero5 + " NO es primo.");
        }

        // ============================================
        // 6. Mayor entre dos números
        // Recibe dos números y muestra cuál es el mayor,
        // o indica si son iguales.
        // ============================================
        System.out.println("\n--- Ejercicio 6: Mayor entre dos números ---");

        System.out.print("Ingrese el primer número: ");
        double numeroA = sc.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numeroB = sc.nextDouble();

        if (numeroA > numeroB) {
            System.out.println("El mayor es: " + numeroA);
        } else if (numeroB > numeroA) {
            System.out.println("El mayor es: " + numeroB);
        } else {
            System.out.println("Ambos números son iguales: " + numeroA);
        }

        // ============================================
        // 7. IVA de productos de supermercado
        // Lentejas y arroz no pagan IVA. Vino y crema sí pagan IVA.
        // Se recibe el nombre del producto y se indica si paga IVA.
        // ============================================
        System.out.println("\n--- Ejercicio 7: IVA de productos ---");

        System.out.print("Ingrese el nombre del producto (lentejas, crema, arroz, vino): ");
        String producto = sc.next();

        // Se compara el texto ingresado sin importar mayúsculas o minúsculas
        if (producto.equalsIgnoreCase("lentejas") || producto.equalsIgnoreCase("arroz")) {
            System.out.println("El producto \"" + producto + "\" NO paga IVA.");
        } else if (producto.equalsIgnoreCase("vino") || producto.equalsIgnoreCase("crema")) {
            System.out.println("El producto \"" + producto + "\" SÍ paga IVA.");
        } else {
            System.out.println("Producto no reconocido.");
        }
    }
}
