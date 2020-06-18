/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.teste;

import model.design.Conversor;

/**
 *
 * @author Wolf390 (Alef)
 */
public class TesteConversor {
    
    //Criação do Métodos Main.
    public static void main(String[] args) {
        
    //Criação e Instância Objeto da Classe Conversor.
    Conversor conversor = new Conversor();
    
    //Atribuindo Dois Números Depois da Vírgula e Métodos.
    System.out.println("\n\t\t\t -- CONVERSOR DE °C PARA °F \n");
    System.out.printf("%.2f°C = %.2f°F\n", 0.0, conversor.celFah(0.0));
    System.out.printf("%.2f°C = %.2f°F\n", -40.0, conversor.celFah(-40.0));
    System.out.printf("%.2f°C = %.2f°F\n", 38.0, conversor.celFah(38.0));
    
    System.out.println("\n\t\t\t -- CONVERSOR DE °F PARA °C \n");
    System.out.printf("%.2f°C = %.2f°F\n", 32.0, conversor.fahCel(32.0));
    System.out.printf("%.2f°C = %.2f°F\n", -40.0, conversor.fahCel(-40.0));
    System.out.printf("%.2f°C = %.2f°F\n", 100.4, conversor.fahCel(100.4));
    }
    
}
