import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();

        String fraseInvertida = new StringBuilder(frase).reverse().toString();

        System.out.println("Frase invertida: " + fraseInvertida);

        scanner.close();
    }
}

