package ed02_ejemplos_depuracion;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


/**
 *
 * @author jm
 */
public class ED02_Ej12 {

    public static void main(String[] args) {

        ED02_Ej12 ejemplo = new ED02_Ej12();
        ejemplo.whatsYourName();
    }

    public String inputName() {
        return JOptionPane.showInputDialog(null, "Introduce tu nombre:");
    }

    public void whatsYourName() {
        String name = "";
        boolean op = false;
        do {
            ED02_Ej12 ejemplo = new ED02_Ej12();
            name = ejemplo.inputName();
            String timeStamp = new SimpleDateFormat("MM.dd.MM.yyyy - HH.mm.ss").format(new Date());
            if (name.equals("")) {
                System.err.println(timeStamp + " Input name: " + name);
            } else {
                System.out.println(timeStamp + " Input name: " + name);
            }

            if (name.equals("")) {
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
