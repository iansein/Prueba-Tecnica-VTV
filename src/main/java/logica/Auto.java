
package logica;

import java.io.Serializable;
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
public class Auto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String dominio;
    private String marca;
    private String modelo;
    @ManyToOne @JoinColumn(name = "propietario_id")
    private Propietario propietario;
    private Oblea oblea;

    public Auto() {
    }

    public Auto(int id, String dominio, String marca, String modelo, Propietario propietario) {
        this.id = id;
        this.dominio = dominio;
        this.marca = marca;
        this.modelo = modelo;
        this.propietario = propietario;
        this.oblea = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public Oblea getOblea() {
        return oblea;
    }

    public void setOblea(Oblea oblea) {
        this.oblea = oblea;
    }
}
