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
public class Ej48 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 1;
        while (i <= 50) {
            if(i%2!=0){
                System.out.println("Valor iterado: " + i + " impar");
            }else{
                System.out.println("Valor iterado: " + i + " par");
            }
            
            i++;
        }
    }

}
