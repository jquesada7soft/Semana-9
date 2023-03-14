package Common;

public class User {
    // Propiedades
    public String Usuario;
    public String Contrasenna;
    public Account[] arregloCuentas;

    // Metodos constructores es el metodo de inicio de arranque de la clase donde se
    // define el valor inicial de sus propiedades.
    public User() {
        Usuario = "";
        Contrasenna = "";
        arregloCuentas = new Account[2];
    }

    // Metodos o funciones
    public String getUsuario(){
        return Usuario;
    } 
}
