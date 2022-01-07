package edunova;

import javax.swing.JOptionPane;
//Write a Java program to compute body mass index (BMI).
public class Z11 {
public static void main(String[] args) {
	Double x = Double.parseDouble(JOptionPane.showInputDialog("Unesi masu u kg"));
	Double y= Double.parseDouble(JOptionPane.showInputDialog("Unesi visinu u cm"));
	double bmi = (x / (y*y/10000));
	System.out.println(bmi);
	
}
}
