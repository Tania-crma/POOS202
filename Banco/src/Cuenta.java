import javax.swing.*;

public class Cuenta {

    private String titular;
    private int no_cuenta, edad = 21;
    private double saldo;

    public Cuenta() {
        saldo = 100;
    }

    public Cuenta(String titular, int edad, int no_cuenta, double saldo) {
        this.titular = titular;
        this.edad = edad;
        this.no_cuenta = no_cuenta;
        this.saldo = saldo;
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

    public int getNo_cuenta() {
        return no_cuenta;
    }

    public void setNo_cuenta(int no_cuenta) {
        this.no_cuenta = no_cuenta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}


