public class Main {
    public static void main(String[] args){
        Automoviles autoSencillo = new Automoviles();
        AutosDeportivos autoDeportivo = new AutosDeportivos();

        //Auto Sencillo
        autoSencillo.setCaballosDeFuerza(100);
        autoSencillo.setNumeroPuertas(4);
        autoSencillo.setCantidadLlantas(4);
        autoSencillo.setMatricula("ABD 145");
        autoSencillo.setMarca("Renault");

        //Auto Deportivo
        autoDeportivo.setCaballosDeFuerza(500);
        autoDeportivo.setNumeroPuertas(2);
        autoDeportivo.setCantidadLlantas(4);
        autoDeportivo.setMatricula("KYZ 639");
        autoDeportivo.setMarca("Audi");
        autoDeportivo.setTieneAleron(true);
        autoDeportivo.setModoSport(true);

        System.out.println("Marca: " + autoSencillo.getMarca()
                + "\nMatricula: " + autoSencillo.getMatricula()
                + "\nPuertas: " + autoSencillo.getNumeroPuertas()
                + "\nLlantas: " + autoSencillo.getCantidadLlantas()
                + "\nCaballos De Fuerza: " + autoSencillo.getCaballosDeFuerza());

        System.out.println("\nMarca: " + autoDeportivo.getMarca()
                + "\nMatricula: " + autoDeportivo.getMatricula()
                + "\nPuertas: " + autoDeportivo.getNumeroPuertas()
                + "\nLlantas: " + autoDeportivo.getCantidadLlantas()
                + "\nCaballos De Fuerza: " + autoDeportivo.getCaballosDeFuerza()
                + "\nTiene Aleron: " + autoDeportivo.getTieneAleron()
                + "\nTiene Modo Sport: " + autoDeportivo.getModoSport());
    }
}