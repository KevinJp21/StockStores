package Clases;

import java.util.ArrayList;

public class Carrito{
    
    private final ArrayList<Item> items;
    private String cantidad;
    private int subtotal;
    
    public Carrito(){
        items = new ArrayList<>();
    }
    
    class Item {
        String id;
        String articulo;
        String precio;
        String stock;
        String cantidad;
        int subtotal;
        
        public String getId(){
            return id;
        }
    }
    
    //Metodo que permite agregar un item al Carrito
    public void agregarItem(String Id, String Articulo, String Precio, String Stock, String Cantidad){
        Item item = new Item();
        item.id = Id;
        item.articulo = Articulo;
        item.precio = Precio;
        item.stock = Stock;
        item.cantidad = Cantidad;
        setCantidad(Cantidad);
        item.subtotal = (Integer.parseInt(Precio)*Integer.parseInt(Cantidad));
        setSubtotal(item.subtotal);
        items.add(item);
    }
    
    //Metodo que permite eliminar un item del Carrito
    public void eliminarItem(Item I) {
        items.remove(I);
    }
    
    //Obtiene el tamaño o longitud del ArrayList
    public int getTamano() {
        return (items.size());
    }
    
    //Metodo que busca un item por la ID
    public Item buscarItem(String ID) {
        for (Item I : items) {
            if (I.getId().equals(ID)) {
                return (I);
            }
        }
        return (null);
    }
    
    //Calcula el precio total de todos los items en el carrito
    public int calcularTotal() {
        int cont = 0;
        for (Item I : items) {
            cont = cont + I.subtotal;
        }
        return cont;
    }
    
    //Selecciona la posicion del objeto en la lista
    public Item posicionItem(int pos) {
        return (items.get(pos));
    }
    
    //Devuelve la posición del objeto en la lista
    public int indexItem(Item I){
        return (items.indexOf(I));
    }
    
    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }
}
