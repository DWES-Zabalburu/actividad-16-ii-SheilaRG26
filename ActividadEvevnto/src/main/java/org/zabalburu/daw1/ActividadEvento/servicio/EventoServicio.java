/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.ActividadEvento.servicio;

import java.util.GregorianCalendar;
import java.util.List;
import org.zabalburu.daw1.ActividadEvento.LoginException;
import org.zabalburu.daw1.ActividadEvento.dao.EventoDAO;
import org.zabalburu.daw1.ActividadEvento.dao.EventoList;
import org.zabalburu.daw1.ActividadEvento.modelo.Evento;
import org.zabalburu.daw1.ActividadEvento.modelo.Usuario;
import org.zabalburu.daw1.ActividadEvento.dao.UsuarioDAO;
import org.zabalburu.daw1.ActividadEvento.dao.UsuarioMatriz;

/**
 *
 * @author Sheila
 */
public class EventoServicio implements UsuarioDAO {
    
    private UsuarioDAO usuarioDao = new UsuarioMatriz(); 
    private EventoDAO eventoDao = new EventoList();
    
    //Metemos datos de prueba
    public EventoServicio(){
    usuarioDao.nuevoUsuario(new Usuario("Juan","Lopez","2768549A", "juan", new GregorianCalendar(1991,12,26).getTime()));
    usuarioDao.nuevoUsuario(new Usuario("Maite","Lopez","2768549A", "maite", new GregorianCalendar(1995,1,12).getTime()));
    usuarioDao.nuevoUsuario(new Usuario("Pepa","Lopez","2765549A", "pepa", new GregorianCalendar(1988,2,22).getTime()));
    usuarioDao.nuevoUsuario(new Usuario("Liam","Lopez","6854949A", "liam", new GregorianCalendar(1984,8,4).getTime()));
    usuarioDao.nuevoUsuario(new Usuario("Marko","Lopez","2768940A", "marko", new GregorianCalendar(1991,2,4).getTime()));
    usuarioDao.nuevoUsuario(new Usuario("Aday","Lopez","20085499A", "aday", new GregorianCalendar(1991,3,25).getTime()));
    eventoDao.nuevoEvento(new Evento("Evento Cuatro", new GregorianCalendar(2025,1,31).getTime(), "Bilbao", false, 47));
    eventoDao.nuevoEvento(new Evento("Evento Cuatro", new GregorianCalendar(2025,6,25).getTime(), "Santader", false, 52));
    eventoDao.nuevoEvento(new Evento("Evento Cuatro", new GregorianCalendar(2025,5,30).getTime(), "Bilbao", false, 60));
    eventoDao.nuevoEvento(new Evento("Evento Cuatro", new GregorianCalendar(2025,2,14).getTime(), "Getxo", false, 80));
    eventoDao.nuevoEvento(new Evento("Evento Cuatro", new GregorianCalendar(2025,2,21).getTime(), "Portugalete", false, 10));
    this.apuntarAEvento(3,1);
    this.apuntarAEvento(6,2);
    this.apuntarAEvento(5,3);
    this.apuntarAEvento(1,2);
    
    }

    @Override
    public Usuario nuevoUsuario(Usuario nuevo) {
       return usuarioDao.nuevoUsuario(nuevo);
    }

    @Override
    public void eliminarUsuario(int id) {
        usuarioDao.eliminarUsuario(id);
    }

    @Override
    public Usuario getUsuario(int id) {
        return usuarioDao.getUsuario(id);}

    /*@Override
    public Usuario getUsuario(String dni) {
        return usuarioDao.getUsuario(dni);}*/
    
    public Usuario login(String dni, String password) throws LoginException{
        //lanzar una excepcion chequeada si no existe el usuario
        Usuario u = usuarioDao.getUsuario(dni);
        if (u != null && password.equals(u.getPassword())) {
            return u;
        }
        throw new LoginException();
    }

    @Override
    public List<Usuario> getUsuarios() {
        return usuarioDao.getUsuarios();}

    @Override
    public void modificarUsuario(Usuario modificar) {
    usuarioDao.modificarUsuario(modificar);
    }
    
    public Evento nuevoEvento(Evento nuevo){
        return eventoDao.nuevoEvento(nuevo);
    }
   
    public void eliminarEvento(int id){
        eventoDao.eliminarEvento(id);
    }
    
    public void modificarEvento(Evento evento){
      eventoDao.modificarEvento(evento);
    }
    
    public List<Evento> getEvento(){
        return eventoDao.getEventos();
    }
   
    public Evento getEvento(int id){
        return eventoDao.getEvento(id);
    }

    public boolean apuntarAEvento(int idUsuario, int idEvento){
        Usuario u = usuarioDao.getUsuario(idUsuario);
        Evento e = eventoDao.getEvento(idEvento);
        if (u != null && e != null) {
           e.getUsuarios().add(u);//´ñadimos la persona a los asistentes(usuarios) del evento
           u.getEventos().add(e); //añadimos el eventoa la lista de eventos de la persona
           return true;
        }
        return false;
    }
    
    public void desapuntarAEvento(int idUsuario, int idEvento){
        Usuario u = usuarioDao.getUsuario(idUsuario);
        Evento e = eventoDao.getEvento(idEvento);
        if (u != null && e != null) {
            e.getUsuarios().remove(u);
            u.getEventos().remove(e);
        }
    }
    
    public static void main(String[]args){
        EventoServicio servicio = new EventoServicio();
        for (Usuario u : servicio.getUsuarios()) {
            System.out.println(u);
        }
        for (Evento e : servicio.getEvento()){
            System.out.println(e);
        }
    }
}