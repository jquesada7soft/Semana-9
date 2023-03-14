package BusinessLogic;

import java.util.ArrayList;
import Common.Persona;

public class EjercicioArrayList {

    // Variable global de tipo ArrayList para crear una lista de Personas.
    ArrayList<Persona> _vgArrayPersonas = new ArrayList<Persona>();

    public EjercicioArrayList() {

        // Cargamos las personas
        initArray();
        // Imprimimos las personas 
        printArray();

        searchPerson("1");
    }

    public void initArray() {

        int _vlQtyPerson = 5;

        for (int index = 1; _vlQtyPerson >= index; index++) {
            Persona _vlNewPerson = new Persona();
            _vlNewPerson.setIdentificacion("" + index);
            _vgArrayPersonas.add(_vlNewPerson);
        }
    }

    public void printArray() {
        int _vlSize = _vgArrayPersonas.size();

        for (int index = 0; _vlSize > index; index++) {
            System.out.println(_vgArrayPersonas.get(index));
        }
    }

    public void searchPerson(String identificacion ){

        int _vlSize = _vgArrayPersonas.size();

        for (int index = 0; _vlSize > index; index++) {
            if(_vgArrayPersonas.get(index).getIdentificacion().equals(identificacion)){
                System.out.println(_vgArrayPersonas.get(index));
            }
        }
    }

}
