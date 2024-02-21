package logica;

import jakarta.persistence.CascadeType;
import java.io.Serializable;
import java.util.ArrayList;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

/**
 *
 * @author Ian
 */
@Entity
public class Propietario extends Persona implements Serializable {
     
    @OneToMany(mappedBy="propietario", cascade = CascadeType.REMOVE)
    private ArrayList<Auto> autos = new ArrayList<>();
    
    
    public Propietario() {
    }

    public Propietario(int id, String nombre, String apellido, ArrayList<Auto> autos, int dni, int telefono) {
        super(id,nombre,apellido,dni, telefono);
        this.autos = autos;
    }


    public ArrayList<Auto> getAutos() {
        return autos;
    }

    public void setAutos(ArrayList<Auto> autos) {
        this.autos = autos;
    }  
}
