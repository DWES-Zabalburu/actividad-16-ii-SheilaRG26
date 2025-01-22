/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.ActividadEvento.modelo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author Sheila
 */
public class Usuario {
    private String nombre;
    private String apellidos;
    private Date fnacimiento;
    private String dni;
    private String password;
    private int id;
    private static int numId = 0;
    
    private List<Evento> eventos= new ArrayList<>();
    
    public Usuario (){
        Usuario.numId++;
        this.id = Usuario.numId;
    }
    
    public Usuario(String nombre,String apellidos, Date fnacimiento, String dni,String password) {
        this();
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fnacimiento = fnacimiento;
        this.dni = dni;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
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
        GregorianCalendar gcHoy = new GregorianCalendar();
        GregorianCalendar gcFechaNacimiento = new GregorianCalendar();
        gcFechaNacimiento.setTime(this.fnacimiento);
        int añoActual = gcHoy.get(Calendar.YEAR);
        int añoNacimiento = gcFechaNacimiento.get(Calendar.YEAR);
        int edad = añoActual - añoNacimiento;
        //Si no ha cumplido años, el día actual será menor respecto al 
        // día de su nacimiento
        if (gcHoy.get(Calendar.DAY_OF_YEAR)< gcFechaNacimiento.get(Calendar.DAY_OF_YEAR)) {
            edad--;
        } 
        return edad >= 18;
        
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", fnacimiento=" + fnacimiento + ", dni=" + dni + ", password=" + password + ", id=" + id + '}';
    }

    
    
    
    
    
    
    
}
