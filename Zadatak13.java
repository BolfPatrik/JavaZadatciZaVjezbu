package edunova;

import javax.swing.JOptionPane;
/*Write a Java program to solve quadratic equations (use if, else if and else).

Test Data
Input a: 1
Input b: 5
Input c: 1
*/
public class Z19 {
public static void main(String[] args) {
	double a = Double.parseDouble(JOptionPane.showInputDialog("Unesi broj"));
	double b = Double.parseDouble(JOptionPane.showInputDialog("Unesi broj"));
	double c = Double.parseDouble(JOptionPane.showInputDialog("Unesi broj"));
	double korijen = (b*b) - (4*a*c);
	double x1 = (-b + Math.sqrt(korijen))/(2*a);
	double x2 = (-b - Math.sqrt(korijen))/(2*a);
	System.out.println(x1);
	System.out.println(x2);
}
}
