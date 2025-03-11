import javax.swing.*;
import java.util.Random;

public class Datos {

    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private int nacimiento;
    private String carrera;

    public Datos(String nombre, String apellido_paterno, String apellido_materno, String carrera, int nacimiento) {
        this.nombre = nombre;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.nacimiento = nacimiento;
        this.carrera = carrera;
    }

    public void solicitud() {
        this.nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        this.apellido_paterno = JOptionPane.showInputDialog("Ingrese su apellido paterno");
        this.apellido_materno = JOptionPane.showInputDialog("Ingrese su apellido materno");
        this.nacimiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su año de nacimiento"));
        this.carrera = JOptionPane.showInputDialog("Ingrese el nombre de su carrera");
    }

    public void matricula() {

        int year = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        String yearCurrentLastTwo = String.format("%02d", year % 100);
        String yearBirthLastTwo = String.format("%02d", this.nacimiento % 100);

        String firstNameLetter = this.nombre.substring(0, 1).toUpperCase();
        String firstLastNameLetter = this.apellido_paterno.substring(0, 1).toUpperCase();
        String secondLastNameLetter = this.apellido_materno.substring(0, 1).toUpperCase();

        Random random = new Random();
        int randomDigits = random.nextInt(900) + 100;

        String carreraAbbreviation = this.carrera.substring(0, Math.min(3, this.carrera.length())).toUpperCase();

        String matricula = yearCurrentLastTwo + yearBirthLastTwo + firstNameLetter + firstLastNameLetter +
                secondLastNameLetter + randomDigits + carreraAbbreviation;

        JOptionPane.showMessageDialog(null, "Tu matrícula es: " + matricula);
    }
    public static void main(String[] args) {
        Datos datos = new Datos("","","","",0);

        datos.solicitud();
        datos.matricula();

    }
}
