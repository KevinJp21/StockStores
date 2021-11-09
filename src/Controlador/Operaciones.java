
package Controlador;


public class Operaciones {
         //Valida si es una cadena que se escribo
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
     public boolean Esnumero(String cadena) {
        if (cadena.matches("[0-9]+")) {
            return (true);
        } else {
            return (false);
        }
    }
    
     public boolean EsContraseña(String cadena) {
        if (cadena.matches("^(?=\\w*\\d)(?=\\w*[A-Z])(?=\\w*[a-z])\\S{8,16}$")) {
            return (true);
        } else {
            return (false);
        }
    }
    
     
    

}
