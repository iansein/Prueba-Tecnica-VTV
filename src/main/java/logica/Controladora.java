package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;

/**
 *
 * @author Ian
 */
public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void agregarPropietario(String nombre, String apellido, int dni, int telefono) {
        Propietario propietario = new Propietario();
        propietario.setNombre(nombre);
        propietario.setApellido(apellido);
        propietario.setDni(dni);
        propietario.setTelefono(telefono);

        controlPersis.agregarPropietario(propietario);
        
    }

    public List<Propietario> traerPropietarios() {
        return controlPersis.traerPropietarios();
    }

    public void borrarPropietario(int idPropietario) {
       controlPersis.borrarPropietario(idPropietario);
    }

    public Propietario traerPropietario(int idPropietario) {
        return controlPersis.traerPropietario(idPropietario);
    }

    public void modificarPropietario(Propietario propietario, String nombre, String apellido, int dni, int telefono) {
        propietario.setNombre(nombre);
        propietario.setApellido(apellido);
        propietario.setDni(dni);
        propietario.setTelefono(telefono);
        controlPersis.modificarPropietario(propietario);
    }

    public void agregarInspector(String nombre, String apellido, int dni, int nroInspector, int telefono) {
        Inspector inspector = new Inspector();
        inspector.setNombre(nombre);
        inspector.setApellido(apellido);
        inspector.setDni(dni);
        inspector.setTelefono(telefono);
        inspector.setNroInspector(nroInspector);

        controlPersis.agregarInspector(inspector);
    }

    public List<Inspector> traerInspectores() {
        return controlPersis.traerInspectores();
    }

    public Inspector traerInspector(int idInspector) {
       return controlPersis.traerInspector(idInspector);
    }

    public void modificarInspector(Inspector inspector, String nombre, String apellido, int dni, int telefono, int nroInspector) {
        inspector.setNombre(nombre);
        inspector.setApellido(apellido);
        inspector.setDni(dni);
        inspector.setNroInspector(nroInspector);
        inspector.setTelefono(telefono);

        controlPersis.modificarInspector(inspector);
    }

    public void borrarInspector(int idInspector) {
       controlPersis.borrarInspector(idInspector);
    }

    public void agregarAuto(String dominio, String marca, String modelo, Propietario propietarioSeleccionado) {
        Auto auto = new Auto();
        auto.setDominio(dominio);
        auto.setMarca(marca);
        auto.setModelo(modelo);
        auto.setPropietario(propietarioSeleccionado);
 
        controlPersis.agregarAuto(auto);
    }
   
       
}
