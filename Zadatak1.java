package edunova;

import javax.swing.JOptionPane;

public class Z01 {
public static void main(String[] args) {
	//Write a Java program that takes a number as input and prints its multiplication table up to 10
	int x = Integer.parseInt(
			JOptionPane.showInputDialog("Upiši broj za tablicu množenja")
			);
for(int i=1;i<=10;i++) {
	System.out.println(x + " x " + i + " = " + (x*i));
	}
}
}
