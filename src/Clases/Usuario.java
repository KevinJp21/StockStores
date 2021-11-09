package Clases;

public class Usuario {

    private String ID;
    private String Nombre;
    private String Apellido;
    private int Contraseña;
    private char tusuario;

    public String getCedula() {
        return ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getContraseña() {
        return Contraseña;
    }

    public char getUsuario() {
        return tusuario;
    }

    public void setCedula(String Cedula) {
        this.ID = Cedula;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setContraseña(int Contraseña) {
        this.Contraseña = Contraseña;
    }

    public void setUsuario(char usuario) {
        this.tusuario = usuario;
    }
}
