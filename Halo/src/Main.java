public class Main {
    public static void main(String[] args) {

        //creamos eñ primer objeto
        Spartan masterChief = new Spartan();

        //usamos sus atributos
        masterChief.nombre = "John";
        masterChief.salud = 100;
        masterChief.escudo = 70;
        masterChief.armasPrincipal = "Rifle de asalto";

        //invocamos los metodos
        masterChief.mostrarinfo();
        masterChief.atacar("Grunt");
        masterChief.recargarArma(75);
        masterChief.correr(true);

        //creamos a segundo objeto
        Spartan superheroe = new Spartan();

        superheroe.nombre = "Lady Bug";
        superheroe.salud = 100;
        superheroe.escudo = 90;
        superheroe.armasPrincipal = "Yoyo";

        superheroe.mostrarinfo();
        superheroe.atacar("Hotmod");
        superheroe.recargarArma(200);
        superheroe.correr(false);
    }
}