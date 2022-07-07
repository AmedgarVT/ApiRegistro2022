/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.pruebasunitarias.pruebas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pe.com.pruebasunitarias.interfaces.ISueldo;

/**
 *
 * @author A20204357
 */
public class Sueldo {
    
    private static Sueldo objsueldo;
    private static ISueldo sueldo;
    
    
    @Test // prueba
    public void CalcularSueldoBasicoTest() {
        res = 500;
        assertEquals(res, sueldo.CalculaSueldoBasico(new Sueldo (100, 5,,5,0,0,0,0,0)));
        
       
        System.out.println("Esta es la prueba inicial");
    }
    }