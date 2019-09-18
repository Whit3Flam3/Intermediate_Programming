/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dmosi
 */
import javax.swing.JOptionPane;

public class sum_of_numbers {
    
    public static void main(String[] args) {
		int num;

		String input1 = JOptionPane.showInputDialog("Enter a positive nonzero integer");
		
		num = Integer.parseInt(input1);
		
		int sum = 0;
		
		while(num >= 1){
			sum += num;
			num--;
		}
		JOptionPane.showMessageDialog(null, "Sum: " + sum);
		
	}
}
