
package com.lautajamdev.peluqueriacanina.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Mascota implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int num_cliente; 
    
    @Basic
    private String nombre_perro;
    private String raza;
    private String color;
    private String alergico;
    private String aten_esp;
    private String obs;

    @OneToOne
    private Duenio duenio;

    public Mascota() {
    }

    public Mascota(int num_cliente, String nombre_perro, String raza, String color, String alergico, String aten_esp, String obs, Duenio duenio){
        this.num_cliente = num_cliente;
        this.nombre_perro = nombre_perro;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.aten_esp = aten_esp;
        this.obs = obs;
        this.duenio = duenio;
    }

    public int getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(int num_cliente) {
        this.num_cliente = num_cliente;
    }

    public String getNombre_perro() {
        return nombre_perro;
    }

    public void setNombre_perro(String nombre_perro) {
        this.nombre_perro = nombre_perro;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAlergico() {
        return alergico;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public String getAten_esp() {
        return aten_esp;
    }

    public void setAten_esp(String aten_esp) {
        this.aten_esp = aten_esp;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }
    
    
    
}
