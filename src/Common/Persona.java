package Common;

public class Persona {

    private String Identificacion; // 206130309 - 0206130309 -
    private String Nombre;
    private String PrimerApellido;
    private String SegundoApellido;

    /**
     * @author jquesada
     * @description Constructor sin parametos
     * 
     *              Inicializa las propiedades con un valor por defecto ya sea
     *              valores iniciales como vacios --> o 0 --> numericos.
     */
    public Persona() {
        Identificacion = "203210654";
        Nombre = "John";
        PrimerApellido = "Quesada";
        SegundoApellido = "Chaves";
    }

    /**
     * @author jquesada
     * @description Constructorque recibe parametros
     * 
     * @param identificacion
     * @param nombre
     * @param primerApellido
     * @param segundoApellido
     */
    public Persona(String identificacion, String nombre, String primerApellido, String segundoApellido) {
        Identificacion = identificacion;
        Nombre = nombre;
        PrimerApellido = primerApellido;
        SegundoApellido = segundoApellido;
    }

    /**
     * @author jquesada
     * @creationdate 13/03/2023
     * @description Metodo get encargado de retornar el valor de la propiedad
     *              identificacion
     * 
     * @return
     */
    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String identificacion) {
        Identificacion = identificacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getPrimerApellido() {
        return PrimerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        PrimerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return SegundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        SegundoApellido = segundoApellido;
    }

    @Override
    public String toString() {
        return "Persona [Identificacion=" + Identificacion + ", Nombre=" + Nombre + ", PrimerApellido=" + PrimerApellido
                + ", SegundoApellido=" + SegundoApellido + "]";
    }

}