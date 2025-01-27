/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.ActividadEvento;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import org.zabalburu.daw1.ActividadEvento.modelo.Evento;
import org.zabalburu.daw1.ActividadEvento.modelo.Usuario;
import org.zabalburu.daw1.ActividadEvento.servicio.EventoServicio;

/**
 *
 * @author Sheila
 */
public class ActividadEvento {
    
    private static Usuario[] usuarios = new Usuario[100];
    private static EventoServicio servicio = new EventoServicio();
    private static Usuario usuario;
    private static DateFormat df = Dateformat.getDteInstance(DateFormat.LONG);
    
     
     
     
     
    public static void main(String[] args) {
        usuario = login(); // si se logea ok, le saldra el menú
        if (usuario != null) {
            int opc;
            do {
                String resp = JOptionPane.showInputDialog(
                 """
                 Gestión de Eventos 
                 ==================
                 1. Ver Información del Ususario
                 2. Desapuntar del Evento
                 3. Ver Eventos disponibles
                 4. Apuntar a Evento
                 5.Salir
                 """ .formatted(usuario.getNombre() + " " + usuario.getApellidos())
                        
                 );
                opc = Integer.parseInt(resp);
                switch  (opc){
                    case 1: 
                        verInfoUsusario();
                        break;
                
                }
                   
                
                
                
                
                
            } while (opc != 5);
            
        }
    }
    //primer logearse
    private static Usuario login() {
        String usuario = JOptionPane.showInputDialog("Ususario (DNI)");
        String password = JOptionPane.showInputDialog("Contraseña");
        try {
        return servicio.login(usuario, password);
        }catch (LoginException ex){
        JOptionPane.showMessageDialog(null,
                ex.getMessage(),
                "Error en Login",
                JOptionPane.ERROR_MESSAGE);
                return null;
        }
    }

    private static void verInfoUsusario() {
        String listado = 
                """
                    <html>
                <h1> Ususario : %s %s </h1>
                <h2> Datos mpersonales </h2>
                <table bgcolor="white" border=1>
                <tr>
                <td>Id.</td>
                <td>%s</td>
                </tr>   
                <tr>
                <td>DNI</td>
                <td>%s</td>
                </tr>
                <tr>
                <td>Fecha nacimiento</td>
                <td>%s</td>
                </tr>
                <tr>
                <td>MAyor de edad</td>
                <td>%s</td>
                </tr>
                </table>   
                """.formatted(usuario.getNombre(), 
                        usuario.getApellidos(), 
                        usuario.getId(),
                        usuario.getDni(),
                        df.format(usuario.getFnacimiento()),
                        usuario.isMayorEdad()?"si":"no"
                        );
        List <Evento> eventos = usuario.getEventos();
        if (eventos.isEmpty()) {
            listado += 
            "<h3>No esta apuntada al evento</h3>";
        }else{}
    
    }
    
}
