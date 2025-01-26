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
    private static Usuario[] usuarios = new Usuario[100];
    private static int numUsuarios = 0;
    /*
        si no las declarasemos staticas, al crear 
        dos objetos de tipo matriz surgirian problemas.
        Patron Singleton mas adelante.
    */
    
    @Override
    public Usuario nuevoUsuario(Usuario nuevo) {
        if (numUsuarios < usuarios.length) {
            usuarios[numUsuarios] = nuevo;
            numUsuarios++;
        }    
        return nuevo;
    }    
    
    

    @Override
    public void eliminarUsuario(int id) {
        int i = buscarPosicion(id);
        
        if (i != -1) {
            for (;i<numUsuarios -1;i++) {
                usuarios[i] = usuarios[i+1];
            }
            numUsuarios--;
        }
        
        }

    @Override
    public Usuario getUsuario(int id) {
        
        int pos = buscarPosicion(id);
        if (pos != -1) {
            return usuarios[pos];
        }else{
            return null;
        }
    }

    @Override
    public Usuario getUsuario(String dni) {
        int i;
        for(i = 0; i<numUsuarios && !dni.equalsIgnoreCase(dni);i++);
        return (i == numUsuarios)?null:usuarios[i];
        
    }

    @Override
    public List<Usuario> getUsuarios() {
        List<Usuario> lista = new ArrayList<>();
        for (int i = 0; i < numUsuarios; i++) {
            lista.add(usuarios[i]);
        }
        return lista;
    }

    @Override
    public void modificarUsuario(Usuario modificar) {
        //buscamos la posicion de la persona con el id.
        int pos = buscarPosicion(modificar.getId());
        if (pos != -1) {
            //sustituimos a la persona del id que teniamos, por la que me pasan
            usuarios[pos] = modificar;
            
        }
    }
    
    
    /* metodo de utilidad,tien que ser privado.
    necesito saber en que posicion esa la persona,
    no quien es.*/
    private int buscarPosicion (int id){
    int i;
        for(i=0; i<numUsuarios && id != usuarios[i].getId(); i++);
        if (i < numUsuarios){
            return i;
        }else {
            return -1;
        }
    }
    
    /*public void limpiarDAtos(){
        usuarios 
    }*/
}
