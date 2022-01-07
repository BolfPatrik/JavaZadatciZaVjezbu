package edunova;
import javax.swing.JOptionPane;
/*Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive"
or "negative". 
Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.*/
public class Z20 {
public static void main(String[] args) {
	float x = Float.parseFloat(JOptionPane.showInputDialog("Unesi broj"));
	if(x==0) {
		System.out.println("Zero");
	}
	if(x>0) {
		System.out.println("Positive");
	}
	if(x<0) {
		System.out.println("Negative");
	}
	if(Math.abs(x)<1) {
		System.out.println("Small");
	}
	if(Math.abs(x)>10000) {
		System.out.println("Large");
	}
}
}
