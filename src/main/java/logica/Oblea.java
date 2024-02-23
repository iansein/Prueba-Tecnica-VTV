package logica;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import java.util.Date;

/**
 *
 * @author Ian
 */
@Entity
public class Oblea implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date fechaEmision;
    private Date fechaVencimiento;

    @OneToOne
    @JoinColumn(name = "auto_id")
    private Auto auto;

    public Oblea() {
    }

    public Oblea(int id, Date fechaEmision, Date fechaVencimiento, Auto auto) {
        this.id = id;
        this.fechaEmision = fechaEmision;
        this.fechaVencimiento = fechaVencimiento;
        this.auto = auto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public String getFechaEmisionFormateada() {
        return Validador.formatearFecha(this.fechaEmision);
    }

    public String getFechaVencimientoFormateada() {
        return Validador.formatearFecha(this.fechaVencimiento);
    }
}
