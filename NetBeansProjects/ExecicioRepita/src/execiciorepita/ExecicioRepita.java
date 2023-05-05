/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package execiciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author Kris
 */
public class ExecicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, s = 0;
        int nImpar = 0;
        int nP = 0;
        int maiorCem = 0 ;
        int tot = 0 ;
        float m ;

        do {
            num = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe um numero: <br><em>(Valor 0 para o Programa)</em></html> "));
            s += num;
            tot ++;

            if (num % 2 == 0) {
                nP++;

            } else {
                nImpar++;
            }
            if (num > 100){
                maiorCem++;
            }
                    
        } while (num != 0);
        
        m = s/tot;
        
        JOptionPane.showMessageDialog(null, "<html>RESULTADO FINAL <br>----------------"
                +"<br>Soma do Numeros > " + s
                + "<br>Numeros Pares > " + nP
                + "<br>Numeros Impares > " + nImpar
                + "<br>Acima de 100 > " + maiorCem
                + "<br>Media dos Numeros > " + m);
              
    }

}
