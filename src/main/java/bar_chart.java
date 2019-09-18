/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dmosi
 */
import java.util.*;

public class bar_chart {
    
    public static void main(String[] args) {

		// Create Scanner object
		Scanner input = new Scanner(System.in);
		
		// Store sales
		
		int sales = 0;
		
		System.out.print("Enter today's sales for store 1: ");
		int sales1 = input.nextInt();
		
		System.out.print("Enter today's sales for store 2: ");
		int sales2 = input.nextInt();
		
		System.out.print("Enter today's sales for store 3: ");
		int sales3 = input.nextInt();
		
		System.out.print("Enter today's sales for store 4: ");
		int sales4 = input.nextInt();
		
		System.out.print("Enter today's sales for store 5: ");
		int sales5 = input.nextInt();
		
		System.out.println("");
		
		System.out.println("SALES BAR CHART");
		for(int k = 1; k <= 5; k++){
			System.out.print("Store " + k + ": ");
			switch(k){
			case 1:
				sales = sales1;
				break;
			case 2:
				sales = sales2;
				break;
			case 3:
				sales = sales3;
				break;
			case 4: 
				sales = sales4;
				break;
			case 5:
				sales = sales5;
			}
			for(int l=1; l<=sales/100; l++){
				System.out.print("*");
				
			}
			System.out.println("");
		}
		
	}
}
