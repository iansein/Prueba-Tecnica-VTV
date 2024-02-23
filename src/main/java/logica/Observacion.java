package logica;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

/**
 *
 * @author Ian
 */
@Entity
public class Observacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "inspeccion_id")
    private Inspeccion inspeccion;

    private String luces;
    private String patente;
    private String espejos;
    private String chasis;
    private String vidrios;
    private String seguridad;
    private String emergencia;

    public Observacion() {
    }

    public Observacion(int id, Inspeccion inspeccion, String luces, String patente, String espejos, String chasis, String vidrios, String seguridad, String emergencia) {
        this.id = id;
        this.inspeccion = inspeccion;
        this.luces = luces;
        this.patente = patente;
        this.espejos = espejos;
        this.chasis = chasis;
        this.vidrios = vidrios;
        this.seguridad = seguridad;
        this.emergencia = emergencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Inspeccion getInspeccion() {
        return inspeccion;
    }

    public void setInspeccion(Inspeccion inspeccion) {
        this.inspeccion = inspeccion;
    }

    public String getLuces() {
        return luces;
    }

    public void setLuces(String luces) {
        this.luces = luces;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getEspejos() {
        return espejos;
    }

    public void setEspejos(String espejos) {
        this.espejos = espejos;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getVidrios() {
        return vidrios;
    }

    public void setVidrios(String vidrios) {
        this.vidrios = vidrios;
    }

    public String getSeguridad() {
        return seguridad;
    }

    public void setSeguridad(String seguridad) {
        this.seguridad = seguridad;
    }

    public String getEmergencia() {
        return emergencia;
    }

    public void setEmergencia(String emergencia) {
        this.emergencia = emergencia;
    }

}
