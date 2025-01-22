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
public class Evento {
    private int codigo;
    private static int numEvento = 0;
    private String descripcion;
    private Date fecha;
    private String lugar;
    private boolean mayorEdad;
    private double coste;
    
    private List<Usuario> usuarios = new ArrayList<>();
    
    public Evento (){
    Evento.numEvento++;
    this.codigo = Evento.numEvento;
    }
    
    public Evento( String descripcion, Date fecha, String lugar, boolean mayorEdad, double coste) {
        this();
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.lugar = lugar;
        this.mayorEdad = mayorEdad;
        this.coste = coste;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public static int getNumEvento() {
        return numEvento;
    }

    public static void setNumEvento(int numEvento) {
        Evento.numEvento = numEvento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public boolean isMayorEdad() {
        return mayorEdad;
    }

    public void setMayorEdad(boolean mayorEdad) {
        this.mayorEdad = mayorEdad;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.codigo;
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
        final Evento other = (Evento) obj;
        return this.codigo == other.codigo;
    }

    @Override
    public String toString() {
        return "Evento{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", fecha=" + fecha + ", lugar=" + lugar + ", mayorEdad=" + mayorEdad + ", coste=" + coste  + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
    
}

