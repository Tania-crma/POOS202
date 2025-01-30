import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número 1: ");
        int num1 = sc.nextInt();

        System.out.print("Número 2: ");
        int num2 = sc.nextInt();

        sc.nextLine();

        System.out.println("Escoge la operación a realizar:");
        System.out.println("+ = Suma");
        System.out.println("- = Resta");
        System.out.println("* = Multiplicación");
        System.out.println("/ = División");

        System.out.print("Operación: ");
        String operacion = sc.nextLine();

        switch (operacion) {
            case "+":
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case "-":
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case "*":
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Error: No se puede dividir entre cero.");
                } else {
                    System.out.println("Resultado: " + (num1 / num2));
                }
                break;
            default:
                System.out.println("Operación no válida.");
        }

        sc.close();
    }
}
