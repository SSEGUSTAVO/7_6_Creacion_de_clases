public class Cell {
    private String nombre;
    private boolean puerta;
    private int codigo;
    
    public Cell(String nombre, boolean puerta, int codigo){
        this.nombre = nombre;
        this.puerta = puerta;
        this.codigo = codigo;
    }
    
    public String getNombre(){
        return nombre;
    }
    public boolean getPuerta(){
        return puerta;
    }
    
    public void setPuerta(int codigo){
        if(codigo != this.codigo){
            System.out.println("Pin incorrecto.");
        }
        else{
            if(this.puerta == true){
                this.puerta = false;
                System.out.println("Celda " +nombre +" Cerrada");
            }
            else{
                this.puerta = true;
                System.out.println("Celda " +nombre +" Abierta");
            }
        }
    }
}