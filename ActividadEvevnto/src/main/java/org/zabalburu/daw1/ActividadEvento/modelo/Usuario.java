/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.ActividadEvento.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Sheila
 */
public class Usuario {
    private String nombre;
    private Date fnacimiento;
    private String dni;
    private String password;
    private int id;
    private static int numId = 0;
    
    private List<Evento> eventos= new ArrayList<>();

    public Usuario(String nombre, Date fnacimiento, String dni, int id,String password) {
        this.nombre = nombre;
        this.fnacimiento = fnacimiento;
        this.dni = dni;
        numId++;
        this.id = numId;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFnacimiento() {
        return fnacimiento;
    }

    public void setFnacimiento(Date fnacimiento) {
        this.fnacimiento = fnacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getNumId() {
        return numId;
    }

    public static void setNumId(int numId) {
        Usuario.numId = numId;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        return this.id == other.id;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean isMayorEdad(){
        
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", fnacimiento=" + fnacimiento + ", dni=" + dni + ", id=" + id + ", eventos=" + eventos + '}';
    }
    
    
    
    
    
    
}
