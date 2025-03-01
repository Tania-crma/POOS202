import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = null;
        Conductor conductor = null;
        Envios envio = null;
        Entrega entrega = null;

        while (true) {
            String menu = "Menú\n" +
                    "1. Registrar vehículo\n" +
                    "2. Registrar conductor\n" +
                    "3. Asignar conductor a vehículo\n" +
                    "4. Registrar envío\n" +
                    "5. Registrar entrega\n" +
                    "6. Actualizar estado de entrega\n" +
                    "7. Mostrar información\n" +
                    "8. Salir";

            int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {
                case 1:
                    vehiculo = new Vehiculo("", "", 0);
                    vehiculo.solicitar();
                    JOptionPane.showMessageDialog(null, "Vehículo registrado.");
                    break;

                case 2:
                    conductor = new Conductor("", "", "");
                    conductor.solicitar();
                    JOptionPane.showMessageDialog(null, "Conductor registrado.");
                    break;

                case 3:
                    if (vehiculo != null && conductor != null) {
                        vehiculo.asignarConductor(conductor);
                    } else {
                        JOptionPane.showMessageDialog(null, "Debe registrar un vehículo y un conductor primero.");
                    }
                    break;

                case 4:
                    envio = Envios.crearEnvio();
                    JOptionPane.showMessageDialog(null, "Envío registrado.");
                    break;

                case 5:
                    long numeroGuia = Long.parseLong(JOptionPane.showInputDialog("Ingrese el número de guía:"));
                    entrega = new Entrega(numeroGuia);
                    JOptionPane.showMessageDialog(null, "Entrega registrada.");
                    break;

                case 6:

                    if (entrega != null) {
                        entrega.actualizarEstado();
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay entregas registradas.");
                    }
                    break;

                case 7:
                    String info = "";
                    if (vehiculo != null) {
                        info += "VEHICULO \n";
                        info += "Placa: " + vehiculo.getPlaca() + "\n";
                        info += "Modelo: " + vehiculo.getModelo() + "\n";
                        info += "Capacidad: " + vehiculo.getCapacidad() + "\n";
                    }
                    if (conductor != null) {
                        info += "\nCONDUCTOR\n";
                        info += "Nombre: " + conductor.getNombre() + "\n";
                        info += "Identificación: " + conductor.getIdentificacion() + "\n";
                    }
                    if (envio != null) {
                        info += "\nENVIO\n";
                        info += "Código: " + envio.getCodigo() + "\n";
                        info += "Destino: " + envio.getDestino() + "\n";
                        info += "Peso: " + envio.getPeso() + "\n";
                    }
                    if (entrega != null) {
                        info += "\nENTREGA\n";
                        info += "Número de guía: " + entrega.getNumeroGuia() + "\n";
                        info += "Estado: " + entrega.getEstado() + "\n";
                    }
                    JOptionPane.showMessageDialog(null, info.isEmpty() ? "No hay información registrada." : info);
                    break;

                case 8:
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        }
    }
}