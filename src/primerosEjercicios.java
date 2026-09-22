import java.util.Scanner;

public class primerosEjercicios {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        // ============================================
        // 1. Edad futura
        // Lee la edad actual y los años a futuro, y muestra
        // la edad que tendrá el usuario dentro de esos años.
        // ============================================
        System.out.println("--- Ejercicio 1: Edad futura ---");

        System.out.print("Ingrese su edad actual: ");
        int edadActual = sc.nextInt();

        System.out.print("Ingrese la cantidad de años a futuro: ");
        int anios = sc.nextInt();

        // La edad futura es la suma de la edad actual más los años indicados
        int edadFutura = edadActual + anios;

        System.out.println("Dentro de " + anios + " años, tendrá " + edadFutura + " años.");

        // ============================================
        // 2. Operaciones con dos números
        // Lee dos números y muestra su suma, resta, producto y cociente.
        // ============================================
        System.out.println("\n--- Ejercicio 2: Operaciones básicas ---");

        System.out.print("Ingrese el primer número: ");
        double num1 = sc.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = sc.nextDouble();

        double suma = num1 + num2;
        double resta = num1 - num2;
        double producto = num1 * num2;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Producto: " + producto);

        // Se valida que el segundo número no sea cero antes de dividir
        if (num2 != 0) {
            double cociente = num1 / num2;
            System.out.println("Cociente: " + cociente);
        } else {
            System.out.println("Cociente: no se puede dividir entre cero.");
        }

        // ============================================
        // 3. Compra a crédito de un electrodoméstico
        // El precio aumenta un 25% al comprar a crédito y se divide
        // entre el número de meses para obtener la cuota mensual fija.
        // ============================================
        System.out.println("\n--- Ejercicio 3: Compra a crédito ---");

        System.out.print("Ingrese el precio del electrodoméstico: ");
        double precio = sc.nextDouble();

        System.out.print("Ingrese el plazo en meses: ");
        int meses = sc.nextInt();

        // El precio a crédito aumenta un 25% respecto al precio de contado
        double precioCredito = precio * 1.25;

        // La cuota mensual es el precio a crédito dividido entre el plazo
        double cuotaMensual = precioCredito / meses;

        System.out.println("Precio a crédito (con 25% de aumento): " + precioCredito);
        System.out.println("Valor de la cuota mensual: " + cuotaMensual);

        // ============================================
        // 4. Área de un triángulo
        // Fórmula: área = (base * altura) / 2
        // ============================================
        System.out.println("\n--- Ejercicio 4: Área de un triángulo ---");

        System.out.print("Ingrese la base del triángulo: ");
        double base = sc.nextDouble();

        System.out.print("Ingrese la altura del triángulo: ");
        double altura = sc.nextDouble();

        double areaTriangulo = (base * altura) / 2;

        System.out.println("El área del triángulo es: " + areaTriangulo);

        // ============================================
        // 5. Volumen de un cubo
        // Fórmula: volumen = lado^3
        // ============================================
        System.out.println("\n--- Ejercicio 5: Volumen de un cubo ---");

        System.out.print("Ingrese el lado del cubo: ");
        double lado = sc.nextDouble();

        double volumenCubo = Math.pow(lado, 3);

        System.out.println("El volumen del cubo es: " + volumenCubo);

        // ============================================
        // 6. Valor absoluto de un número real
        // ============================================
        System.out.println("\n--- Ejercicio 6: Valor absoluto ---");

        System.out.print("Ingrese un número real: ");
        double numero = sc.nextDouble();

        // Math.abs() devuelve el valor absoluto del número
        double valorAbsoluto = Math.abs(numero);

        System.out.println("El valor absoluto de " + numero + " es: " + valorAbsoluto);


    }
}