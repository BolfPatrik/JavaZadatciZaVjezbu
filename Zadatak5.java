package edunova;

import javax.swing.JOptionPane;

public class Z05 {
public static void main(String[] args) {
	//Write a Java program to accepts an integer and count the factors of the number
	int x = Integer.parseInt(
			JOptionPane.showInputDialog("Unesi broj")
			);
	int brojac = 0;
	for(int i=1;i<=(int)Math.sqrt(x);i++) {
		if(x%i==0 && i*i!=x) {
		  brojac +=2;
		}
	if(i*i==x){
			brojac++;
		}
	}
	System.out.println("Broj " + x + " ima " + brojac + " višekratnika");
}
}
