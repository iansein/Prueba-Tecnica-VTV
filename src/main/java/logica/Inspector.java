/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import jakarta.persistence.CascadeType;
import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

/**
 *
 * @author Ian
 */
@Entity
public class Inspector extends Persona implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int nroInspector;
    @OneToOne(mappedBy = "inspector", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private Inspeccion inspeccion;

    public Inspector() {
    }
    
    public Inspector(int id, String nombre, String apellido, int telefono, int dni, int nroInspector, Inspeccion inspeccion) {
        super(id, nombre, apellido, dni, telefono);
        this.nroInspector = nroInspector;
        this.inspeccion = inspeccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNroInspector() {
        return nroInspector;
    }

    public void setNroInspector(int nroInspector) {
        this.nroInspector = nroInspector;
    }

    public Inspeccion getInspeccion() {
        return inspeccion;
    }

    public void setInspeccion(Inspeccion inspeccion) {
        this.inspeccion = inspeccion;
    }

    
    
    
}
