import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa tu nombre: ");
        String nombre = entrada.nextLine();

            System.out.println("Cantidad de letras: " + nombre.length());
    }
}
