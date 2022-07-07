package pe.com.pruebasunitarias.clases.implementaciones;

import pe.com.pruebasunitarias.clases.Sueldo;
import pe.com.pruebasunitarias.interfaces.ISueldo;

public class ImpSueldo implements ISueldo {

    @Override
    public double CalculaSueldoBasico(Sueldo o) {
        try {
            double sb = o.getCostohoras()*o.getNumerohoras();
            return sb;
        } catch (Exception e) {
            System.err.println(e.toString());
            return 0;
        }
    }

    @Override
    public double CalculaBonificacion1(Sueldo o) {
        try {
            double b1 = o.getCostohoras()*o.getNumerohoras()* 0.12;
            return b1;
        } catch (Exception e) {
            System.err.println(e.toString());
            return 0;
        }
    }

    @Override
    public double CalculaBonificacion2(Sueldo o) {
        try {
            int b2 = o.getNumerohijos() * 30;
            return b2;
        } catch (Exception e) {
            System.err.println(e.toString());
            return 0;
        }
    }

    @Override
    public double CalculaDescuento(Sueldo o) {
        try {
            double d = o.getCostohoras()*o.getNumerohoras() * 0.08;
            return d;
        } catch (Exception e) {
            System.err.println(e.toString());
            return 0;
        }
    }

    @Override
    public double CalculaSueldoFinal(Sueldo o) {
        try {
            double sf =o.getCostohoras()*o.getNumerohoras() + o.getCostohoras()*o.getNumerohoras()* 0.12 + o.getNumerohijos() * 30 - o.getCostohoras()*o.getNumerohoras() * 0.08;
            return sf;
        } catch (Exception e) {
            System.err.println(e.toString());
            return 0;
        }
    }

    @Override
    public void MostrarResultados(Sueldo o) {
        System.out.println("Los Resultados son:");
        System.out.println("---------------------------");
        System.out.println("El sueldo basico es: "+o.getSueldobasico());
        System.out.println("La bonificación 1 es: "+o.getBonificacion1());
        System.out.println("La bonificación 2 es: "+o.getBonificacion2());
        System.out.println("El descuento es: "+o.getDescuento());
        System.out.println("El sueldo final es :"+o.getSueldofinal());

    }

}
