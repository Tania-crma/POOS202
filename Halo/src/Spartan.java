public class Spartan {

    private String nombre;
    private int escudo, salud;
    private String armasPrincipal;

    public Spartan(String nombre, int escudo, int salud, String armasPrincipal) {
        this.nombre = nombre;
        this.escudo = escudo;
        this.salud = salud;
        this.armasPrincipal = armasPrincipal;
    }

    public void mostrarinfo(){
        System.out.println("--------Infromacion del Spartan--------");
        System.out.println("Nombre: " + nombre);
        System.out.println("% de Salud: " + salud);
        System.out.println("% de Escudo: " + escudo);
        System.out.println("Armas disponible: " + armasPrincipal);
        System.out.println("----------------------------------------");
    }

    public void atacar(String enemigo){
        System.out.println(nombre + " ataca a " + enemigo + " con " + armasPrincipal);
    }

    public void recargarArma(int municiones){
        int restantes = 10;
        int total = restantes + municiones;
        System.out.println(armasPrincipal + " ahora tiene disponible " + total + " balas");
    }

    public void correr(boolean status){
        if(status){
            System.out.println(nombre + " esta corriendo.....");
        } else {
            System.out.println(nombre + " se detuvo");
        }
    }

    private void consultaCortana(){
            System.out.println("Conversacion privada.....");
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public String getArmasPrincipal() {
        return armasPrincipal;
    }

    public void setArmasPrincipal(String armasPrincipal) {
        this.armasPrincipal = armasPrincipal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

