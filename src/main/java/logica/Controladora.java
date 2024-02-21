package logica;

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

       
}
