/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
    
}
