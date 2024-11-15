package ed02_ejemplos_depuracion;

/**
 *
 * @author jm
 */
/* Clase que hace uso del array de Strings args
   del método principal, se le pasa un argumento,
   en este caso una ruta de un fichero 
   C:\Windows\system.ini (se le puede pasar cualquier
   cadena) que se almacena en la 1ª posición del array,
   luego se crea una 2ª variable que apunta a la 2ª 
   posición con lo que el programa finaliza con error.
*/

public class ED02_Ej03 {
    
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
      
        String array[];
        array = new String[2];
        array[0] = "Desarrollo de Aplicaciones Web";
        array[1] = "Entornos de Desarrollo";
        
        if (array.length < 1) {
            System.out.println("Indicar por favor nombre de fichero");
         return;
        } else {
            String nomFich = array[2];
            System.out.println("La cadena almacenada en la posicion indicada es: " +nomFich);
        }
    } 
    
}
