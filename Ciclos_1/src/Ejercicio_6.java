import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese que operacion desea realizar: ");
        System.out.println("D 100");
        System.out.print("R 50");
        int operacion = sc.nextInt();

        if (operacion == 100) {
            System.out.println("El resultado es: 100");
        } else if (operacion == 50) {
            System.out.println("El resultado es: 50");
        }
    }
}
