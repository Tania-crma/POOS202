import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        int opcion;

        do {
            // Menú gráfico
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "Menú de Gestión de Empleados\n" +
                            "1. Agregar Empleado\n" +
                            "2. Listar Empleados\n" +
                            "3. Salir\n" +
                            "Seleccione una opción:"
            ));

            switch (opcion) {
                case 1:
                    String tipoEmpleado = JOptionPane.showInputDialog(
                            "Ingrese el tipo de empleado (Conductor/Administrativo):"
                    );

                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del empleado:"));
                    double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del empleado:"));

                    if (tipoEmpleado.equalsIgnoreCase("Conductor")) {
                        String licencia = JOptionPane.showInputDialog("Ingrese el tipo de licencia del conductor:");
                        empleados.add(new Conductor(nombre, id, salario, licencia));
                    } else if (tipoEmpleado.equalsIgnoreCase("Administrativo")) {
                        String departamento = JOptionPane.showInputDialog("Ingrese el departamento del administrativo:");
                        empleados.add(new Administrativo(nombre, id, salario, departamento));
                    } else {
                        JOptionPane.showMessageDialog(null, "Tipo de empleado no válido.");
                    }
                    break;

                case 2:
                    if (empleados.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No hay empleados registrados.");
                    } else {
                        StringBuilder listaEmpleados = new StringBuilder("Lista de Empleados:\n");
                        for (Empleado empleado : empleados) {
                            empleado.mostrarInfo();
                        }
                    }
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 3);
    }
}