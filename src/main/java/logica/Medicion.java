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
public class Medicion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "inspeccion_id")
    private Inspeccion inspeccion;

    private String suspension;
    private String direccion;
    private String trenDelantero;
    private String sistemaDeFrenos;
    private String contaminacionAmbiental;

    public Medicion() {
    }

    public Medicion(int id, Inspeccion inspeccion, String suspension, String direccion, String trenDelantero, String sistemaDeFrenos, String contaminacionAmbiental) {
        this.id = id;
        this.inspeccion = inspeccion;
        this.suspension = suspension;
        this.direccion = direccion;
        this.trenDelantero = trenDelantero;
        this.sistemaDeFrenos = sistemaDeFrenos;
        this.contaminacionAmbiental = contaminacionAmbiental;
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

    public String getSuspension() {
        return suspension;
    }

    public void setSuspension(String suspension) {
        this.suspension = suspension;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTrenDelantero() {
        return trenDelantero;
    }

    public void setTrenDelantero(String trenDelantero) {
        this.trenDelantero = trenDelantero;
    }

    public String getSistemaDeFrenos() {
        return sistemaDeFrenos;
    }

    public void setSistemaDeFrenos(String sistemaDeFrenos) {
        this.sistemaDeFrenos = sistemaDeFrenos;
    }

    public String getContaminacionAmbiental() {
        return contaminacionAmbiental;
    }

    public void setContaminacionAmbiental(String contaminacionAmbiental) {
        this.contaminacionAmbiental = contaminacionAmbiental;
    }
}
