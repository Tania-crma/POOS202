import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Coloca una frase: ");
        String frase = sc.nextLine().toUpperCase();

        System.out.print("Escoge una letra: ");
        char letra = sc.next().toUpperCase().charAt(0);

        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                contador++;
            }
        }

        System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la frase.");

        sc.close();
    }
}
