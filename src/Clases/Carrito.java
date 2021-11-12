package Clases;

import java.util.ArrayList;

public class Carrito{
    
    private final ArrayList<Item> items;
    private int cantidad;
    private int subtotal;
    
    public Carrito(){
        items = new ArrayList<>();
    }
    
    class Item {
        int id;
        String articulo;
        int precio;
        int stock;
        int cantidad;
        int subtotal;
        
        public int getId(){
            return id;
        }
    }
    
    //Metodo que permite agregar un item al Carrito
    public void agregarItem(int Id, String Articulo, int Precio, int Stock, int Cantidad){
        Item item = new Item();
        item.id = Id;
        item.articulo = Articulo;
        item.precio = Precio;
        item.stock = Stock;
        item.cantidad = Cantidad;
        setCantidad(Cantidad);
        item.subtotal = (Precio*Cantidad);
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
    public Item buscarItem(int ID) {
        for (Item I : items) {
            if (I.getId() == ID) {
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
    
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }
}
