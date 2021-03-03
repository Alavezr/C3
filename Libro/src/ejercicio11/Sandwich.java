/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

/**
 *
 * @author alave
 */
public class Sandwich {
    
    private double price;
    private String ingrediente;
    private String pan;
    


public Sandwich(){

this.price = 4.99;

this.pan = "wheat";

this.ingrediente = "Tuna";


}

public double setPrice(int i){
    
    this.price = i;
        return 0;
    
}

public double getPrice(){
    
    return this.price;
}


}






