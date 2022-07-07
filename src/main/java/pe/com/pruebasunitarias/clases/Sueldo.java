package pe.com.pruebasunitarias.clases;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder //crea la clase constructora
@AllArgsConstructor //metodo constructor con parametros
@NoArgsConstructor //metodo constructor sin parametros
@Data //metodo get y metodo set

public class Sueldo {
    private double costohoras;
    private double numerohoras;
    private double sueldobasico;
    private int numerohijos;
    private double bonificacion1;//12% del SB
    private double bonificacion2;//30 por hijo
    private double descuento;//8% del SB
    private double sueldofinal;
}
