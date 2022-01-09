package edunova;

import javax.swing.JOptionPane;
//Write a program in Java to print the Floyd's Triangle
public class Z43 {
public static void main(String[] args) {	 
	int x = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
	 int broj = 1;
	   for (int i=1;i<=x;i++){
	   for (int j=1;j<=i;j++){
	       System.out.print(broj + " ");
	       broj++;
	     }
	     System.out.println();
	    }
	     }
	  }