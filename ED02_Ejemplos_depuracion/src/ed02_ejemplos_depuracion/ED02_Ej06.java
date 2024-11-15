
package ed02_ejemplos_depuracion;

/**
 *
 * @author jm
 */
public class ED02_Ej06 {
    
    public static void main(String[] args)
    {
        int[] n = {3, -5, 0, 87, 0};
        
        for(int i = n.length-1; i >= 0; i--)
            System.out.println(i + ": " + n[i]);
    }
}
