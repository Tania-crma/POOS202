import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de * de la base del árbol: ");
        int base = scanner.nextInt();
        int altura = (base / 2) + 1;
        int i = 1;

        while (i <= altura) {
            int espacios = altura - i;
            int asteriscos = (2 * i) - 1;

            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < asteriscos; j++) {
                System.out.print("*");
            }

            System.out.println();
            i++;
        }

        int espaciosBase = (base - 1) / 2;
        for (int j = 0; j < espaciosBase; j++) {
            System.out.print(" ");
        }
        System.out.println("*");

        scanner.close();
    }
}
