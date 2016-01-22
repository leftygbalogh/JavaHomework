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
        System.out.print("szele? ");
        double szele = sc.nextDouble();
        System.out.print("hossza? ");
        double hossza = sc.nextDouble();
        
        System.out.println("a teglalapod terulete: "+(szele*hossza));
        
        System.out.println("a teglalapod kerulete: "+(szele+hossza)*2);
        
        
        
        
    }
    
}
