/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4controlflujos;

/**
 *
 * @author Emi
 */
public class Ej45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador = 0,
            resto = 0;
        
        
        
        for (int i=0; i<10000 ;i++ ){
            resto = i%20;
            if(resto==0)
                contador++;
        }
        System.out.println(contador);
    }
    
}
