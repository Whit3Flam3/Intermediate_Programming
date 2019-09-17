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

public class test_scores_and_grade {
	
	public static void main(String[] args) {

		String input1, input2, input3;

		double scoreone, scoretwo, scorethree, avg;
		
		input1 = JOptionPane.showInputDialog(null, "Enter score 1:");
		input2 = JOptionPane.showInputDialog(null, "Enter score 2:");
		input3 = JOptionPane.showInputDialog(null, "Enter score 3:");
		
		scoreone = Double.parseDouble(input1);
		scoretwo = Double.parseDouble(input2);
		scorethree = Double.parseDouble(input3);
		
		avg = (scoreone + scoretwo + scorethree) / 3;

		if (avg <= 100){
			if(avg >= 90){
				JOptionPane.showMessageDialog(null, "Your average is " + avg + " or A");
			}
			else if(avg >= 80){
				JOptionPane.showMessageDialog(null, "Your average is " + avg + " or B");
			}
			else if(avg >= 70){
				JOptionPane.showMessageDialog(null, "Your average is " + avg + " or C");
			}
			else if(avg >= 60){
				JOptionPane.showMessageDialog(null, "Your average is " + avg + " or D");
			}
			else if(avg < 60) {
				JOptionPane.showMessageDialog(null, "Your average is " + avg + " or F");
			}
		}
		else
		{
			JOptionPane.showMessageDialog(null,  "Your average is out of bounds, check test scores.");
		}
	}
}
