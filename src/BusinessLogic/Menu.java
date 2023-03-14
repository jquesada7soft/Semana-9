package BusinessLogic;

import java.util.ArrayList;
import java.util.Scanner;

import Common.Account;
import Common.User;

public class Menu {

    // Variable global.

    // Esta variable de tipo arreglo de la clase de usuario tiene un tama;o de 2.
    public User[] _arregloUsuarioSistemas = new User[2];
    // La vamos a utilizar para guardar el usuario que realizo el login
    // correctamente.
    public User _usuarioQueInicioSesion;

    Scanner entrada = new Scanner(System.in);

    //
    /**
     * Constructor
     */
    public Menu() {
        // Paso 1 registrar usuarios.
        RegistrarUsuarioDelSistema();

        // Paso 2 registrar cuentas.
        RegistraCuentas();

        // Paso 3 validar las credenciales del usuario
        Auth();
    }

    /**
     * Metodo encargado de registar los usuarios que van a estar activos para el
     * sistema.
     */
    public void RegistrarUsuarioDelSistema() {
        // Crear el primer usuario Admin.
        User usuarioAdmin = new User();
        usuarioAdmin.setUsuario("Admin");
        usuarioAdmin.setContrasenna("123");

        // Crear el segundo usuario Demo.
        User usuarioDemo = new User();
        usuarioDemo.setUsuario("Demo");
        usuarioDemo.setContrasenna("456");

        // Almacenar el usuario en nuestro arreglo.
        _arregloUsuarioSistemas[0] = usuarioAdmin;
        _arregloUsuarioSistemas[1] = usuarioDemo;

        // for (int indice = 0; _arregloUsuarioSistemas.length > indice; indice++) {

        // Usuario user = _arregloUsuarioSistemas[indice];
        // System.out.println(user.Usuario);
        // }
    }

    public void RegistraCuentas() {

        for (int indice = 0; _arregloUsuarioSistemas.length > indice; indice++) {

            Account cuentaCorrienta = new Account();
            cuentaCorrienta.Type = "Corriente";
            cuentaCorrienta.Coin = "Colones";
            cuentaCorrienta.Balance = 5000.00;
            cuentaCorrienta.AccountNumber = "CRC202336";

            _arregloUsuarioSistemas[indice].getArregloCuentas().add(cuentaCorrienta);

            Account cuentaAhorro = new Account();
            cuentaCorrienta.Type = "Corriente";
            cuentaCorrienta.Coin = "Colones";
            cuentaCorrienta.Balance = 5000.00;
            cuentaCorrienta.AccountNumber = "CRC202336";

            _arregloUsuarioSistemas[indice].getArregloCuentas().add(cuentaAhorro);
        }

    }

    public boolean Login(String pUsuario, String pConstrasenna) {

        for (int indice = 0; _arregloUsuarioSistemas.length > indice; indice++) {

            String _usuario = _arregloUsuarioSistemas[indice].getUsuario();
            String _contrasenna = _arregloUsuarioSistemas[indice].getContrasenna();

            if (pUsuario.equals(_usuario) && pConstrasenna.equals(_contrasenna)) {
                _usuarioQueInicioSesion = _arregloUsuarioSistemas[indice];
                return true;
            }
        }

        return false;
    }

    public void MenuPrincipal() {
        // Scanner entrada = new Scanner(System.in);

        int opcionseleccionada;
        do {

            System.out.println("");
            System.out.println("Sistema de Auth de usuarios");
            System.out.println("1. Ver mis cuentas!");
            System.out.println("2. Deposito a mis cuentas!");
            System.out.println("0. Salir");
            System.out.println("Elija una de las opciones del menu");

            opcionseleccionada = entrada.nextInt();

            switch (opcionseleccionada) {

                case 1:
                    VerCuentas();
                    break;
                case 2:
                    Deposito();
                    break;
                default:
                    System.out.println("Opcion es invalida");
            }
        } while (opcionseleccionada != 0);

        // entrada.close();
    }

    public void Auth() {

        int opcionseleccionada = -1;

        do {

            System.out.println("Por favor ingrese su usuario");
            String usuario = entrada.next();
            System.out.println("Por favor ingrese su contrasenna");
            String contrasenna = entrada.next();
            boolean resultado = Login(usuario, contrasenna);

            if (resultado) {
                System.out.println("Bienvenido a nuestros sistema de servicio al cliente!");

                MenuPrincipal();
            } else {
                System.out.println("Los datos ingresados son incorrectos!");
            }

        } while (opcionseleccionada != 0);

        // entrada.close();
    }

    public void VerCuentas() {

        // Obtenemos de las cuentas del usuario y las asignamos a una variable para
        // recorrerlas.
        ArrayList<Account> cuentasDelUsuario = _usuarioQueInicioSesion.getArregloCuentas();

        // Paso 1 debo recorrer las cuentas del arreglo del usuario logueado.
        for (int indice = 0; cuentasDelUsuario.size() > indice; indice++) {
            System.out.println("Tipo > " + cuentasDelUsuario.get(indice).Type + " NumeroCuenta > "
                    + cuentasDelUsuario.get(indice).AccountNumber);
        }
        // Paso 2 debo imprimir los datos.

    }

    public void Deposito() {
        // Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor ingrese el # de cuenta");
        String NumeroCuenta = entrada.next();

        System.out.println("Por favor ingrese el monto a depositar");
        Double MontoDepositar = entrada.nextDouble();

        for (int indice = 0; _usuarioQueInicioSesion.getArregloCuentas().size() > indice; indice++) {
            if (_usuarioQueInicioSesion.getArregloCuentas().get(indice).AccountNumber.equals(NumeroCuenta)) {

                System.out.println("Saldo anterior: " + _usuarioQueInicioSesion.getArregloCuentas().get(indice).Balance);
                _usuarioQueInicioSesion.getArregloCuentas()
                        .get(indice).Balance = _usuarioQueInicioSesion.getArregloCuentas().get(indice).Balance
                                + MontoDepositar;
                System.out.println("Saldo actual: " + _usuarioQueInicioSesion.getArregloCuentas().get(indice).Balance);

                return;
            }
        }

        System.out.println("El # de cuenta es incorrecto!");

        // entrada.close();
    }
}
