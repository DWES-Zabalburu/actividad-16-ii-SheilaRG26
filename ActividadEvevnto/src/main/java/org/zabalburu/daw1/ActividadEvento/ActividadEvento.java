/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.ActividadEvento;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import org.zabalburu.daw1.ActividadEvento.modelo.Usuario;
import org.zabalburu.daw1.ActividadEvento.servicio.EventoServicio;

/**
 *
 * @author Sheila
 */
public class ActividadEvento {
    
    private static Usuario[] usuarios = new Usuario[100];
    private static EventoServicio servicio = new EventoServicio();
    
    
     private static int pedirCodigo() {
        
        boolean ok = false;
        int id = 0;
        while (!ok) {
            String listado
                    = """
                <html>
                <h3>Usuarios</h3>
                <hr/>
                <table bgcolor=white border=1>
                <tr><td>Código</td><td>Nombre</td><td>Apellidos</td></tr>
                """;
            for (Usuario u : usuarios) {
                listado
                        += """
                <tr><td>%d</td><td>%s</td><td>%s</td></tr>
                """.formatted(
                                u.getId(),
                                u.getNombre(),
                                u.getApellidos()
                        );
            }
            listado += """
                </table>
                <h4>Código del Comercial : </h4>
                   """;
            String resp = JOptionPane.showInputDialog(listado);
            try {
                id = Integer.parseInt(resp);
                ok = true;
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null,
                        "El código debe ser un valor entero sin decimales",
                        "Código Erróneo",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        return id;
    }
     
     
     
    public static void main(String[] args) {
         int opc;
        do {
            String resp = JOptionPane.showInputDialog(
                    """
            1. Nuevo Usuario
            2. Eliminar Usuario
            3. Listar Usuarios
            4. Listar Eventos
            5. Salir
             
            Opción [1-5] :
            """);
            opc = Integer.parseInt(resp);
            switch (opc) {
                case 1:
                    nuevoUsuario();
                    break;
                case 2:
                    ;
                    break;
                case 3:
                    ;
                    break;
                case 4:
                   ;
                    break;
            }
        } while (opc != 5);
    
    
    }

    private static void nuevoUsuario() {
        int id = pedirCodigo();
        Usuario u = servicio.getUsuario(id);
        if (u == null) {
            JOptionPane.showMessageDialog(null,
                    "No existe ningún usuario con ese código",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            String nombre = JOptionPane.showInputDialog("Nombre: ");
            
        }
    }
}
