package ResolucaoTela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {
    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.print("A sua tela tem resolução ");
        System.out.print(d.width);
        System.out.print(" X ");
        System.out.print(d.height);
    }
}