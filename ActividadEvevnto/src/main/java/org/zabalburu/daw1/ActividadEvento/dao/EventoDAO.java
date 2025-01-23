/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.zabalburu.daw1.ActividadEvento.dao;

import java.util.List;
import org.zabalburu.daw1.ActividadEvento.modelo.Evento;

/**
 *
 * @author DAW1
 */
public interface EventoDAO {
    void nuevoEvento(Evento nuevo);
    void eliminarEvento(int codigo);
    Evento getEvento(int codigo);
    List<Evento> getEventos();
    void modificarEvento(Evento evento);
}
