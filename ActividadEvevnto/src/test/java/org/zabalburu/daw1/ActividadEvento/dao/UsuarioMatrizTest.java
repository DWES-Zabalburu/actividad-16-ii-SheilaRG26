/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.zabalburu.daw1.ActividadEvento.dao;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.zabalburu.daw1.ActividadEvento.modelo.Usuario;

/**
 *
 * @author DAW1
 */
public class UsuarioMatrizTest {
    private UsuarioDAO dao = new UsuarioMatriz();
    
    public UsuarioMatrizTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
   /* public void setUp() {
        dao.limpiarDatos(); //cada vez que se lanza test, se llama a limpiar datos, asi siempre se empieza el test sin ninguna personma
    }*/
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of nuevoUsuario method, of class UsuarioMatriz.
     */
    @Test
    public void testNuevoUsuario() {
        Usuario u = new Usuario("Paco","MArtinez",null,"00000D",null);
        dao.nuevoUsuario(u);
        assertEquals(dao.getUsuarios().size(),2);
        Usuario u2 = new Usuario ("Paco","MArtinez",null,"00000D",null);
        dao.nuevoUsuario(u2);
        assertEquals(dao.getUsuarios().get(0),u);
    }

    /**
     * Test of eliminarUsuario method, of class UsuarioMatriz.
     */
    @Test
    public void testEliminarUsuario() {
    }

    /**
     * Test of getUsuario method, of class UsuarioMatriz.
     */
    @Test
    public void testGetUsuario_int() {
    }

    /**
     * Test of getUsuario method, of class UsuarioMatriz.
     */
    @Test
    public void testGetUsuario_String() {
    }

    /**
     * Test of getUsuarios method, of class UsuarioMatriz.
     */
    @Test
    public void testGetUsuarios() {
    }

    /**
     * Test of modificarUsuario method, of class UsuarioMatriz.
     */
    @Test
    public void testModificarUsuario() {
    }
    
}
