/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.ActividadEvento.dao;

import java.util.ArrayList;
import java.util.List;
import org.zabalburu.daw1.ActividadEvento.modelo.Evento;
import org.zabalburu.daw1.ActividadEvento.modelo.Usuario;

/**
 *
 * @author Sheila
 */
public class UsuarioMatriz implements UsuarioDAO {
    private static Usuario[] usuarios = new Usuario[10];
    private static int numUsuarios = 0;

    @Override
    public Usuario nuevoUsuario(Usuario nuevo) {
        usuarios[numUsuarios] = nuevo;
        numUsuarios++;
        return nuevo;
    
    }

    @Override
    public void eliminarUsuario(int id) {
        int i;
        for (i = 0; i < numUsuarios && id != usuarios[i].getId(); i++); 
        if (i<numUsuarios) {
            for (;i<numUsuarios -1;i++) {
                usuarios[i] = usuarios[i+1];
            }
            numUsuarios--;
        }
        
        }

    @Override
    public Usuario getUsuario(int id) {
        
        int i;
        for (i = 0; i < numUsuarios && id != usuarios[i].getId(); i++); 
        if (i < numUsuarios) {
            return usuarios[i];
        }else{
            return null;
        }
    }

    @Override
    public Usuario getUsuario(String dni) {
        int i;
        for (i = 0; i < numUsuarios && dni != usuarios[i].getDni(); i++); 
        if (i < numUsuarios) {
            return usuarios[i];
        }else{
            return null;
        }
        
    }

    @Override
    public List<Usuario> getUsuarios() {
        List<Usuario> lista = new ArrayList<>();
        for (int i = 0; i < numUsuarios; i++) {
            lista.add(usuarios[i]);
        }
        return lista;
    }
    
}
