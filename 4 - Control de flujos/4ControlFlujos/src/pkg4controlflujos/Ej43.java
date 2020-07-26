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
public class Ej43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int compra = 400;
        double total = 0;

        if (compra == 300) {
            total =(compra * 0.20);
            System.out.println("El descuento es de: " + total);
        } else if (compra > 350) {
            total =(compra * 0.25);
            System.out.println("El descuento es de: " + total);
        }else{
            System.out.println("Sin descuentos, el total es de: " + compra);
        }
    }

}
