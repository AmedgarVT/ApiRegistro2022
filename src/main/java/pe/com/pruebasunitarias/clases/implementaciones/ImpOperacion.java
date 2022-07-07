package pe.com.pruebasunitarias.clases.implementaciones;

import pe.com.pruebasunitarias.clases.Operacion;
import pe.com.pruebasunitarias.interfaces.IOperacion;


public class ImpOperacion implements IOperacion{

    @Override
    public double CalculaSuma(Operacion o) {
        try{
            double s=o.getNumero1()+o.getNumero2();
            return s;
        } catch(Exception e){
            System.err.println(e.toString());
            return 0;
        }
        
    }

    @Override
    public double CalculaResta(Operacion o) {
        try{
            double s=o.getNumero1()-o.getNumero2();
            return s;
        } catch(Exception e){
            System.err.println(e.toString());
            return 0;
        }
    }

    @Override
    public double CalculaMultiplicacion(Operacion o) {
        try{
            double s=o.getNumero1()*o.getNumero2();
            return s;
        } catch(Exception e){
            System.err.println(e.toString());
            return 0;
        }
    }

    @Override
    public double CalculaDivision(Operacion o) {
        try{
            double s=o.getNumero1()/o.getNumero2();
            return s;
        } catch(Exception e){
            System.err.println(e.toString());
            return 0;
        }
    }

    @Override
    public void MostrarResultados(Operacion o) {
        System.out.println("Los Resultados son:");
        System.out.println("---------------------------");
        System.out.println("La suma es: "+o.getSuma());
        System.out.println("La resta es: "+o.getResta());
        System.out.println("La multiplicacion es: "+o.getMultiplicacion());
        System.out.println("La division es: "+o.getDivision());
    }
    
}