/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numdepernas;

import java.util.Scanner;

/**
 *
 * @author Kris
 */
public class NumDePernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Quantas pernas ?");
        Scanner tec = new Scanner(System.in);
        int perna = tec.nextInt();
        String tipo;
        System.out.println("Isso e um(a) ");
        switch (perna) {
            case 1 :
                tipo = "Saci";
                break;
            case 2 :
                tipo = "Bipede";
                break;
            case 3 : 
                tipo = "Tripe";
                break;
            case 4 :
                tipo = "Quadripede";
                break;
            case 6,8 :
                tipo = "Aranha";
                break;
            default :
                tipo = "ET";
                           
        }
        System.out.println(tipo);
        
    }
    
}
