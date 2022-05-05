/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;
/**
 *
 * @author Kevin Jimmy
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, d = 0, s = 0, p = 0, i = 0, a = 0, m = 0;
        
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe um  número: <br> <em>(valor 0 interrompe)</em></html>"));
            
            if(n % 2 == 0){
                p++;
            } else{
                i++;
            }
            
            if(n > 100){
                a++;
            }
            
            s += n;
            d++;
            
            m = s / d;
            
        } while (n != 0);
        
        JOptionPane.showMessageDialog(null, 
                "<html>Resultado Final <hr>"
                + "<br>Somatório vale " + s 
                + "<br> Total de Valores: " + d 
                + "<br> Total de Pares: " + p
                + "<br> Total de Impares: " + i
                + "<br> Acima de 100: " + a
                + "<br> Média dos Valores: " + m 
                + "</html>");
    }
    
}
