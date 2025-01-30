import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Coloque su edad: ");
        int edad = sc.nextInt();

        if (edad < 4) {
            System.out.println("Entrada gratis");
        }
        else if (edad > 4 && edad < 18) {
            System.out.println("Debe pagar $110");
        }
        else {
            System.out.println("Debe pagar $190");
        }
    }
}
