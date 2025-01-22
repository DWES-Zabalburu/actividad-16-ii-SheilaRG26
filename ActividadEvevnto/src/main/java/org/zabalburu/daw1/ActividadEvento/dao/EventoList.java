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
    public void nuevoEvento(Evento nuevo) {
        this.eventos.add(nuevo);
    }

    @Override
    public void eliminarEvento(int codigo) {
        Evento eliminar = new Evento(null, null, null, true, 0); // crear un obejto
        eliminar.setCodigo(codigo); // asignar el codigo
        eventos.remove(eliminar); //eliminar
    
    }

    @Override
    public Evento getEvento(int codigo) {
        Evento buscar = new Evento(null, null, null, true, 0);// Creo un objeto tipo evento.ponemos a mano los null
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
}