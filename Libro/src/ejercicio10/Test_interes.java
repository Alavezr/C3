/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

/**
 *
 * @author alave
 */
public class Test_interes {
    
    public static void main(String[] args) {
        Interest i = new Interest(20000);
        i.setMoney(50000);        
        System.out.println(i.getInteres());
        System.out.println(i.getMoney());
            
        
    }
    
    
    
}
