import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una palabra o frase: ");
        String entrada = sc.nextLine().toLowerCase();

        String textoLimpio = entrada.replaceAll("[^a-zA-Z0-9]", "");

        String textoInvertido = invertir(textoLimpio);

        if (textoLimpio.equals(textoInvertido)) {
            System.out.println("Es un palíndromo.");
        } else {
            System.out.println("No es un palíndromo.");
        }

        sc.close();
    }

    public static String invertir(String texto) {
        String textoInvertido = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            textoInvertido += texto.charAt(i);
        }

        return textoInvertido;
    }
}

