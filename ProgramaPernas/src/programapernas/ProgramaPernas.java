/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programapernas;

import java.util.Scanner;

/**
 *
 * @author Kevin Jimmy
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Quantas pernas? ");
        int perna = tec.nextInt();
        String tipo;
        
        System.out.print("Isso e um(a) ");
        
        switch(perna){
            case 1:
                tipo = "Sacy";
                break;
                
            case 2:
                tipo = "Bipede";
                break;
                
            case 3:
                tipo = "Tripé";
                break;
                
            case 4:
                tipo = "Quadrupede";
                break;
                
            case 6:
                tipo = "Aranha";
                break;
                
            default:
                tipo = "ET";
                break;
        }
        
        System.out.println(tipo); 
    }
    
}
