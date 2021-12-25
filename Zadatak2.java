package edunova;

import javax.swing.JOptionPane;

public class Z02 {
public static void main(String[] args) {
	//Write a Java program that takes three numbers as input to calculate and print the average of the numbers
	double x = Double.parseDouble(
			JOptionPane.showInputDialog("Unesi prvi broj")
			);
	double y = Double.parseDouble(
			JOptionPane.showInputDialog("Unesi drugi broj")
			);
	double z = Double.parseDouble(
			JOptionPane.showInputDialog("Unesi treći broj")
			);
	double arit=0;
	arit = (x+y+z) / 3;
	System.out.println(arit);
}
}
