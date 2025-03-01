import javax.swing.*;

public class Entrega {
    private long NumeroGuia;
    private String estado;

    public Entrega(long NumeroGuia) {
        this.NumeroGuia = NumeroGuia;
        this.estado = "Pendiente";
    }

    public void actualizarEstado() {
        String nuevoEstado = JOptionPane.showInputDialog("Ingrese el nuevo estado (En tránsito / Entregado):");

        if (nuevoEstado != null) {
            nuevoEstado = nuevoEstado.trim();

            switch (nuevoEstado.toLowerCase()) {
                case "en tránsito":
                case "entregado":
                    this.estado = nuevoEstado;
                    JOptionPane.showMessageDialog(null, "Estado actualizado a: " + this.estado);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Estado no válido. Solo puede ser 'En tránsito' o 'Entregado'.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No ingresó ningún estado.");
        }
    }

    public long getNumeroGuia() {
        return NumeroGuia;
    }

    public String getEstado() {
        return estado;
    }
}


