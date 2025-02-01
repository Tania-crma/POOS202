public class Ejercicio_3 {
    public static void main(String[] args) {
        System.out.println("Tablas de multiplicar del 1 al 10");

        for (int i = 1; i <= 10; i++) {
            System.out.println("\nTabla del " + i + ":");

            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }
}

