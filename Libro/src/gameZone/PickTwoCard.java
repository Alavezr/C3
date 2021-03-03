/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone;

import java.util.Random;

/**
 *
 * @author alave
 */
public class PickTwoCard {
    
    public static void main(String[] args){
        Random r = new Random();
        int aleatorio = r.nextInt(11)+ 10;
        System.out.println(aleatorio);
        
        Suit s = Suit.DIAMANTES;
        
    }
    
}
