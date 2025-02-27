import javax.swing.*;
import java.util.Random;

public class metodos {
    private int longitud = 8;
    private boolean incluirMayusculas = false;
    private boolean incluirEspeciales = false;
    private String passwordGenerado = "";

    public metodos(int longitud, boolean incluirMayusculas, boolean incluirEspeciales, String passwordGenerado) {
        this.longitud = longitud;
        this.incluirMayusculas = incluirMayusculas;
        this.incluirEspeciales = incluirEspeciales;
        this.passwordGenerado = passwordGenerado;
    }

    public void solicitar() {
        String inputLongitud = JOptionPane.showInputDialog("Introduce la longitud de la contraseña:");
        if (inputLongitud != null && !inputLongitud.isEmpty()) {
            longitud = Integer.parseInt(inputLongitud);
        }

        incluirMayusculas = JOptionPane.showConfirmDialog(null, "¿Incluir mayúsculas?", "Mayúsculas", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        incluirEspeciales = JOptionPane.showConfirmDialog(null, "¿Incluir caracteres especiales?", "Caracteres Especiales", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
    }

    public void creacion() {
        String caracteres = "abcdefghijklmnopqrstuvwxyz";
        if (incluirMayusculas) {
            caracteres += "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        }
        if (incluirEspeciales) {
            caracteres += "!@#$%^&*()_+";
        }

        Random random = new Random();
        StringBuilder sb = new StringBuilder(longitud);
        for (int i = 0; i < longitud; i++) {
            int index = random.nextInt(caracteres.length());
            sb.append(caracteres.charAt(index));
        }
        passwordGenerado = sb.toString();
        JOptionPane.showMessageDialog(null, "Contraseña generada: " + passwordGenerado);
    }

    public void evaluar() {
        int fortaleza = 0;
        if (passwordGenerado.length() >= 12) fortaleza++;
        if (passwordGenerado.matches(".*[A-Z].*")) fortaleza++;
        if (passwordGenerado.matches(".*[!@#$%^&*()_+].*")) fortaleza++;
        if (passwordGenerado.matches(".*[0-9].*")) fortaleza++;

        String mensaje;
        if (fortaleza >= 3) {
            mensaje = "La contraseña es fuerte.";
        } else if (fortaleza == 2) {
            mensaje = "La contraseña es moderada.";
        } else {
            mensaje = "La contraseña es débil.";
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public void modificar() {
        String nuevaContraseña = JOptionPane.showInputDialog("Introduce la nueva contraseña:");
        if (nuevaContraseña != null && !nuevaContraseña.isEmpty()) {
            passwordGenerado = nuevaContraseña;
            JOptionPane.showMessageDialog(null, "Contraseña modificada con éxito.");
        } else {
            JOptionPane.showMessageDialog(null, "No se ha introducido ninguna contraseña.");
        }
    }

    public void mostrar() {
        if (passwordGenerado.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se ha generado ninguna contraseña.");
        } else {
            JOptionPane.showMessageDialog(null, "La contraseña generada es: " + passwordGenerado);
        }
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public boolean isIncluirMayusculas() {
        return incluirMayusculas;
    }

    public void setIncluirMayusculas(boolean incluirMayusculas) {
        this.incluirMayusculas = incluirMayusculas;
    }

    public boolean isIncluirEspeciales() {
        return incluirEspeciales;
    }

    public void setIncluirEspeciales(boolean incluirEspeciales) {
        this.incluirEspeciales = incluirEspeciales;
    }

    public String getPasswordGenerado() {
        return passwordGenerado;
    }

    public void setPasswordGenerado(String passwordGenerado) {
        this.passwordGenerado = passwordGenerado;
    }

}
