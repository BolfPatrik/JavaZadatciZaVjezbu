package edunova;

public class Zadatak6 {
public static void main(String[] args) {
	String s = "PHP Exercises and ";                                                                                   
	String s1 = "Python Exercises" ;       
	String concat = s.concat(s1);
	System.out.println(concat);
	
	String s2 = "This is Exercise 1";
	String s3 = "This is exercise 1";
	int usporedba = s2.compareToIgnoreCase(s3);
	if(usporedba < 0) {
		System.out.println("Prvi string je manji od drugog");
	}
	else if (usporedba == 0) {
		System.out.println("Jednaki su");
	}
	
	else {
		System.out.println("Drugi string je manji od prvog");
	}	
	System.out.println("Vrijednost: " + usporedba);
	
	String s4 = "PHP Exercises and Python Exercises ";
	String s5 = "and";
	boolean vrijednosti = s4.contains(s5);
	System.out.println(vrijednosti);
	
	String s6 = "example.com";
	String s7 = "Example.com";
	boolean vrijednost = s6.contentEquals(s6);
	System.out.println(vrijednost);
	boolean vrijednost2 = s6.contentEquals(s7);
	System.out.println(vrijednost2);
	
	char niz[] = new char[] {'1','2','3','4'};
	
	 String s8 = String.copyValueOf(niz, 1, 3);
    System.out.println(s8);
}
}
