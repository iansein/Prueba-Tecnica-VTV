/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Propietario;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author Ian
 */
public class ControladoraPersistencia {
    
    PropietarioJpaController propietarioJpa = new PropietarioJpaController();
    public void agregarPropietario(Propietario propietario) {
        propietarioJpa.create(propietario);
    }

    public List<Propietario> traerAutos() {
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
    
}
