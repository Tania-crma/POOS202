import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int saldo = 0;

        System.out.println("Ingrese operación (D 100 / R 50) o línea vacía para finalizar:");

        while (true) {
            String entrada = scanner.nextLine().trim();

            if (entrada.isEmpty()) {
                break;
            }

            if (entrada.equals("D 100")) {
                saldo += 100;
            } else if (entrada.equals("R 50")) {
                if (saldo >= 50) {
                    saldo -= 50;
                } else {
                    System.out.println("Fondos insuficientes.");
                }
            } else {
                System.out.println("Operación no válida. Use 'D 100' para depositar o 'R 50' para retirar.");
            }
        }

        System.out.println("Saldo final: " + saldo + " pesos");
        scanner.close();
    }
}


