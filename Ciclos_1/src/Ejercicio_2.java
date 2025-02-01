import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int numero = sc.nextInt();

        if (numero <= 0) {
            System.out.println("Por favor, coloque un número entero positivo.");
        } else {
            System.out.print("Cuenta hacia atrás: ");
            for (int i = numero; i >= 0; i--) {
                if (i < numero) {
                    System.out.print(", ");
                }
                System.out.print(i);
            }
            System.out.println();
        }
        sc.close();
    }
}

