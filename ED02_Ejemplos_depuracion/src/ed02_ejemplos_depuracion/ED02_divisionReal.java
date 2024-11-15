package ed02_ejemplos_depuracion;

/**
 *
 * @author jm
 */
/* Clase que realiza la división real de dos números
   reales, obteniendo un resultado inconsistente (Infinity)
   para solucionarlo se introduce un condicional y se le da
   un valor concreto al resultado si el divisor es 0 
   (solución de compromiso) */

public class ED02_divisionReal {
    
    public static void main(String[] args) {

        double dividendo = 15.0;
        double divisor = 0.0;
        System.out.println("El resultado de la división real de " +dividendo+ " entre " 
        +divisor+ " es " +division_real(dividendo, divisor));
    }

    public static double division_real (double x, double y) {
        return (x/y);
    }
    
    // Posible solución:
    
    /*public static double division_real (double dividendo, double divisor){
	
		double aux;
		if (divisor != 0){
		aux = dividendo/divisor;
		}
		else {
		aux = 0.0;
		}
		return aux;
    }*/	   
}
