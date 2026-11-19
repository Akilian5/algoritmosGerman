
import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {

    static Scanner sc = new Scanner(System.in);

    public static int cuadrado( int n){

        return n*n;

    }


    public static int sumar(ArrayList<Integer> lista) {
        int suma = 0;
        for (Integer integer : lista) {
            suma = suma + integer;
        }
        return suma;
    }


    public static boolean existe(ArrayList<String> lista, String buscado) {
        for (String s : lista) {
            if (s.equalsIgnoreCase(buscado)) {
                return true;
            }
        }
        return false;
    }

    public static int contar(ArrayList<Character> lista, char objetivo) {
        int contador = 0;
        for (Character character : lista) {
            if (character == objetivo) {
                contador++;
            }
        }
        return contador;
    }

    public static int mayor(ArrayList<Integer> lista) {
        int max = lista.get(0);
        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i) > max) {
                max = lista.get(i);
            }
        }
        return max;
    }

    public static ArrayList<Integer> obtenerPares(ArrayList<Integer> lista) {
        ArrayList<Integer> pares = new ArrayList<>();
        for (Integer integer : lista) {
            if (integer % 2 == 0) {
                pares.add(integer);
            }
        }
        return pares;
    }
    public static String concatenar(ArrayList<String> lista) {
        String resultado = "";
        for (int i = 0; i < lista.size(); i++) {
            resultado = resultado + lista.get(i);
            if (i < lista.size() - 1) {
                resultado = resultado + " ";
            }
        }
        return resultado;
    }

    public static ArrayList<Integer> sinDuplicados(ArrayList<Integer> lista) {
        ArrayList<Integer> resultado = new ArrayList<>();
        for (Integer integer : lista) {
            if (!resultado.contains(integer)) {
                resultado.add(integer);
            }
        }
        return resultado;
    }

    public static ArrayList<Integer> invertir(ArrayList<Integer> lista) {
        ArrayList<Integer> invertida = new ArrayList<>();
        for (int i = lista.size() - 1; i >= 0; i--) {
            invertida.add(lista.get(i));
        }
        return invertida;
    }

    public static void reemplazar(ArrayList<String> lista, String buscado, String reemplazo) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals(buscado)) {
                lista.set(i, reemplazo);
            }
        }
    }




    public static void main(String[] args) {

        /*System.out.println("Meta un numero para sacarle el cuadrado");
        int n = sc.nextInt();
        int cuadrado = cuadrado(n);
        System.out.println("El cuadrado del numero ingresado es "+cuadrado);*/

        /*

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);

        int suma = sumar(numeros);
        System.out.println("La suma de los numeros del ArrayList es: "+suma);

        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Nicolas");
        nombres.add("Lis");
        nombres.add("Santiago");
        nombres.add("Luffy");
        System.out.println("Ingrese el nombre a buscar:");
        String buscado = sc.next();
        if (existe(nombres,buscado)){
            System.out.println("El nombre buscado en la lista si existe");
        }else{
            System.out.println("El nombre buscado en la lista no existe");
        }

        */




        ArrayList<Character> letras = new ArrayList<>();
        letras.add('a');
        letras.add('b');
        letras.add('a');
        letras.add('c');
        letras.add('a');

        char objetivo = 'a';

        int cantidad = contar(letras, objetivo);
        System.out.println("El caracter " + objetivo + " aparece " + cantidad + " veces");



        ArrayList<Integer> numeros2 = new ArrayList<>();
        numeros2.add(7);
        numeros2.add(22);
        numeros2.add(3);
        numeros2.add(15);

        System.out.println("El mayor es: " + mayor(numeros2));



        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(4);
        numeros.add(7);
        numeros.add(10);
        numeros.add(13);
        numeros.add(6);

        ArrayList<Integer> resultado = obtenerPares(numeros);
        System.out.println("Pares: " + resultado);



        ArrayList<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add("como");
        palabras.add("estas");

        System.out.println(concatenar(palabras));


        ArrayList<Integer> numeros3 = new ArrayList<>();
        numeros3.add(3);
        numeros3.add(5);
        numeros3.add(3);
        numeros3.add(8);
        numeros3.add(5);
        numeros3.add(1);

        ArrayList<Integer> unicos = sinDuplicados(numeros3);
        System.out.println("Sin duplicados: " + unicos);



        ArrayList<Integer> numeros4 = new ArrayList<>();
        numeros4.add(1);
        numeros4.add(2);
        numeros4.add(3);
        numeros4.add(4);

        ArrayList<Integer> resultado2 = invertir(numeros4);
        System.out.println("Original: " + numeros4);     // [1, 2, 3, 4]
        System.out.println("Invertida: " + resultado2);


        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Ana");
        nombres.add("Maria");

        reemplazar(nombres, "Ana", "Sofia");
        System.out.println(nombres);
    }
}
