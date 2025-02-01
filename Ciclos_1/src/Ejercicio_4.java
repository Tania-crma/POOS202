import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int numero = sc.nextInt();

        if (numero <= 0) {
            System.out.println("Por favor, ingrese un número positivo.");
        } else {
            for (int i = 1; i <= numero; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(numero + " ");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}

