import javax.swing.*;

public class Conductor {
    private String nombre;
    private String identificacion;
    private String licencia;

    public Conductor(String nombre, String identificacion, String licencia) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.licencia = licencia;
    }

    public void solicitar() {
        this.nombre = JOptionPane.showInputDialog("Digite su nombre:");
        this.identificacion = JOptionPane.showInputDialog("Digite su identificación:");
        this.licencia = JOptionPane.showInputDialog("Digite su licencia:");
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }
}
