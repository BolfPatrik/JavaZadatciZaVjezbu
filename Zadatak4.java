package edunova;

import javax.swing.JOptionPane;

public class Z04 {

public static void main(String[] args) {
	//Write a Java program to convert seconds to hour, minute and seconds.
	int x = Integer.parseInt(
			JOptionPane.showInputDialog("Unesi broj")
			);
int sati = x / 60;
int minute = sati % 60;
int sekunde = x % 60;
sati = sati / 60;
System.out.println(sati + ":" + minute + ":" + sekunde);
}
}
