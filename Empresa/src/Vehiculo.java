import javax.swing.*;

public class Vehiculo {

    private String placa;
    private String modelo;
    private double capacidad;
    private Conductor conductor;

    public Vehiculo(String placa, String modelo, double capacidad) {
        this.placa = placa;
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.conductor = null;
    }

    public void solicitar() {
        this.placa = JOptionPane.showInputDialog("Digite su placa:");
        this.modelo = JOptionPane.showInputDialog("Digite su modelo:");
        this.capacidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la capacidad:"));
    }

    public void asignarConductor(Conductor conductor) {
        if (this.conductor == null) {
            this.conductor = conductor;
            JOptionPane.showMessageDialog(null, "Conductor asignado correctamente: " + conductor.getNombre());
        } else {
            JOptionPane.showMessageDialog(null, "El conductor ya ha sido asignado y no puede cambiarse.");
        }
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public double getCapacidad() {
        return capacidad;
    }
}


