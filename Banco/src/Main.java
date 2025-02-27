import javax.swing.*;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "¡Hola!, Bienvenido a tu banco");

        String NumeroC = JOptionPane.showInputDialog("Ingrese el número de cuenta:");
        int no_cuenta = 0;

        try {
            no_cuenta = Integer.parseInt(NumeroC);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Debe ingresar un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String cuenta = JOptionPane.showInputDialog("Ingrese el nombre del usuario");

        JOptionPane.showMessageDialog(null, "El usuario ingresado es: " + cuenta + "\nNúmero de cuenta: " + no_cuenta);

        Cuenta usuario = new Cuenta();
        usuario.setTitular(cuenta);
        usuario.setNo_cuenta(no_cuenta);

        boolean salir = false;

        while (!salir) {
            String op = JOptionPane.showInputDialog(
                    "Seleccione una opción:\n" +
                            "1. Consultar datos\n" +
                            "2. Consultar saldo\n" +
                            "3. Ingresar dinero\n" +
                            "4. Retirar dinero\n" +
                            "5. Depositar dinero\n" +
                            "6. Salir"
            );

            switch (op) {
                case "1":
                    JOptionPane.showMessageDialog(null,
                            "Usuario: " + usuario.getTitular() +
                                    "\nNúmero de Cuenta: " + usuario.getNo_cuenta() +
                                    "\nSaldo: $" + usuario.getSaldo() +
                                    "\nEdad: " + usuario.getEdad());
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, "Saldo actual: $" + usuario.getSaldo());
                    break;
                case "3":
                    String montoIngreso = JOptionPane.showInputDialog("Ingrese la cantidad a depositar:");
                    try {
                        double monto = Double.parseDouble(montoIngreso);
                        usuario.ingresar(monto);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Error: Debe ingresar un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case "4":
                    String montoRetiro = JOptionPane.showInputDialog("Ingrese la cantidad a retirar:");
                    try {
                        double monto = Double.parseDouble(montoRetiro);
                        usuario.retirar(monto);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Error: Debe ingresar un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case "5":
                    String cuentaDestino = JOptionPane.showInputDialog("Ingrese la cuenta destino:");
                    String montoDeposito = JOptionPane.showInputDialog("Ingrese la cantidad a depositar:");
                    try {
                        double monto = Double.parseDouble(montoDeposito);
                        usuario.depositar(cuentaDestino, monto);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Error: Debe ingresar un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case "6":
                    JOptionPane.showMessageDialog(null, "Gracias por usar nuestro banco. ¡Hasta pronto!");
                    salir = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
            }
        }
    }
}


