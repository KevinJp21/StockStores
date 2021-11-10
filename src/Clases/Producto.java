package Clases;

public class Producto {

    private int id;
    private String articulo;
    private int precio;
    private int stock;

    public Producto() {
        // nada.
    }

    public Producto(int id, String articulo, int precio, int stock) {
        this.id = id;
        this.articulo = articulo;
        this.precio = precio;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

}
