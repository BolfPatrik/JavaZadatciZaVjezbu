package edunova;

import javax.swing.JOptionPane;
//Write a Java program to convert temperature from Fahrenheit to Celsius degree
public class Z07 {
public static void main(String[] args) {
	double x = Integer.parseInt(
			JOptionPane.showInputDialog("Unesi Fahrenheite")
			);
	double  c =(( 5 *(x - 32.0)) / 9.0);
	System.out.println(c);
}
}
