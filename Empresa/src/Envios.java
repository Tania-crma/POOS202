import javax.swing.*;

public class Envios {
    private String codigo;
    private String destino;
    private double peso;

    public Envios(String codigo, String destino) {
        this.codigo = codigo;
        this.destino = destino;
        this.peso = 0;
    }

    public Envios(String codigo, String destino, double peso) {
        this.codigo = codigo;
        this.destino = destino;
        this.peso = peso;
    }

    public static Envios crearEnvio() {
        String codigo = JOptionPane.showInputDialog("Digite el código:");
        if (codigo == null || codigo.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Código inválido. No se creó el envío.");
            return null;
        }

        String destino = JOptionPane.showInputDialog("Digite el destino:");
        if (destino == null || destino.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Destino inválido. No se creó el envío.");
            return null;
        }

        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea ingresar el peso?", "Confirmar", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {
            String pesoStr = JOptionPane.showInputDialog("Digite el peso:");
            if (pesoStr != null && !pesoStr.trim().isEmpty()) {
                try {
                    double peso = Double.parseDouble(pesoStr);
                    return new Envios(codigo, destino, peso);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Peso inválido. Se asignará un valor de 0.");
                }
            }
        }
        return new Envios(codigo, destino);
    }

    public double getPeso() {
        return peso;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDestino() {
        return destino;
    }
}
