package Clases;

public class Producto {

    private String id;
    private String articulo;
    private String precio;
    private String stock;

    public Producto() {
        // nada.
    }

    public Producto(String id, String articulo, String precio, String stock) {
        this.id = id;
        this.articulo = articulo;
        this.precio = precio;
        this.stock = stock;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

}
