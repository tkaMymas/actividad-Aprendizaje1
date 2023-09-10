public class Automoviles {
    private float caballosDeFuerza;
    private int numeroPuertas, cantidadLlantas;
    private String matricula, marca;

    //Setters
    public void setCaballosDeFuerza(float caballosDeFuerza) {this.caballosDeFuerza = caballosDeFuerza;}
    public void setNumeroPuertas(int numeroPuertas) {this.numeroPuertas = numeroPuertas;}
    public void setCantidadLlantas(int cantidadLlantas) {this.cantidadLlantas = cantidadLlantas;}
    public void setMatricula(String matricula) {this.matricula = matricula;}
    public void setMarca(String marca) {this.marca = marca;}

    //Getters
    public float getCaballosDeFuerza() {return caballosDeFuerza;}
    public int getNumeroPuertas() {return numeroPuertas;}
    public int getCantidadLlantas() {return cantidadLlantas;}
    public String getMatricula() {return matricula;}
    public String getMarca() {return marca;}
}