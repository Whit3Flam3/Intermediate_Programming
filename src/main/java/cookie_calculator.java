/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dmosi
 */
import java.util.Scanner;

public class cookie_calculator {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Cookies you've consumed: ");
        
        int cookies = sc.nextInt();
        
        int servingSize = 40/10;
        int cookieCalories = 300/servingSize;
        int totalCal = cookies * cookieCalories;
        
        System.out.println("You consumed a total of " + totalCal + " calories from " + cookies + " cookies.");
    }   
}
