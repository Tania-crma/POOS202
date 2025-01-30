import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Coloque un numero: ");
        String numero = sc.nextLine();

        if (numero.length() % 2 == 0) {
            System.out.println("El numero es par");
        }
        else {
            System.out.println("El numero es impar");
        }
    }
}
