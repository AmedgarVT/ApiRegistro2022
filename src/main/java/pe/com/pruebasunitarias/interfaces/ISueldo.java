package pe.com.pruebasunitarias.interfaces;

import pe.com.pruebasunitarias.clases.Sueldo;

public interface ISueldo {

    public double CalculaSueldoBasico(Sueldo o);
    
    public double CalculaBonificacion1(Sueldo o);

    public double CalculaBonificacion2(Sueldo o);

    public double CalculaDescuento(Sueldo o);

    public double CalculaSueldoFinal(Sueldo o);
    
    public void MostrarResultados(Sueldo o);
}
