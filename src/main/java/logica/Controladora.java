package logica;

import java.util.Date;
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

    public List<Auto> traerAutos() {
        return controlPersis.traerAutos();
    }

    public void modificarAuto(Auto auto, String dominio, String marca, String modelo, Propietario propietarioSeleccionado) {
        auto.setDominio(dominio);
        auto.setMarca(marca);
        auto.setModelo(modelo);
        auto.setPropietario(propietarioSeleccionado);
        controlPersis.modificarAuto(auto);
    }

    public void borrarAuto(int idAuto) {
        controlPersis.borrarAuto(idAuto);
    }

    public void agregarObservacion(Observacion observacion) {
        controlPersis.agregarObservacion(observacion);
    }

    public void agregarMedicion(Medicion medicion) {
        controlPersis.agregarMedicion(medicion);
    }

    public Auto traerAuto(int idAuto) {
        return controlPersis.traerAuto(idAuto);
    }

    public void agregarInspeccion(Inspeccion inspeccion) {

        controlPersis.agregarInspeccion(inspeccion);
    }

    public void modificarAuto(Auto autoSeleccionado) {
        controlPersis.modificarAuto(autoSeleccionado);
    }

    public List<Auto> traerAutosSinObleas() {
        return controlPersis.traerAutosSinObleas();
    }

    public List<Inspeccion> traerInspecciones() {
        return controlPersis.traerInspecciones();
    }

    public void borrarInspeccion(int idInspeccion) {
        controlPersis.borrarInspeccion(idInspeccion);
    }

    public Inspeccion traerInspeccion(int idInspeccion) {
        return controlPersis.traerInspeccion(idInspeccion);
    }

    public void modificarInspeccion(Inspeccion inspeccion) {
        controlPersis.modificarInspeccion(inspeccion);
    }

    public void modificarMedicion(Medicion medicion) {
        controlPersis.modificarMedicion(medicion);
    }

    public void modificarObservacion(Observacion observacion) {
        controlPersis.modificarObservacion(observacion);
    }

    public List<Auto> traerAutosAptos() {
        return controlPersis.traerAutosAptos();
    }

    public void borrarOblea(int idOblea) {
        controlPersis.borrarOblea(idOblea);
    }

    public List<Auto> traerAutosCondicionales() {
        return controlPersis.traerAutosCondicionales();
    }

    public List<Auto> traerAutosRechazados() {
        return controlPersis.traerAutosRechazados();
    }

    public boolean existePersonaConDNI(int dni) {
        return controlPersis.existePersonaConDNI(dni);
    }


}
