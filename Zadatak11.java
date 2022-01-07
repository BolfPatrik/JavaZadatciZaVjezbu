package edunova;
//Write a Java program that reads a number in inches, converts it to meters.
import javax.swing.JOptionPane;

public class Z08 {
public static void main(String[] args) {
	double x = Integer.parseInt(
			JOptionPane.showInputDialog("Unesi inče")
			);
	double m = x * 0.0254;
	System.out.println(m);
}
}
