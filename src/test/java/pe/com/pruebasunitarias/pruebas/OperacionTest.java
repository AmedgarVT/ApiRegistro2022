package pe.com.pruebasunitarias.pruebas;

import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import pe.com.pruebasunitarias.clases.Operacion;
import pe.com.pruebasunitarias.clases.implementaciones.ImpOperacion;

import pe.com.pruebasunitarias.interfaces.IOperacion;

public class OperacionTest {

    //definimos un objeto de la clase Operacion
    private static Operacion objoperacion;
    private static IOperacion operaciones;
    //declaracion de variables
    double resultado = 0, sum = 0, res = 0, mul = 0, div = 0;
    //declarando objetos nulos
    private Operacion objoperacion2 = null;
    private IOperacion operaciones2 = null;

    @Test // prueba
    public void PruebaInicial() {
        System.out.println("Esta es la prueba inicial");
    }

    @BeforeAll //antes de todo
    public static void BeforeAllTest() {
        objoperacion = new Operacion();
        operaciones = new ImpOperacion();
        System.out.println("BeforeAll -> BeforeAllTest");
    }

    @AfterAll //despues de todo
    public static void AfterAllTest() {
        objoperacion = null;
        operaciones = null;
        System.out.println("AfterAll -> AfterAllTest");
    }

    @Test
    public void CalculaSumaAssertTest() {
        //definimos una variable para el valor esperado
        resultado = 7;
        objoperacion.setNumero1(5);
        objoperacion.setNumero2(2);
        sum = operaciones.CalculaSuma(objoperacion);
        assertEquals(resultado, sum);
        System.out.println("Test -> CalculaSumaAssertTest");
    }

    @Test
    public void CalCulaRestaAssertTest() {
        resultado = 3;
        objoperacion.setNumero1(5);
        objoperacion.setNumero2(2);
        res = operaciones.CalculaResta(objoperacion);
        assertEquals(resultado, res);
        System.out.println("Test -> CalCulaRestaAssertTest");
    }

    @Test
    public void CalculaMultiplicacionAssertTest() {
        resultado = 10;
        objoperacion.setNumero1(5);
        objoperacion.setNumero2(2);
        mul = operaciones.CalculaMultiplicacion(objoperacion);
        assertEquals(resultado, mul);
        System.out.println("Test -> CalculaMultiplicacionAssertTest");
    }

    @Test
    public void CalculaDivisionAssertTest() {
        resultado = 2.5;
        objoperacion.setNumero1(5);
        objoperacion.setNumero2(2);
        div = operaciones.CalculaDivision(objoperacion);
        assertEquals(resultado, div);
        System.out.println("Test -> CalculaDivisionAssertTest");
    }

    @Test
    public void OperacionNotNullTest() {
        assertNotNull(objoperacion, "objoperacion no puede ser nulo");
        System.out.println("Test -> OperacionNotNullTest");
    }

    @Test
    public void IOperacionNotNull() {
        assertNotNull(operaciones, "operaciones tiene que ser nulo");
        System.out.println("Test -> OperacionNotNullTest");
    }

    @Test
    public void OperacionNullTest() {
        assertNull(objoperacion2, "objoperacion tiene que nulo");
        System.out.println("Test -> OperacionNotNullTest");
    }

    @Test
    public void IOperacionNull() {
        assertNull(operaciones2, "operaciones es nulo");
        System.out.println("Test -> OperacionNotNullTest");
    }

    @Test
    public void CalculaSumaAssertTest2() {
        assertEquals(10, operaciones.CalculaSuma(new Operacion(7, 3, 0, 0, 0, 0)));
        System.out.println("Test -> CalculaSumaAssertTest2");

    }

    @Test
    public void CalculaRestaAssertTest2() {
        assertEquals(4, operaciones.CalculaResta(new Operacion(7, 3, 0, 0, 0, 0)));
        System.out.println("Test -> CalculaRestaAssertTest2");

    }

    @Test
    public void CalculaMultiplicacionAssertTest2() {
        assertEquals(21, operaciones.CalculaMultiplicacion(new Operacion(7, 3, 0, 0, 0, 0)));
        System.out.println("Test -> CalculaMultiplicacionAssertTest2");

    }

    @Test
    public void CalculaDivisionAssertTest2() {
        assertEquals(2.3333333333333335, operaciones.CalculaDivision(new Operacion(7, 3, 0, 0, 0, 0)));
        System.out.println("Test -> CalculaDivisionAssertTest2");

    }

    @Test
    public void CalculaSumaNegativoAssertTest() {
        assertEquals(-3, operaciones.CalculaSuma(new Operacion(-5, 2, 0, 0, 0, 0)));
        System.out.println("Test -> CalculaSumaAssertTest2");

    }

    @Test
    public void CalculaRestaNegativoAssertTest() {
        assertEquals(-7, operaciones.CalculaResta(new Operacion(-5, 2, 0, 0, 0, 0)));
        System.out.println("Test -> CalculaRestaAssertTest2");

    }

    @Test
    public void CalculaMultiplicacionNegativoAssertTest() {
        assertEquals(-10, operaciones.CalculaMultiplicacion(new Operacion(-5, 2, 0, 0, 0, 0)));
        System.out.println("Test -> CalculaMultiplicacionAssertTest2");

    }

    @Test
    public void CalculaDivisionNegativoAssertTest() {
        assertEquals(-2.5, operaciones.CalculaDivision(new Operacion(-5, 2, 0, 0, 0, 0)));
        System.out.println("Test -> CalculaDivisionAssertTest2");
    }

    @Disabled
    public void CalculaDivisionCeroTest() {
        assertEquals(2.5, operaciones.CalculaDivision(new Operacion(5, 0, 0, 0, 0, 0)));
        System.out.println("Test -> CalculaDivisionCeroTest");
    }

}

