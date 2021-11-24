package Clases;

import java.util.ArrayList;
import java.util.List;

public class Item {

    private String id;
    private String articulo;
    private String precio;
    private String stock;
    private String cantidad;
    public String subtotal;
    private List<Carrito> carrito;

    public Item(String id, String articulo, String precio, String stock, String cantidad, String subtotal, Carrito carrito) {
        this.id = id;
        this.articulo = articulo;
        this.precio = precio;
        this.stock = stock;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.agregarItem(carrito);

    }

    public Item() {
        //nada.
    }

    public void agregarItem(Carrito item) {
        if (this.getCarrito() != null) {
            this.getCarrito().add(item);
        } else {
            this.setCarrito(new ArrayList<Carrito>());
            this.getCarrito().add(item);
        }
    }

    public int getTamano() {
        if (this.getCarrito() == null) {
            return (0);
        } else {
            return (getCarrito().size());
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
    
     public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

    public List<Carrito> getCarrito() {
        return carrito;
    }

    public void setCarrito(List<Carrito> carrito) {
        this.carrito = carrito;
    }

}
