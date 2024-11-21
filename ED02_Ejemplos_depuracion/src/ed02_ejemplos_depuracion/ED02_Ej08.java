
package ed02_ejemplos_depuracion;

import java.util.Scanner;

/**
 *
 * @author jm
 */
public class ED02_Ej08 {

    /**
     * Programa "clasificador de población"  en función
     * de los valores ingresados desde teclado
     * @param args the command line arguments
     */

    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);

        System.out.println("Introduce tu sexo (H-hombre y M-mujer: )");
        char sexo = entrada.next().charAt(0);

        System.out.println("Introduce tu edad: ");
        int edad = entrada.nextInt();

        if (edad >=18 || sexo=='H'){
            System.out.println("Eres hombre y mayor de edad");
        }
            else if (edad >=18 || sexo=='M'){
                System.out.println("Eres mujer y mayor de edad");
            }
                else if (edad <18 || sexo=='M'){
                    System.out.println("Eres mujer y menor de edad");
                }
        else {
            System.out.println("Eres hombre y menor de edad");
        }
    }
}
