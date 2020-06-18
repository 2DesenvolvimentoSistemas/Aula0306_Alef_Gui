/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.design;

/**
 *
 * @author Wolf390 (Alef)
 */
public class Conversor {
    
    //Método que converte Celcius para Fahrenheit.
    public double celFah(double cel){
        return 9 * cel / 5 + 32;
    }
    
    public double fahCel(double fah){
        return  (fah - 32) / 9 * 5;
    }
    
}
