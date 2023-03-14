package Common;

import java.util.ArrayList;

public class User {
    // Propiedades
    private String Usuario;
    private String Contrasenna;
    private ArrayList<Account> arregloCuentas;

    // Metodos constructores es el metodo de inicio de arranque de la clase donde se
    // define el valor inicial de sus propiedades.
    public User() {
        Usuario = "";
        Contrasenna = "";
        arregloCuentas = new ArrayList<Account>();
    }

    // Metodos o funciones
    public String getUsuario(){
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getContrasenna() {
        return Contrasenna;
    }

    public void setContrasenna(String contrasenna) {
        Contrasenna = contrasenna;
    }

    public ArrayList<Account> getArregloCuentas() {
        return arregloCuentas;
    }

    public void setArregloCuentas(ArrayList<Account> arregloCuentas) {
        this.arregloCuentas = arregloCuentas;
    } 

    
}
