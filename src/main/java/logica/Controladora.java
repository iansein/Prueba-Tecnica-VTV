package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;

/**
 *
 * @author Ian
 */
public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void agregarPropietario(String nombre, String apellido, int dni) {
        Propietario propietario = new Propietario();
        propietario.setNombre(nombre);
        propietario.setApellido(apellido);
        propietario.setDni(dni);
        
        controlPersis.agregarPropietario(propietario);
        
    }

    public List<Propietario> traerPropietarios() {
        return controlPersis.traerAutos();
    }

    public void borrarPropietario(int idPropietario) {
       controlPersis.borrarPropietario(idPropietario);
    }

       
}
