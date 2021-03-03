/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

/**
 *
 * @author alave
 */
public class ShowStudent {
   
    public static void main(String[] args ){
        
        
        Student estudiante = new Student();
        
        System.out.println(estudiante.getId());
        System.out.println(estudiante.getPoints());
        System.out.println(estudiante.getcreditHours());
    }
}
