/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.io.Serializable;
import java.util.ArrayList;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

/**
 *
 * @author Ian
 */
@Entity
public class Propietario implements Serializable {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int dni;
    private String nombre;
    private String apellido;
    
    @OneToMany(mappedBy="propietario")
    private ArrayList<Auto> autos = new ArrayList<>();

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public ArrayList<Auto> getAutos() {
        return autos;
    }

    public void setAutos(ArrayList<Auto> autos) {
        this.autos = autos;
    }

    public Propietario() {
    }

    public Propietario(int id, String nombre, String apellido, ArrayList<Auto> autos, int dni) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.autos = autos;
        this.dni = dni;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ArrayList<Auto> getCars() {
        return autos;
    }

    public void setCars(ArrayList<Auto> cars) {
        this.autos = cars;
    }    
    
}
