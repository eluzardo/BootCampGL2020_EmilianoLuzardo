/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3estructurasbasicas;

/**
 *
 * @author Emi
 */
public class Empleado {
    static double SALARIO;
    static String NOMBRE = "Alex";
    
    public Empleado(double SALARIO){
        this.SALARIO = SALARIO;
    }

    public void datosEmpleado(){
        System.out.println(NOMBRE+" tiene un salario promedio de "+SALARIO);
    }
   
    
    
}
