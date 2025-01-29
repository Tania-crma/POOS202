import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int PESO_PAYASO = 112;
        final int PESO_MUNECA = 75;

        System.out.print("Introduce la cantidad de payasos: ");
        int cantidadPayasos = scanner.nextInt();

        System.out.print("Introduce la cantidad de muñecas: ");
        int cantidadMunecas = scanner.nextInt();

        int pesoTotal = (cantidadPayasos * PESO_PAYASO) + (cantidadMunecas * PESO_MUNECA);

        System.out.println("El peso total del paquete es: " + pesoTotal + " gramos.");

        scanner.close();
    }
}


