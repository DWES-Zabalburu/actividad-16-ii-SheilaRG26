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
public interface UsusarioDAO {
    
    Usuario nuevoUsuario(Usuario nuevo);//que le devuelva lo mismo + id
    void eliminarUsuario(int id); // hay gente que devuelve valor booleano para que le diga si lo ha eliminado o no, en caso de que no exista ese id
    Usuario getUsuario(int id);
    Usuario getUsuario(String dni);
    List<Usuario> getUsuarios();
    
    
}


    /*
        expresion regular;
        plantilla que comprueba que la cadena es 
        como lo hemos pedido al ususario
    */