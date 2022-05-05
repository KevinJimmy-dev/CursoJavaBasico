/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeross;

import java.util.Scanner;

/**
 *
 * @author Kevin Jimmy
 */
public class Numeross {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, soma = 0;
        String resp;
        
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("Digite um número: ");
            num = teclado.nextInt();
            
            soma += num;
            
            System.out.print("Quer continuar? [S/N] ");
            resp = teclado.next();
            
        } while(resp.equals("S"));
        
        System.out.println("A soma de todos os valores foi: " + soma);
    }
    
}
