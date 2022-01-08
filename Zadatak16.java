package edunova;

import javax.swing.JOptionPane;

public class Z29 {
public static void main(String[] args) {
	int x = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
	for(int i=1;i<=x;i++) {
	for(int j=1;j<=i;j++) 
		System.out.print(j);
	System.out.println("");
	}
}
}