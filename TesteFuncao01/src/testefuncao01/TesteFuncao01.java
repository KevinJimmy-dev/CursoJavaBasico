/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testefuncao01;

/**
 *
 * @author Kevin Jimmy
 */
public class TesteFuncao01 {

    /**
     * @param args the command line arguments
     */
    
    static int soma(int a, int b){
        int soma = a + b;
        return soma;
    }
    
    public static void main(String[] args) {
        System.out.println("Comecou o programa");
        int sm = soma(5, 2);
        System.out.println("A soma vale: " + sm);
    }
    
}
