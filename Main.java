import java.awt.*;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
    Date relogio = new Date();
        System.out.println("HORARIO ATUAL: ");
        System.out.println(relogio.toString());

        Locale Locale = java.util.Locale.getDefault();
        System.out.println("\nIDIOMA: ");
        System.out.println(Locale.getDisplayLanguage());
        System.out.println(Locale.getLanguage());

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("\nRESOLUÇÃO DA TELA: ");
        System.out.println("Screen Width = " + d.width);
        System.out.println("Sreen Height = " +d.height);
    }
}