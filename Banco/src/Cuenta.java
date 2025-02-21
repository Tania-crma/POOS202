import javax.swing.*;

public class Cuenta {

    String titular;
    int no_cuenta, edad = 21;
    double saldo;

    public Cuenta() {
        saldo = 100;
    }

    public void informacion() {
        JOptionPane.showMessageDialog(null,
                "--------- Información del usuario ---------\n" +
                        "Usuario: " + titular + "\n" +
                        "No. Cuenta: " + no_cuenta + "\n" +
                        "Edad: " + edad + " años\n" +
                        "Saldo disponible: $" + saldo +
                        "\n------------------------------------------");
    }

    public void ingresar(double valor) {
        if (valor > 0) {
            saldo += valor;
            JOptionPane.showMessageDialog(null, "Depósito exitoso, Su saldo ahora es de: $" + saldo);
        } else {
            JOptionPane.showMessageDialog(null, "Error: La cantidad debe ser mayor a 0.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void retirar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            JOptionPane.showMessageDialog(null, "Retiro exitoso, Su saldo ahora es de: $" + saldo);
        } else {
            JOptionPane.showMessageDialog(null, "Error: Fondos insuficientes o cantidad inválida.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void depositar(String cuentaDestino, double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            JOptionPane.showMessageDialog(null,
                    "Transferencia exitosa a la cuenta: " + cuentaDestino + "\n" +
                             "Su saldo ahora es de: $" + saldo);
        } else {
            JOptionPane.showMessageDialog(null, "Error: Fondos insuficientes o cantidad inválida.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNoCuenta() {
        return no_cuenta;
    }

    public int getEdad() {
        return edad;
    }

    public void setNoCuenta(int no_cuenta) {
        this.no_cuenta = no_cuenta;
    }

    public double getSaldo() {
        return saldo;
    }
}


