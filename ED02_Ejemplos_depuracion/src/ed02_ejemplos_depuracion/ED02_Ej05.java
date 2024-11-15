
package ed02_ejemplos_depuracion;

/**
 *
 * @author jm
 */
public class ED02_Ej05 {
    
     public static void main(String args[])
    {
        int a = 28;
        int b = 4;
        int c = 45;
        int d = 0;
       
        //int e = a / b;
        //int f = c / d;

        // Utilizamos el operador ternario para asignar valores a
        // las dos variables e y f, que son resultado de la
        // evaluación realizada por el operador
        int e = (b == 0) ? 0 : (a / b);
        int f = (d == 0) ? 0 : (c / d);
    
        System.out.println( "a = " + a );
        System.out.println( "b = " + b );
        System.out.println( "c = " + c );
        System.out.println( "d = " + d );
        System.out.println();
        System.out.println( "a / b = " + e );
        System.out.println( "c / d = " + f );
    
    }
}
