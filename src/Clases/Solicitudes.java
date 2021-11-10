package Clases;

public class Solicitudes extends Inventario {

    private int subtotal;
    
    public Solicitudes(int subtotal){
        this.subtotal = subtotal;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }
    
    
}
