/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.ActividadEvento.servicio;

import java.util.List;
import org.zabalburu.daw1.ActividadEvento.dao.EventoDAO;
import org.zabalburu.daw1.ActividadEvento.dao.EventoList;
import org.zabalburu.daw1.ActividadEvento.modelo.Evento;
import org.zabalburu.daw1.ActividadEvento.modelo.Usuario;

/**
 *
 * @author Sheila
 */
public class EventoServicio implements EventoDAO {
    
    private EventoDAO dao = new EventoList(); // porque????

    @Override
    public void nuevoEvento(Evento nuevo) {
        dao.nuevoEvento(nuevo);
    }

    @Override
    public void nuevoUsuario(Usuario nuevo) {
        dao.nuevoUsuario(nuevo);
    }

    @Override
    public void eliminarUsuario(int id) {
        dao.eliminarUsuario(id);
    }

    @Override
    public Usuario getUsuario(int id) {
        return dao.getUsuario(id);
    }

    @Override
    public Evento getEvento(int codigo) {
        return dao.getEvento(codigo);
    }

    @Override
    public List<Usuario> getUsuarios() {
        return dao.getUsuarios();
    }

    @Override
    public List<Evento> getEventos() {
        return dao.getEventos();
    }

}