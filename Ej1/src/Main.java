import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("¿Cuantas horas trabajas al dia? ");
        int Hora = entrada.nextInt();

        System.out.print("¿Cuanto te pagan por hora? ");
        double Pago = entrada.nextDouble();

        double resultado = Pago * Hora;

        System.out.println("Tu pago es de: " + resultado);

        entrada.close();
    }
}