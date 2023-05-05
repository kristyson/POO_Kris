/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerosrepeticao;

import java.util.Scanner;

/**
 *
 * @author Kris
 */
public class NumerosRepeticao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, s = 0;
        String stop;
        Scanner tec = new Scanner(System.in);
        do {
            System.out.println("Digite um Numero: ");
            n = tec.nextInt();
            s += n;
            System.out.println("Quer continuar ?");
            stop = tec.next();
            
        }while(stop.equals("S"));
        
        System.out.println("A soma dos num e > " +s);
        // TODO code application logic here
    }
    
}
