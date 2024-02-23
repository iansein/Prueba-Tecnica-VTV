package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Auto;
import logica.Inspeccion;
import logica.Inspector;
import logica.Medicion;
import logica.Observacion;
import logica.Propietario;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author Ian
 */
public class ControladoraPersistencia {
    
    PropietarioJpaController propietarioJpa = new PropietarioJpaController();
    InspectorJpaController inspectorJpa = new InspectorJpaController();
    AutoJpaController autoJpa = new AutoJpaController();
    ObservacionJpaController observacionJpa = new ObservacionJpaController();
    MedicionJpaController medicionJpa = new MedicionJpaController();
    InspeccionJpaController inspeccionJpa = new InspeccionJpaController();
    ObleaJpaController obleaJpa = new ObleaJpaController();

    public void agregarPropietario(Propietario propietario) {
        propietarioJpa.create(propietario);
    }

    public List<Propietario> traerPropietarios() {
        return propietarioJpa.findPropietarioEntities();
    }

    public void borrarPropietario(int idPropietario) {
        try {
            propietarioJpa.destroy(idPropietario);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Propietario traerPropietario(int idPropietario) {
       return propietarioJpa.findPropietario(idPropietario);
    }

    public void modificarPropietario(Propietario propietario) {
        try {
            propietarioJpa.edit(propietario);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void agregarInspector(Inspector inspector) {
        inspectorJpa.create(inspector);
    }

    public List<Inspector> traerInspectores() {
       return inspectorJpa.findInspectorEntities();
    }

    public Inspector traerInspector(int idInspector) {
       return inspectorJpa.findInspector(idInspector);
    }

    public void modificarInspector(Inspector inspector) {
        try {
            inspectorJpa.edit(inspector);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void borrarInspector(int idInspector) {
        try {
            inspectorJpa.destroy(idInspector);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void agregarAuto(Auto auto) {
        autoJpa.create(auto);
    }

    public List<Auto> traerAutos() {
        return autoJpa.findAutoEntities();
    }

    public void modificarAuto(Auto auto) {
        try {
            autoJpa.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void borrarAuto(int idAuto) {
        try {
            autoJpa.destroy(idAuto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void agregarObservacion(Observacion observacion) {
       observacionJpa.create(observacion);
    }

    public void agregarMedicion(Medicion medicion) {
       medicionJpa.create(medicion);
    }

    public Auto traerAuto(int idAuto) {
       return autoJpa.findAuto(idAuto);
    }

    public void agregarInspeccion(Inspeccion inspeccion) {
        inspeccionJpa.create(inspeccion);
    }

    public List<Auto> traerAutosSinObleas() {
       return autoJpa.findAutosSinOblea();
    }

    public List<Inspeccion> traerInspecciones() {
       return inspeccionJpa.findInspeccionEntities();
    }

    public void borrarInspeccion(int idInspeccion) {
        try {
            inspeccionJpa.destroy(idInspeccion);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Inspeccion traerInspeccion(int idInspeccion) {
       return inspeccionJpa.findInspeccion(idInspeccion);
    }

    public void modificarInspeccion(Inspeccion inspeccion) {
        try {
            inspeccionJpa.edit(inspeccion);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificarMedicion(Medicion medicion) {
        try {
            medicionJpa.edit(medicion);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificarObservacion(Observacion observacion) {
        try {
            observacionJpa.edit(observacion);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Auto> traerAutosAptos() {
        return autoJpa.findAutosConInspeccionApta();
    }

    public void borrarOblea(int idOblea) {
        try {
            obleaJpa.destroy(idOblea);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Auto> traerAutosCondicionales() {
       return autoJpa.findAutosConInspeccionCondicional();
    }

    public List<Auto> traerAutosRechazados() {
       return autoJpa.findAutosConInspeccionRechazado();
    }
}
