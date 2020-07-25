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
public class StudentDetails {
    
    private int age = 0;
    
    public StudentDetails (int age){
        this.age = age;
    }
     
    public void studentAge() {
                System.out.println("La edad del estudiante es " + age);
            }
    
}
