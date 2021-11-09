package Clases;

public class Usuario {

    private int Cedula;
    private String Nombre;
    private String Contraseña;
    private char tusuario;

    public int getCedula() {
        return Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public char getTipoUsuario() {
        return tusuario;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public void setUsuario(char usuario) {
        this.tusuario = usuario;
    }
}
