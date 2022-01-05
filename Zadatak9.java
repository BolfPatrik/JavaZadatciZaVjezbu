package edunova;

import javax.swing.JOptionPane;

public class Zadatak10 {
public static void main(String[] args) {
	//Write a Java program to check whether an given integer is a power of 4 or not.
	int x = Integer.parseInt(
			JOptionPane.showInputDialog("Unesi broj")
			);
	int y = 4;
	if(x<4) {
		System.out.println("Broj nije \"power\" od 4");
	}
	for(int i=1;i<=10;i++) {
	 if(x == Math.pow(y, i)) {
		System.out.println("Broj je \"power\" od 4");
	}
	}
	}
}

