package logica;

import jakarta.persistence.CascadeType;
import java.io.Serializable;
import java.util.ArrayList;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import java.util.List;

/**
 *
 * @author Ian
 */
@Entity
public class Propietario extends Persona implements Serializable {
     
    @OneToMany(mappedBy="propietario", cascade = CascadeType.REMOVE)
    private List<Auto> autos = new ArrayList<>();
    
    
    public Propietario() {
    }

    public Propietario(int id, String nombre, String apellido, List<Auto> autos, int dni, int telefono) {
        super(id,nombre,apellido,dni, telefono);
        this.autos = autos;
    }


    public List<Auto> getAutos() {
        return autos;
    }

    public void setAutos(List<Auto> autos) {
        this.autos = autos;
    }  
}
