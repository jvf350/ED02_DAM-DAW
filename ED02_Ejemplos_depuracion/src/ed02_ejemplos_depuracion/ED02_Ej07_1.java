
package ed02_ejemplos_depuracion;

/**
 *
 * @author jm
 */
public class ED02_Ej07_1 {
    
    /**
     * Programa que cuenta las "b" que hay entre las aes 
     * @param args the command line arguments
     */
    
    public static void main(String[] args) 
    {
        boolean someOne;
        int eraseZero, temp;
        String[] lines = {"abbabbaaab", "aaaba", "bbba", "ababab"};

        for (int i = 0; i < lines.length; i++) {
            String s = lines[i];
            System.out.println(s);
            someOne = false; // Sirve para marcar que se ha encontrado una "a"
            eraseZero = 0; // Almacena las "b" contadas por "temp" antes de una "a"
            temp = 0; // Cuenta las "b" después de una "a"
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'a') {
                    if (someOne && temp != 0) {
                        eraseZero += temp;
                        temp = 0;
                    } else {
                        someOne = true;
                    }
                } else if (someOne == true) {
                    temp++;
                }
            }
            System.out.println(eraseZero);
        }

    }
}
