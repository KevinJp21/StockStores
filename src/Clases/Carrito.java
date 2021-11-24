package Clases;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private ArrayList<Item> items;

    public Carrito() {
        items = new ArrayList<>();
    }

    public void agregarItem(Item I) {
        items.add(I);
    }

    //Metodo que permite eliminar un item del ArrayList
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

    //Selecciona la posicion del objeto en la lista
    public Item posicionItem(int pos) {
        return (items.get(pos));
    }

    //Devuelve la posición del objeto en la lista
    public int indexItem(Item I) {
        return (items.indexOf(I));
    }
    
    //Calcula el precio total de todos los items en el carrito
    public int calcularTotal() {
        int cont = 0;
        for (Item I : items) {
            cont = cont + Integer.parseInt(I.subtotal);
        }
        return cont;
    }

}
