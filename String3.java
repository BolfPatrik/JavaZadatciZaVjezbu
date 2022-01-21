package edunova;

public class Zadatak11 {
public static void main(String[] args) {
	String s = "Python Exercise";
	String s2 = "Python Exercises";
	String s3 = "se";
	Boolean kraj = s.endsWith(s3);
	System.out.println(kraj);
	Boolean kraj2 = s2.endsWith(s3);
	System.out.println(kraj2);
	
	String s4 = "Stephen Edwin King";
	String s5 = "Walter Winchell";
	String s6 = "Mike Royko";
	Boolean jednako = s4.equals(s4);
	System.out.println(jednako);
	Boolean jednako2 = s4.equals(s5);
	System.out.println(jednako2);
	Boolean jednako3 = s4.equals(s6);
	System.out.println(jednako3);
	
	String s7 = "Stephen Edwin King";
	String s8 = "Walter Winchell";
	String s9 = "stephen edwin king";
	Boolean jednako4 = s7.equalsIgnoreCase(s8);
	System.out.println(jednako4);
	Boolean jednako5 = s7.equalsIgnoreCase(s9);
	System.out.println(jednako5);
	
	String s10 = "This is a sample String";
	byte[] bit = s10.getBytes();
	String novibit = new String(bit);
	System.out.println(novibit);
	
	String s11 = "This is a sample String";
	char niz[] = new char[] {' ', ' ', ' ', ' ', ' ', ' ',' ', ' ', ' '};
	s11.getChars(4, 7, niz, 1);
	System.out.println(niz);
}
}