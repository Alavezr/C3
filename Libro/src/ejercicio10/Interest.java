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
public class Interest {
    
    private double money;
    private double interes;
    
    public static final int TASA = 5;                   //constante con mayuscula
    
    public Interest(double money){
        this.money = money;
        this.interes = calcularInteres();           
    }

    public double getMoney(){
        return this.money;
    }
    
    public void setMoney(double money){   // (parametro)
        this.money = money;
        this.interes = calcularInteres();
    }
    
    public double getInteres(){
        return this.interes;
    }
    
    
    
    
    public double calcularInteres(){
        
        return (money * TASA)/100;
    }
    
    
    
    
    
    











}
