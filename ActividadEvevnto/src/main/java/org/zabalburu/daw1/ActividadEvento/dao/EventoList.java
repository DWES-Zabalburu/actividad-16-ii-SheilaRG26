/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.ActividadEvento.dao;

import java.util.ArrayList;
import java.util.List;
import org.zabalburu.daw1.ActividadEvento.dao.EventoDAO;
import org.zabalburu.daw1.ActividadEvento.modelo.Evento;
import org.zabalburu.daw1.ActividadEvento.modelo.Usuario;

/**
 *
 * @author Sheila
 */
public class EventoList implements EventoDAO {
    
    private static List<Evento> eventos = new ArrayList<>();
   

   

    @Override
    public void eliminarEvento(int codigo) {
        Evento eliminar = new Evento(); // crear un obejto
        eliminar.setCodigo(codigo); // asignar el codigo
        eventos.remove(eliminar); //eliminar
    
    }
    
    /* ELiminar por otro campo que no sea el clave. 
    no tien sentido hacerlo.
    Hay que buscar la posicion del elemento con ese nombre.

    public void eliminarEvento(String descripcion){
        int i;
        for ( i = 0; i < eventos.size() && 
                !descripcion.equalsIgnoreCase(eventos.get(i).getDescripcion()); i++) {
        eventos.remove(i);   
        }
    }    
    */
    
    @Override
    public Evento getEvento(int codigo) {
        Evento buscar = new Evento();// Creo un objeto tipo evento.ponemos a mano los null
        buscar.setCodigo(codigo);// le asigno codigo a ese objeto creado
        int pos = eventos.indexOf(buscar); 
        if (pos != -1){
            return eventos.get(pos);
        } else {
            return null;
        }
        
    }

    @Override
    public List<Evento> getEventos() {
        return eventos;
    }

    @Override
    public void modificarEvento(Evento evento) {
        int pos = eventos.indexOf(evento); 
        if (pos != -1){
             eventos.set(pos, evento);
        } //Buscar la posicion en base al id(equals)-->indexOf
    }

    @Override
    public Evento nuevoEvento(Evento nuevo) {
        this.eventos.add(nuevo);
        return nuevo;
    }
}


