import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String password = "Ladybug99";

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su contraseña: ");
        String pass = sc.nextLine();

        if (pass.equals(password)) {
            System.out.println("Contraseña correcta.");
        }
        else {
            System.out.println("Contraseña incorrecta");
        }
    }
}