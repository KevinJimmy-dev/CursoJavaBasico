package IdiomaDoSistema;

import java.util.Locale;

public class IdiomaDoSistema {
    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.print("Seu sistema está em ");
        System.out.println(loc.getDisplayLanguage());
    }
}
