public class PrisonTest {
    public static void main(String[] args){
        Cell celdaA1 = new Cell("A1", false, 1234);
	celdaA1.setPuerta(1234);
        Prisonero bubba = new Prisonero("Bubba", 2.08, 4, celdaA1);
        bubba.frase();
        bubba.muestra();
	celdaA1.setPuerta(3214);
	celdaA1.setPuerta(1234);
	int numeroprisioneros = bubba.getNumpri();
	System.out.println("Cantidad de prisioneros: " + numeroprisioneros);
    }
}