package Clases;

public class Inventario {

    /**
     * @return the Articulo
     */
    public String getArticulo() {
        return Articulo;
    }

    /**
     * @param Articulo the Articulo to set
     */
    public void setArticulo(String Articulo) {
        this.Articulo = Articulo;
    }

    /**
     * @return the Precio
     */
    public int getPrecio() {
        return Precio;
    }

    /**
     * @param Precio the Precio to set
     */
    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    /**
     * @return the Cantidad
     */
    public int getCantidad() {
        return Cantidad;
    }

    /**
     * @param Cantidad the Cantidad to set
     */
    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    private String Articulo;
    private int Precio;
    private int Cantidad;
    private int ID;

}
