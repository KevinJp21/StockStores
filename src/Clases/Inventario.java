package Clases;

import java.util.ArrayList;
import java.util.List;

public class Inventario {

    private ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public void agregar(Producto SF) {
        productos.add(SF);
    }

    //Metodo que permite eliminar un objeto del ArrayList
    public void eliminarProducto(Producto P) {
        productos.remove(P);
    }

    //Obtiene el tamaño o longitud del ArrayList
    public int getTamano() {
        return (productos.size());
    }

    //Metodo que busca un producto por la ID
    public Producto buscarProducto(String ID) {
        for (Producto P : productos) {
            if (P.getId().equals(ID)) {
                return (P);
            }
        }
        return (null);
    }

    //Selecciona la posicion del objeto en la lista
    public Producto posicionProducto(int pos) {
        return (productos.get(pos));
    }

    //Devuelve la posición del objeto en la lista
    public int indexProducto(Producto P) {
        return (productos.indexOf(P));
    }

}
