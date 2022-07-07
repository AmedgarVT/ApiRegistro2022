package pe.com.pruebasunitarias.main;

import java.util.Scanner;
import pe.com.pruebasunitarias.clases.Operacion;
import pe.com.pruebasunitarias.clases.implementaciones.ImpOperacion;
import pe.com.pruebasunitarias.interfaces.IOperacion;

public class MainOperacion {


    public static void main(String[] args) {
        //creando un objeto de la clase
        Operacion objOperacion=new Operacion();
        //implementar la interfaz
        IOperacion operaciones=new ImpOperacion();
        //declarar una variable para la lectura de datos
        Scanner sc=new Scanner(System.in);
        //declarando variables
        double n1 = 0, n2 = 0, sum = 0, res = 0,mul = 0,div = 0;
        //capturando valores
        try {
            System.out.println("Ingrese el numero 1:");
        n1 = sc.nextDouble();
        System.out.println("Ingrese el numero 2:");
        n2 = sc.nextDouble();
        //enviamos valores a la clase
        objOperacion.setNumero1(n1);
        objOperacion.setNumero2(n2);
        //realizando opreaciones
        sum=operaciones.CalculaSuma(objOperacion);
        res=operaciones.CalculaResta(objOperacion);
        mul=operaciones.CalculaMultiplicacion(objOperacion);
        div=operaciones.CalculaDivision(objOperacion);
        //enviamos los valores a la clase
        objOperacion.setSuma(sum);
        objOperacion.setResta(res);
        objOperacion.setMultiplicacion(mul);
        objOperacion.setDivision(div);
        //mostramos informacion
        operaciones.MostrarResultados(objOperacion);
        } catch (Exception ex) {
            System.err.println(ex.toString());
            System.err.println("Solo se permiten ingresar valores numericos");
        }
    }
    
}
