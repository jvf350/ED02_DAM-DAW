package ed02_ejemplos_depuracion;

import java.util.Scanner;

public class saludoInverso {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario su nombre
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        
        // Saludo al usuario
        System.out.println("Hola, " + nombre + "!");

        System.out.print("Tu nombre al revés es: ");
        for (int i = 0; i <= nombre.length(); i++) {
            System.out.print(nombre.charAt(i));       
        }       
        
        scanner.close();
    }
    
}

/* Para solucionarlo se cambia el bucle repetitivo:
for (int i = nombre.length()-1; i >= 0; i--) {
            System.out.print(nombre.charAt(i));       
}
*/