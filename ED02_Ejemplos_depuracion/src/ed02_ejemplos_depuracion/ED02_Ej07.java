
package ed02_ejemplos_depuracion;

/**
 *
 * @author jm
 */
public class ED02_Ej07 {
    
    /**
     * Programa que cuenta las "b" que hay entre las aes
     * con errores de lógica
     * @param args the command line arguments
     */
    
    public static void main(String[] args) 
    {
        boolean someOne;
        int eraseZero, temp;
        String[] lines = {"abbabbaaab", "aaaba", "bbba", "ababab"};

        for (int i = 0; i < lines.length; i++) {
            String s = lines[i];
            someOne = true;
            eraseZero = 0;
            temp = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == 'a') {
                    if (someOne && temp != 0) {
                        eraseZero += temp;
                        temp = 0;
                    } else {
                        someOne = true;
                    }
                } else if (someOne) {
                    temp++;
                }
            }
            System.out.println(eraseZero);
        }

    }
}
