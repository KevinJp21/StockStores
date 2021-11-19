package Clases;

public final class Cliente {

    private static String cedula = "";
    private static String nombre = "";
    private static String contrasena = "";
    private static boolean activo = false;

    public Cliente(String ced, String nom, String cont, boolean act) {
        cedula = ced;
        nombre = nom;
        contrasena = cont;
        activo = act;
    }

    public Cliente() {
        //nada.
    }

    public static String getCedula() {
        return cedula;
    }

    public static String getNombre() {
        return nombre;
    }

    public static String getContrasena() {
        return contrasena;
    }

    public static void setCedula(String ced) {
        cedula = ced;
    }

    public static void setNombre(String nom) {
        nombre = nom;
    }

    public static void setContrasena(String cont) {
        contrasena = cont;
    }

    public static boolean isActivo() {
        return activo;
    }

    public static void setActivo(boolean act) {
        activo = act;
    }

}
