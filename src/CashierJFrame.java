import javax.swing.JFrame; //para poder usar ventanas

public class CashierJFrame {

    public static void main(String[] args) {
        JFrame miVentana = new JFrame(); // esto es para abrir ventanas y el new Jframe es para iniciarla
        // Dimension d1 = new Dimension();// es un objeto para obtener el tamano de la
        // pantalla
        miVentana.setVisible(true); // con este se muestra la ventana
        miVentana.setTitle("Login"); // para poner el titulo
        miVentana.setSize(1000, 600);// para configurar el tamano de la ventana
        miVentana.setResizable(false);// para configurar si se redimensiona la ventana, el cuadro para maximizar
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Es para cerrar la ventana sin que se siga corriendo  // el proceso, mas eficiente
        //miVentana.setLocation((int) ((d1.getWidth() / 2) + 300), 100); // para posicionar la pantalla, para eso requiero
    }
}
