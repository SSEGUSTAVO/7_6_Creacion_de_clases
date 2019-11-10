public class Prisonero {
    //Campos
    private String nombre;
    private double altura;
    private int sentencia;
    private Cell celda;
    private static int numeroprisioneros = 0;
    public int buscarnumero = numeroprisioneros;
    //Constructor
    public Prisonero(String nombre, double altura, int sentencia, Cell celda){
 	this.nombre = nombre;
 	this.altura = altura;
 	this.sentencia = sentencia;
        this.celda = celda;
	this.numeroprisioneros++;
    }
    //Metodos
    public void frase(){
        System.out.println("Volveré en 3 horas, no menos 5.");
    }
    public void muestra(){
        System.out.println("Nombre: " +getNombre());
        System.out.println("Altura: " +getAltura() +" m");
        System.out.println("Sentencia: " +getSentencia() +" años");
        System.out.println("Celda: " +getCell().getNombre());
	System.out.println("Número de prisioneros: " + this.numeroprisioneros);
	System.out.println(buscarnumero);
    }
    //Getter
    public String getNombre() {
        return nombre;
    }
    public double getAltura() {
        return altura;
    }
    public int getSentencia() {
        return sentencia;
    }
    public Cell getCell() {
        return celda;
    }
    public int getNumpri() {
        return numeroprisioneros;
    }
    //Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setSentencia(int sentencia) {
        this.sentencia = sentencia;
    }
    public void setCell(Cell celda) {
        this.celda = celda;
    }
}