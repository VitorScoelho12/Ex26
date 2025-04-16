

package com.mycompany.ex26;

import java.util.Arrays;
import javax.swing.JOptionPane;


public class Ex26 {

   
    public static void main(String[] args) {
        int numeros[] = new int [20];
        for ( int i = 0; i < 20; i++ ){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("digite os numeros"));        
        }
       Arrays.sort(numeros);
         JOptionPane.showMessageDialog(null,"numeros ordenados em ordem crescente");
         for ( int numero : numeros){
             JOptionPane.showMessageDialog(null, numero);
         }       
        
    }
}
 
 
