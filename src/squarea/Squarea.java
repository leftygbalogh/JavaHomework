/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package squarea;

import java.util.Scanner;

/**
 *
 * @author lefty
 */
public class Squarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Width? ");
        double szele = sc.nextDouble();
        System.out.print("length? ");
        double hossza = sc.nextDouble();
        
        System.out.println("area of the square: "+(szele*hossza));
        
        System.out.println("circumference of the square: "+(szele+hossza)*2);
        
        
        
        
    }
    
}
