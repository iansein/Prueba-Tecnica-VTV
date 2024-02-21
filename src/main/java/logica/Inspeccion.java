/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;


import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int numeroInspeccion;
    @Temporal(TemporalType.DATE)
    private Date fechaInspeccion;
    private String estadoInspeccion;
    private boolean exento;
    @OneToOne
    private Inspector inspector;
    @OneToOne
    private Auto autoInspeccionado;

    public Inspeccion() {
    }

    public Inspeccion(int id, int numeroInspeccion, Date fechaInspeccion, String estadoInspeccion, boolean exento, Inspector inspector, Auto autoInspeccionado) {
        this.id = id;
        this.numeroInspeccion = numeroInspeccion;
        this.fechaInspeccion = fechaInspeccion;
        this.estadoInspeccion = estadoInspeccion;
        this.exento = exento;
        this.inspector = inspector;
        this.autoInspeccionado = autoInspeccionado;
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

    public boolean isExento() {
        return exento;
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
}
