package Controlador;

public class Operaciones {

    // valida si es una cadena que se escribo
    public boolean Estexto(String cad) {
        boolean sw = true;
        int lc = cad.length(), i;
        i = 0;
        char simbolo;
        while ((i < lc) && (sw)) {
            simbolo = cad.charAt(i);
            if (!(Character.isLetter(simbolo) || Character.isWhitespace(simbolo))) {
                sw = false;
            }
            i++;
        }
        return (sw);
    }
    
    // valida si lo que se escribio es un numero
    public boolean Esnumero(String cadena) {
        if (cadena.matches("[0-9]+")) {
            return (true);
        } else {
            return (false);
        }
    }
    
    // valida si lo que se escribio es una contrasena
    public boolean EsContrasena(String cadena) {
        if (cadena.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}$")) {
            return (true);
        } else {
            return (false);
        }

    }
}
