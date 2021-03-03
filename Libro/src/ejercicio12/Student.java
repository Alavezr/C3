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
public class Student {
    
    private int id;
    private int creditHours;
    private int points;
    
    
    
    public Student(){
        
        this.id = 9999;
        this.creditHours = 3;
        this.points = 12;
    }
    
    public void setId(int i ){
        
        this.id = i;
    }
    public int getId(){
        return this.id;
    }
    
    public void setcreditHours( int creditHours){
        
        this.creditHours = creditHours;
        
    }
    public int getcreditHours(){
        
        return this.creditHours;
    }

    public void setPoins(int points){
        
        this.points = points;
        
    }
    public int getPoints(){
        
        return this.points;
    }
    
    public int gradePointAvererage(){
        
        return this.getPoints() / this.getcreditHours();
    }

}


