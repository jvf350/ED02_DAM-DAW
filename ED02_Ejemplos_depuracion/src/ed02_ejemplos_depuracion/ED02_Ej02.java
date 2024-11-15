package ed02_ejemplos_depuracion;

/**
 *
 * @author jm
 */
/* Clase que recrea la tabla de multiplicar del 3,
   con dos variables que se han nombrado de forma
   muy poco intuitiva, lo que dificulta su seguimiento.
   Al hacer debugging, se puede ver como ninguna de las
   variables cambia nunca de valor. Además, como se usa
   z04532 como condición para cerrar el bucle y vale
   siempre 1, nunca se cerrará entrando en un bucle
   infinito.
 */

public class ED02_Ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int z04l32 = 3;
        int z04532;
        int z04132 = 0;

        z04532 = 1;

        do {
            z04132 = z04532 * z04l32;
            System.out.println(z04l32 + " x " + z04532 + " = " + z04132);
        } while (z04532 < 10);
    }
}

/* Para solucionarlo habría que añadir z04532++; //z04532 = z04532+1 
dentro del bucle y tras hacer la operación.*/

