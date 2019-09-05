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

public class sales_tax {
    
    public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    
    System.out.println("Your purchase amount was: ");
    
    float priceAmount = in.nextFloat();
    
    float countyTax = .02F;
    float stateTax = .04F;
    
    float countyTaxPrice = (priceAmount * countyTax);
    float stateTaxPrice = (priceAmount * stateTax);
    float totalTax = (countyTaxPrice + stateTaxPrice);
    float totalSale = (totalTax + priceAmount);
    
    System.out.println("County tax amount: $" + (System.out.printf("%.2f", countyTaxPrice)) + "\n" + "State tax amount: $" + (System.out.printf("%.2f", stateTaxPrice)) + "\n" + "Total tax amount: $" + (System.out.printf("%.2f", totalTax)) + "\n" + "Total sale amount: $" + (System.out.printf("%.2f", totalSale)));
    
    }
}
