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

public class paint_job_estimator {
    
    public static void main(String[] args) {
        System.out.println("Please enter the amount of rooms to be painted");
        Scanner keyboard = new Scanner(System.in);
        double numberOfRooms = keyboard.nextDouble();
        System.out.println("The number of rooms to be painted is " + numberOfRooms);

        System.out.println("Please enter the total square feet of wall space to be painted");
        double totalWallSpace = keyboard.nextDouble();
        System.out.println("The total square feet to be painted is " + totalWallSpace);

        System.out.println("Please enter price paid per gallon of paint");
        double pricePerGallon = keyboard.nextDouble();
        System.out.println("The price per gallon of paint is $" + pricePerGallon);

        System.out.println("-----------------------------------------------------------------------");

        System.out.println("Total gallons required is " + calculateNumberOfGallonsRequired(totalWallSpace) + " gallons of paint");

        System.out.println("Total hours of labor required is " + calculateTotalHoursOfLabor(totalWallSpace) + " hours");

        System.out.println("Cost of paint in total is $" + calculateCostOfPaint(totalWallSpace, pricePerGallon));

        System.out.println("Total labor charges are $" + calculateTotalLaborCharges(totalWallSpace));

        System.out.println("Total cost of paint job is $" + calculateTotalCost(totalWallSpace, pricePerGallon));
    }

    public static double calculateNumberOfGallonsRequired(double totalWallSpace) {
        double gallonsRequired = (totalWallSpace / 115);
        return (int) gallonsRequired;
    }

    public static double calculateTotalHoursOfLabor(double totalWallSpace) {
        double hoursOfLaborRequired = (totalWallSpace / 115) * 8;
        return (int) hoursOfLaborRequired;
    }

    public static double calculateCostOfPaint(double totalWallSpace, double pricePerGallon) {
        double costOfPaint = ((totalWallSpace / 115) * pricePerGallon);
        return (int) costOfPaint;
    }

    public static double calculateTotalLaborCharges(double totalWallSpace) {
        double hoursOfLaborRequired = (totalWallSpace / 115) * 8;
        double totalLaborCharges = hoursOfLaborRequired * 18;
        return (int) totalLaborCharges;
    }

    public static double calculateTotalCost(double totalWallSpace, double pricePerGallon) {
        double costOfPaint = ((totalWallSpace / 115) * pricePerGallon);
        double hoursOfLaborRequired = (totalWallSpace / 115) * 8;
        double totalLaborCharges = hoursOfLaborRequired * 18;
        double totalCost = costOfPaint + totalLaborCharges;
        return (int) totalCost;
    }
}
    
