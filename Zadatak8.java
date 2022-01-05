package edunova;

import javax.swing.JOptionPane;
/*Write a Java program start with an integer n, divide n by 2 if n is even 
or multiply by 3 and add 1 if n is odd, repeat the process until n = 1.*/
public class Zadatak9 {
public static void main(String[] args) {
int x = Integer.parseInt(
		JOptionPane.showInputDialog("Unesi broj")
		);
while(x!=1){
if(x%2==0) {
	x=x/2;
}
else if(x%2!=0) {
	x=x*3+1;
}
}
System.out.println(x);
}
}