// Zona de importación
import java.util.Scanner;

// Clase principal
public class Main {
    // Método Main
    public static void main(String[] args) {
        System.out.println("Hola mundo soy Tania");

        // 2. Cadenas
        String cadena = "Tania" + "Cruz" + "Marquez";
        System.out.println(cadena);
        System.out.println("Longitud de la cadena: " + cadena.length());

        // Extracción de caracteres en base a parámetros
        System.out.println(cadena.substring(2, 5));
        System.out.println(cadena.substring(2));
        System.out.println(cadena.substring(0, 5));

        // 3. Variables
        String cadenaNum = "333", cadena2;
        int entero = 3, entero2, entero3;
        double decimal = 3.3, decimal2, decimal3;

        // Convertir cadena a int
        entero2 = Integer.parseInt(cadenaNum);
        System.out.println("Convertido a entero: " + entero2);

        // Convertir double a int
        entero3 = (int) decimal;
        System.out.println("Convertido a entero desde double: " + entero3);

        // Convertir double a cadena
        cadena2 = String.valueOf(decimal);
        System.out.println("Convertido a cadena: " + cadena2);

        // Convertir int a double
        decimal2 = Double.valueOf(entero);
        System.out.println("Convertido a double: " + decimal2);

        // 4. Solicitud de datos
        Scanner scn = new Scanner(System.in);

        System.out.println("Escriba una cadena:");
        String nuevaCadena = scn.nextLine();

        System.out.println("Escribe un número entero:");
        int nuevoEntero = scn.nextInt();

        System.out.println("Escribe un número decimal:");
        double nuevoDecimal = scn.nextDouble();

        // Cerrar Scanner
        scn.close();

        // 5. Booleanos, operadores lógicos y de comparación
        System.out.println("Comparaciones:");
        System.out.println(10 > 9);
        System.out.println(10 == 9);
        System.out.println(10 < 9);
        System.out.println(10 >= 9);
        System.out.println(10 <= 9);
        System.out.println(10 != 9);

        // Operadores lógicos
        int x = 3;
        System.out.println("Operadores lógicos:");
        System.out.println(x < 5 && x > 10);
        System.out.println(x < 5 || x > 10);
        System.out.println(!(x < 5 && x > 10));
        System.out.println(!(x < 5 || x > 10));
    }
}
