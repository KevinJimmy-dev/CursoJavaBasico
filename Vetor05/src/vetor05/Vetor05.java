/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor05;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Kevin Jimmy
 */
public class Vetor05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int v[] = new int[20];
        Random gerador = new Random();
        
        Arrays.fill(v, gerador.nextInt(20));
        
        for(int valor: v){
            System.out.print(valor + " ");
        }
    }
    
}
