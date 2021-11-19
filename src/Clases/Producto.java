package Clases;

import java.util.ArrayList;
import java.util.List;

public class Producto {

    private String id;
    private String articulo;
    private String precio;
    private String stock;
    private List<Inventario> inventario;

    public Producto(String id, String articulo, String precio, String stock, Inventario inventario) {
        this.id = id;
        this.articulo = articulo;
        this.precio = precio;
        this.stock = stock;
        this.agregarproducto(inventario);

    }

    public Producto() {

    }

    public void agregarproducto(Inventario Stock) {
        if (this.getInventario() != null) {
            this.getInventario().add(Stock);
        } else {
            this.setInventario(new ArrayList<Inventario>());
            this.getInventario().add(Stock);
        }
    }

    public int getTamano() {
        if (this.getInventario() == null) {
            return (0);
        } else {
            return (getInventario().size());
        }

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

    public List<Inventario> getInventario() {
        return inventario;
    }

    public void setInventario(List<Inventario> inventario) {
        this.inventario = inventario;
    }

}