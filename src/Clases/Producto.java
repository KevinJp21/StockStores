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
     public int getTamaño() {
        if (this.getInventario()== null) {
            return (0);
        } else {
            return (getInventario().size());
        }

    }

   
  
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the articulo
     */
    public String getArticulo() {
        return articulo;
    }

    /**
     * @param articulo the articulo to set
     */
    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    /**
     * @return the precio
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(String precio) {
        this.precio = precio;
    }

    /**
     * @return the stock
     */
    public String getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(String stock) {
        this.stock = stock;
    }

    /**
     * @return the inventario
     */
    public List<Inventario> getInventario() {
        return inventario;
    }

    /**
     * @param inventario the inventario to set
     */
    public void setInventario(List<Inventario> inventario) {
        this.inventario = inventario;
    }
     

    

}