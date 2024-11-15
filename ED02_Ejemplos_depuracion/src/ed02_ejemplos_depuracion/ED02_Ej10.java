
package ed02_ejemplos_depuracion;

/**
 *
 * @author jm
 */
public class ED02_Ej10 {

    public static void main(String[] args) {

        int i = 0;

        while (i < 10) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(i + " es múltiplo de 2 o 3");
            } else if (i % 5 == 0) {
                System.out.println(i + " es múltiplo de 5");
            } else {
                System.out.println(i + " no es múltiplo de 2, 3 ni 5");
            }
            i++;
        }
    }
}