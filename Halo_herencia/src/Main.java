public class Main {
    public static void main(String[] args) {

        // CREACION DE UN OBJETO
        SpartanII JefeMaestro = new SpartanII("Jhon",98,"Rifle de asalto", 0);

        // USO DE METODOS
        JefeMaestro.mostrarInfo();
        JefeMaestro.usarManejosAvanzado();
        JefeMaestro.atacar("Covenant");
        JefeMaestro.recibirDano(50);
        JefeMaestro.recargarEscudo();

        System.out.println("------------------------");

        // CREACION DE UN SEGUNDO OBJETO
        SpartanIII Noble6 = new SpartanIII("Tania", 75,"Espada de energia",0);
        SpartanIV Locke = new SpartanIV("Asu",100,"Pistola", 25);

        // USO DE METODOS
        Noble6.mostrarInfo();
        Noble6.camuflajeActivo();
        Noble6.recibirDano(10);

        System.out.println("------------------");
        Locke.mostrarInfo();
        Locke.usarPropulsores();
        Locke.atacar("Halo");

    }
}