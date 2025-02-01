import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un número entero positivo: ");
        int numero = sc.nextInt();

        if (numero <= 0) {
            System.out.println("Por favor, coloque un número entero positivo.");
        } else {
            System.out.print("Números impares: ");
            for (int i = 1; i <= numero; i += 2) {
                if (i > 1) {
                    System.out.print(", ");
                }
                System.out.print(i);
            }
            System.out.println();
        }
        sc.close();
    }
}
