/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.io.Serializable;
import jakarta.persistence.Entity;

/**
 *
 * @author Ian
 */
@Entity
public class Inspector extends Persona implements Serializable {

    private int nroInspector;

    public Inspector() {
    }

    public Inspector(int id, String nombre, String apellido, int telefono, int dni, int nroInspector) {
        super(id, nombre, apellido, dni, telefono);
        this.nroInspector = nroInspector;
    }

    public int getNroInspector() {
        return nroInspector;
    }

    public void setNroInspector(int nroInspector) {
        this.nroInspector = nroInspector;
    }
    
    @Override
    public String toString() {
        return "Id: " + getId() + " | "+ "Nombre: " + getNombre() + " | " + "Apellido: " + getApellido();
    }
}
