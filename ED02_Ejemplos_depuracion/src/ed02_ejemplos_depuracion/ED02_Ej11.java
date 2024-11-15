package ed02_ejemplos_depuracion;

public class ED02_Ej11 {

        public static void main(String[] args) {
            String txt = "Java desde 0";
            if (txt.length() < 10) {
                System.out.println(txt + " Es menor que 10");
            } else if (txt.length() > 10) {
                System.out.println(txt + " Es mayor que 10");
            }
        }
}
