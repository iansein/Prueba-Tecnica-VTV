package logica;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

/**
 *
 * @author Ian
 */
@Entity
public class Observacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne @JoinColumn(name = "inspeccion_id")
    private Inspeccion inspeccion;
    private String parteDelVehiculo;
    private String estado;
    
    public Observacion() {
    }

    public Observacion(int id, Inspeccion inspeccion, String parteDelVehiculo,String estado) {
        this.id = id;
        this.inspeccion = inspeccion;
        this.parteDelVehiculo = parteDelVehiculo;
        this.estado = estado;
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

    public String getParteDelVehiculo() {
        return parteDelVehiculo;
    }

    public void setParteDelVehiculo(String parteDelVehiculo) {
        this.parteDelVehiculo = parteDelVehiculo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
