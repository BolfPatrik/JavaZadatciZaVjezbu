package edunova;

import javax.swing.JOptionPane;

public class Z03 {
	//Izračunaj sumu znamenaka unesenog broja
	public static void main(String[] args) {
	int x = Integer.parseInt(
			JOptionPane.showInputDialog("Unesi broj")
			);
	int suma=0;
	while(x!=0) {
		 suma+=x%10;
		 x/=10;
	}
	System.out.println(suma);
	}
	}
