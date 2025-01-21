/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.zabalburu.daw1.ActividadEvento.dao;

import java.util.List;
import org.zabalburu.daw1.ActividadEvento.modelo.Evento;
import org.zabalburu.daw1.ActividadEvento.modelo.Usuario;

/**
 *
 * @author Sheila
 */
public interface EventoDAO {
    void nuevoEvento(Evento nuevo);
    void nuevoUsuario(Usuario nuevo);
    void eliminarUsuario(int id);
    Usuario getUsuario(int id);
    Evento getEvento(int codigo);
    List<Usuario> getUsuarios();
    List<Evento> getEventos();
    
}
