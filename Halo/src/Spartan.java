public class Spartan {

    public String nombre;
    int escudo, salud;
    String armasPrincipal;

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
}

