package ed02_ejemplos_depuracion;

/**
 *
 * @author jm
 */
/* Clase con definición e inicialización de 3 variables 
   enteras con las que se hace una división entera
   y se reproduce un error en tiempo de ejecución
   de la clase ArithmeticException al dividir entre 0
   También se reproduce otro error al dar el valor null
   al denominador. */

public class ED02_divisionEntera {

    //Definición de variables
    public static int numerador = 10;
    public static int denominador = 0;
    public static float division;

	public static void main(String[] args) {

        System.out.println("ANTES DE HACER LA DIVISION");

        division = numerador/denominador;

        System.out.println("DESPUES DE HACER LA DIVISION");

    }

	// Se adopta lo que denominamos una SOLUCIÓN DE COMPROMISO. Damos un valor a la variable division en caso de que el denominador sea 0 y otro en caso de que sea null.
	// Con ello se consiguen capturar los potenciales errores y comprobamos que el flujo de ejecución del programa no se interrumpe.

    /*public static void main(String[] args) {
        System.out.println("ANTES DE HACER LA DIVISION");
		try {
			division = numerador/denominador;
		} catch (ArithmeticException aex) {
			division=0; //Si hay una excepción doy valor '0' al atributo 'division'
			System.err.println("Error: "+aex.getMessage());
		} catch (NullPointerException npex) {
			division=1; //Si la excepción es de un null doy valor '1' al atributo 'division'
			System.err.println("Error: "+npex.getMessage());
		} finally {
			System.out.println("Division: "+division);
			System.out.println("DESPUES DE HACER LA DIVISION");
		}

    }*/

}