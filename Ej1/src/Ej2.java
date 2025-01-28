import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa tu nombre: ");
        String nombre = entrada.nextLine().trim();

        String mayusculas = nombre.toUpperCase();
        String minusculas = nombre.toLowerCase();

        String inicial = nombre.isEmpty() ? "" :
                nombre.substring(0, 1).toUpperCase() + nombre.substring(1).toLowerCase();

        System.out.println("Nombre en mayusculas: " + mayusculas);
        System.out.println("Nombre en minusculas: " + minusculas);
        System.out.println("Solo inicial: " + inicial);
    }
}

