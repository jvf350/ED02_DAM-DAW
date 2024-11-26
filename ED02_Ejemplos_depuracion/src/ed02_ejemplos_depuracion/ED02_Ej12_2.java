package ed02_ejemplos_depuracion;

import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ED02_Ej12_2 {

    private static ED02_Ej12_2 ejemplo;

    public static void main(String[] args) {
        ejemplo = new ED02_Ej12_2();
        ejemplo.whatsYourName();
    }

    public String inputName() {
        return JOptionPane.showInputDialog(null, "Introduce tu nombre:");
    }

    public void whatsYourName() {
        String name = "";
        boolean op = false;
        do {
            try {
                name = ejemplo.inputName();
                String timeStamp = new SimpleDateFormat("MM.dd.MM.yyyy - HH.mm.ss").format(new Date());
                if (name.equals("") || name.equals(null)) {
                    System.err.println(timeStamp + " Input name: " + name);
                } else {
                    System.out.println(timeStamp + " Input name: " + name);
                }
                if (!name.equals("")) {
                    int i = JOptionPane.showConfirmDialog(null, "Hola " + name + " ¿Quieres salir del programa?", null,
                            JOptionPane.ERROR_MESSAGE);
                    if (i == 1) {
                        System.out.println(timeStamp + " ¿Cerrar programa?: " + i + " = (No)");
                        whatsYourName();
                    } else {
                        System.out.println(timeStamp + " ¿Cerrar programa?: " + i + " = (Si)");
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No has introducido un nombre", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (op == true);
    }
}
