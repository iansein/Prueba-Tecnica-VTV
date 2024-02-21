/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import logica.Propietario;

/**
 *
 * @author Ian
 */
public class ControladoraPersistencia {
    
    PropietarioJpaController propietarioJpa = new PropietarioJpaController();
    public void agregarPropietario(Propietario propietario) {
        propietarioJpa.create(propietario);
    }
    
}
