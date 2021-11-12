package edu.cibertec.capitulo6.ejercicio2;

public class CalculoDescuento {

    private static int contadorDctos = 0;
    
    public final static double RANGO_INICIO_DCTO = 125.25;
    public final static double RANGO_FIN_DCTO = 200.50;
    public final static int PORCENTAJE_DCTO = 5;
    
    public static double aplicarDescuento(double cantidad){
        contadorDctos++;
        System.out.println("Descuentos aplicados hasta el momento = "
                +contadorDctos);
        if (contadorDctos < 4)
        {
            double porcentaje = ((double)PORCENTAJE_DCTO) / 100;
            return cantidad * porcentaje;
        }
        else
            return 0;
    }
}
