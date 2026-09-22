import java.util.Scanner;

public class ejerciciosAdicionalesIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ============================================
        // 1. Género de película favorito
        // ============================================
        System.out.println("--- Ejercicio 1: Género de película ---");

        System.out.print("Ingrese su género de película favorito: ");
        String genero = sc.nextLine();

        // equalsIgnoreCase compara sin importar mayúsculas o minúsculas
        if (genero.equalsIgnoreCase("terror")) {
            System.out.println("¡Le gustan las películas de miedo!");
        } else {
            System.out.println("No le gustan las películas de miedo.");
        }

        // ============================================
        // 2. Primera letra mayúscula o minúscula
        // ============================================
        System.out.println("\n--- Ejercicio 2: Primera letra ---");

        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine();

        // charAt(0) obtiene el primer carácter de la palabra
        char primeraLetra = palabra.charAt(0);

        if (Character.isUpperCase(primeraLetra)) {
            System.out.println("La primera letra es mayúscula.");
        } else {
            System.out.println("La primera letra es minúscula.");
        }

        // ============================================
        // 3. Validar correo electrónico
        // ============================================
        System.out.println("\n--- Ejercicio 3: Correo electrónico ---");

        System.out.print("Ingrese su correo electrónico: ");
        String correo = sc.nextLine();

        // contains() verifica si el texto incluye el símbolo "@"
        if (correo.contains("@")) {
            System.out.println("El correo parece tener un formato válido.");
        } else {
            System.out.println("El correo NO parece tener un formato válido.");
        }

        // ============================================
        // 4. Comparar dos palabras
        // ============================================
        System.out.println("\n--- Ejercicio 4: Comparar palabras ---");

        System.out.print("Ingrese la primera palabra: ");
        String palabra1 = sc.nextLine();

        System.out.print("Ingrese la segunda palabra: ");
        String palabra2 = sc.nextLine();

        // equals() compara si el contenido de las dos palabras es exactamente igual
        if (palabra1.equals(palabra2)) {
            System.out.println("Las palabras son iguales.");
        } else {
            System.out.println("Las palabras son diferentes.");
        }

        // ============================================
        // 5. Validar talla de camiseta
        // ============================================
        System.out.println("\n--- Ejercicio 5: Talla de camiseta ---");

        System.out.print("Ingrese la talla (S, M o L): ");
        String talla = sc.nextLine();

        // Se acepta la talla solo si es "S", "M" o "L"
        if (talla.equalsIgnoreCase("S") || talla.equalsIgnoreCase("M") || talla.equalsIgnoreCase("L")) {
            System.out.println("La talla " + talla + " es válida.");
        } else {
            System.out.println("La talla " + talla + " es inválida.");
        }

    }
}
