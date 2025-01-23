/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.ActividadEvento.servicio;

import java.util.List;
import org.zabalburu.daw1.ActividadEvento.dao.EventoList;
import org.zabalburu.daw1.ActividadEvento.modelo.Evento;
import org.zabalburu.daw1.ActividadEvento.modelo.Usuario;
import org.zabalburu.daw1.ActividadEvento.dao.UsuarioDAO;

/**
 *
 * @author Sheila
 */
public class EventoServicio implements UsuarioDAO {
    
    private UsuarioDAO dao = new EventoList(); // porque????

    @Override
    public Usuario nuevoUsuario(Usuario nuevo) {
       return dao.nuevoUsuario(nuevo);
    }

    @Override
    public void eliminarUsuario(int id) {
        dao.eliminarUsuario(id);
    }

    @Override
    public Usuario getUsuario(int id) {
        return dao.getUsuario(id);}

    @Override
    public Usuario getUsuario(String dni) {
        return dao.getUsuario(dni);}

    @Override
    public List<Usuario> getUsuarios() {
        return dao.getUsuarios();}

    @Override
    public void modificarUsuario(Usuario modificar) {
    dao.modificarUsuario(modificar);
    }
}