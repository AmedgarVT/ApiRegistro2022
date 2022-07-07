package pe.com.pruebasunitarias.clases;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder //crea la clase constructora
@AllArgsConstructor //metodo constructor con parametros
@NoArgsConstructor //metodo constructor sin parametros
@Data //metodo get y metodo set

public class Operacion {
    private double numero1;
    private double numero2;
    private double suma;
    private double resta;
    private double multiplicacion;
    private double division;
}
