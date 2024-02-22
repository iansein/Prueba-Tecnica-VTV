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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;

/**
 *
 * @author Ian
 */
@Entity
public class Inspeccion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int numeroInspeccion;
    @Temporal(TemporalType.DATE)    
    private Date fechaInspeccion;
    private String estadoInspeccion;
    private boolean exento;
    
    @OneToOne
    @JoinColumn(name = "inspector_id")
    private Inspector inspector;
    
    @OneToOne
    @JoinColumn(name = "auto_id")
    private Auto autoInspeccionado;
    
    @OneToOne(cascade = {CascadeType.REMOVE}, mappedBy="inspeccion")
    private Observacion observacion;
    @OneToOne(cascade = {CascadeType.REMOVE}, mappedBy="inspeccion")
    private Medicion medicion;

    public Inspeccion() {
    }

    public Inspeccion(int id, int numeroInspeccion, Date fechaInspeccion, 
            String estadoInspeccion, boolean exento, Inspector inspector, 
            Auto autoInspeccionado, Observacion observacion, Medicion medicion) {
        this.id = id;
        this.numeroInspeccion = numeroInspeccion;
        this.fechaInspeccion = fechaInspeccion;
        this.estadoInspeccion = estadoInspeccion;
        this.exento = exento;
        this.inspector = inspector;
        this.autoInspeccionado = autoInspeccionado;
        this.observacion = observacion;
        this.medicion = medicion;
    }

    public Observacion getObservacion() {
        return observacion;
    }

    public void setObservacion(Observacion observacion) {
        this.observacion = observacion;
    }

    public Medicion getMedicion() {
        return medicion;
    }

    public void setMedicion(Medicion medicion) {
        this.medicion = medicion;
    }
    
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroInspeccion() {
        return numeroInspeccion;
    }

    public void setNumeroInspeccion(int numeroInspeccion) {
        this.numeroInspeccion = numeroInspeccion;
    }

    public Date getFechaInspeccion() {
        return fechaInspeccion;
    }

    public void setFechaInspeccion(Date fechaInspeccion) {
        this.fechaInspeccion = fechaInspeccion;
    }

    public String getEstadoInspeccion() {
        return estadoInspeccion;
    }

    public void setEstadoInspeccion(String estadoInspeccion) {
        this.estadoInspeccion = estadoInspeccion;
    }

    public String isExento() {
        if(this.exento){
            return "Si";
        }
        return "No";
    }

    public void setExento(boolean exento) {
        this.exento = exento;
    }

    public Inspector getInspector() {
        return inspector;
    }

    public void setInspector(Inspector inspector) {
        this.inspector = inspector;
    }

    public Auto getAutoInspeccionado() {
        return autoInspeccionado;
    }

    public void setAutoInspeccionado(Auto autoInspeccionado) {
        this.autoInspeccionado = autoInspeccionado;
    }
    
    public String getFechaInspeccionFormateada() {
     return Validador.formatearFecha(this.fechaInspeccion);
    }
}
