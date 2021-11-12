package Clases;

public class Vendedor {

    private String cedula;
    private String nombre;
    private String contrasena;
    private char tipo;

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setCedula(String Cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String Nombre) {
        this.nombre = nombre;
    }

    public void setContrasena(String Contrasena) {
        this.contrasena = contrasena;
    }
    
    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
}

