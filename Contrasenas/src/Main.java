import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        metodos passwordManager = new metodos(8,true,true,"");
        int opcion;

        do {

            String menu = "Selecciona una opción:\n" +
                    "1. Configurar y generar contraseña\n" +
                    "2. Evaluar fortaleza de la contraseña\n" +
                    "3. Modificar contraseña\n" +
                    "4. Mostrar contraseña\n" +
                    "5. Salir";

            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {
                case 1:
                    passwordManager.solicitar();
                    passwordManager.creacion();
                    break;
                case 2:
                    passwordManager.evaluar();
                    break;
                case 3:
                    passwordManager.modificar();
                    break;
                case 4:
                    passwordManager.mostrar();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intenta de nuevo.");
                    break;
            }
        } while (opcion != 5);
    }
}