/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dmosi
 */
import java.text.*;
import javax.swing.JOptionPane;

public class bank_charges {
   
    public static void main(String[] args) {

		double baseFee = 10;
		
		String input1 = JOptionPane.showInputDialog("Enter the number of checks written");
		
		int checks = Integer.parseInt(input1);
		
		double lessThanTwenty = .10*checks;
		double moreThanTwenty = .08*checks;
		double moreThanForty = .06*checks;
		double moreThanSixty = .04*checks;
		
		double lessTwentyTotal = .10*checks + baseFee;
		double twentyPlusTotal = .08*checks + baseFee;
		double fortyPlusTotal = .06*checks + baseFee;
		double sixtyPlusTotal = .04*checks + baseFee;
		
	    NumberFormat df = DecimalFormat.getInstance();
	    df.setMaximumFractionDigits(2);
	
		if (checks < 60)
			if (checks >= 40)
				JOptionPane.showMessageDialog(null, "Check (QTY): " + checks + "\nBase Fee: $" + baseFee + "\nCheck Fees: $" + df.format(moreThanForty) + "\nTotal Fees: $" + fortyPlusTotal);
			else if(checks >= 20)
				JOptionPane.showMessageDialog(null, "Check (QTY): " + checks + "\nBase Fee: $" + baseFee + "\nCheck Fees: $" + df.format(moreThanTwenty) + "\nTotal Fees: $" + twentyPlusTotal);
			else
				JOptionPane.showMessageDialog(null, "Check (QTY): " + checks + "\nBase Fee: $" + baseFee + "\nCheck Fees: $" + df.format(lessThanTwenty) + "\nTotal Fees: $" + lessTwentyTotal);
		else
			JOptionPane.showMessageDialog(null, "Check (QTY): " + checks + "\nBase Fee: $" + baseFee + "\nCheck Fees: $" + df.format(moreThanSixty) + "\nTotal Fees: $ " + sixtyPlusTotal);
	}

}
