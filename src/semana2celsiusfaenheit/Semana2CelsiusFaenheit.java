/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana2celsiusfaenheit;

import java.util.Scanner;

/**
 *
 * @author JORGEENRIQUE
 */
public class Semana2CelsiusFaenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite la temperatura en °C: ");
        float celsius = sc.nextFloat();
        System.out.println("La temperatura en °F es: "+CeltoFar(celsius));
        
        
    }//Fin del main
    
    
    public static float CeltoFar(float celsius){
    
        float CelFar = 32 + (9*celsius/5);
    return CelFar;
    }
}
