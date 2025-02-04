import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            for (int i = 0; i <= n / 2; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            for (int i = 0; i <= n * 3 + 1; i++) {
                if (i % 3 == 0) {
                    System.out.print(i + " ");
                }
            }
        }


    }
}