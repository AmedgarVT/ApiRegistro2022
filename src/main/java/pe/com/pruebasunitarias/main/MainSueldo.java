package pe.com.pruebasunitarias.main;

import java.util.Scanner;
import pe.com.pruebasunitarias.clases.Sueldo;
import pe.com.pruebasunitarias.clases.implementaciones.ImpSueldo;
import pe.com.pruebasunitarias.interfaces.ISueldo;

public class MainSueldo {

    public static void main(String[] args) {
        //creando un objeto de la clase
        Sueldo objSueldo = new Sueldo();
        //implementar la interfaz
        ISueldo sueldos = new ImpSueldo();
        //declarar una variable para la lectura de datos
        Scanner sc = new Scanner(System.in);
        //declarando variables
        int nh = 0;
        double ch = 0, hr = 0,sb = 0, b1 = 0, b2 = 0, d = 0, sf = 0;
        //capturando valores
        try {
            System.out.println("Ingrese el costo por hora trabajadas:");
            ch = sc.nextDouble();
            System.out.println("Ingrese el numero de horas trabajadas:");
            hr = sc.nextDouble();
            System.out.println("Ingrese el numero de hijos del trabajador:");
            nh = sc.nextInt();
            //enviamos valores a la clase
            objSueldo.setCostohoras(ch);
            objSueldo.setNumerohoras(hr);
            objSueldo.setNumerohijos(nh);
            //realizando opreaciones
            sb = sueldos.CalculaSueldoBasico(objSueldo);
            b1 = sueldos.CalculaBonificacion1(objSueldo);
            b2 = sueldos.CalculaBonificacion2(objSueldo);
            d = sueldos.CalculaDescuento(objSueldo);
            sf = sueldos.CalculaSueldoFinal(objSueldo);
            //enviamos los valores a la clase
            objSueldo.setSueldobasico(sb);
            objSueldo.setBonificacion1(b1);
            objSueldo.setBonificacion2(b2);
            objSueldo.setDescuento(d);
            objSueldo.setSueldofinal(sf);
            //mostramos informacion
            sueldos.MostrarResultados(objSueldo);
        } catch (Exception ex) {
            System.err.println(ex.toString());
            System.err.println("Solo se permiten ingresar valores numericos");
        }
    }

}
