package ed02_ejemplos_depuracion;

/**
 *
 * @author jm
 */
/* Clase con definición e inicialización de dos variables para 
   ilustrar una primera aproximación al seguimiento de 
   variables y la depuración de código. Vemos cómo se puede
   modificar el valor de las variables inicializadas en el 
   programa desde el depurador, probando también expresiones. */

public class ED02_Ej01 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        int a=1;
        int b = a;
        b=b+1;
        System.out.println("a vale "+a+" y b vale "+b);
        
    }       
        
}
