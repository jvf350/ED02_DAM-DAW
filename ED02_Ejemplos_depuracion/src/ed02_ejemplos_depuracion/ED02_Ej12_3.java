package ed02_ejemplos_depuracion;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author jm
 */
public class ED02_Ej12_3 {

    private static ED02_Ej12_3 ejemplo;

    public static void main(String[] args) {

        ejemplo = new ED02_Ej12_3();
        ejemplo.whatsYourName();
    }

    public String inputName() {
        return JOptionPane.showInputDialog(null, "Introduce tu nombre:");
    }

    public void whatsYourName() {
        String name = "";
        boolean op = false;
        do {
            name = ejemplo.inputName();
            String timeStamp = new SimpleDateFormat("MM.dd.MM.yyyy - HH.mm.ss").format(new Date());
            if (name == null || name.equals("")) {
                //name = "desconocido";
                System.err.println(timeStamp + " Input name: " + name);
            } else {
                System.out.println(timeStamp + " Input name: " + name);
            }

            //1ª condición si se pulsa el botón "Cancel"
            // OR
            //2ª condición si se pulsa el botón "Ok" pero no se introduce nada en el diálogo de entrada (inputDialog)
            if (name==null || (name != null && name.equals(""))) {
                JOptionPane.showMessageDialog(null, "No has introducido un nombre", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                int i = JOptionPane.showConfirmDialog(null, "Hola " + name + " ¿Quieres salir del programa?", null,
                        JOptionPane.ERROR_MESSAGE);
                if (i == 1) {
                    System.out.println(timeStamp + " Option: " + i + " = (No)");
                    whatsYourName();
                } else {
                    System.out.println(timeStamp + " Option: " + i + " = (Si)");
                }
            }
        } while (op == true);
    }
}
