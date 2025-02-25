public class Main {
    public static void main(String[] args) {

        //creamos eñ primer objeto
        Spartan masterChief = new Spartan("John",100,70,"Rifle de asalto");

        //invocamos los metodos
        masterChief.mostrarinfo();
        masterChief.atacar("Grunt");
        masterChief.recargarArma(75);
        masterChief.correr(true);

        //intento de uso de un metodo privado
        //masterChief.consultaCortana();

        //usamos get y set para cambiar atributo nombre
        masterChief.setNombre("Tania");
        masterChief.mostrarinfo();
        System.out.println(masterChief.getNombre());

        //creamos a segundo objeto
        Spartan superheroe = new Spartan("Lady Bug",70,90,"Yoyo");

        superheroe.mostrarinfo();
        superheroe.atacar("Hotmod");
        superheroe.recargarArma(200);
        superheroe.correr(false);
    }
}