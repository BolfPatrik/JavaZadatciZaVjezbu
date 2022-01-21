package edunova;

public class Zadatak21 {
public static void main(String[] args) {
	String s1 = "The quick brown fox jumps over the lazy dog.";
	System.out.println(s1);
	String replace = s1.replace("fox", "cat");
	System.out.println(replace);
	
	String s2 = "Red is favorite color. starts with Red?";
	String s3 = "Orange is also my favorite color. starts with Red?";
	Boolean start = s2.startsWith(s2);
	System.out.println(start);
	Boolean start1 = s2.startsWith(s3);
	System.out.println(start1);
	
	String s = "The quick brown fox jumps over the lazy dog. ";
	CharSequence Sequence = s.subSequence(10, 25);
	System.out.println(Sequence);
	
	String s4 = "Java Exercises.";
	char[] niz = s4.toCharArray();
	System.out.println(niz);
	
	String s5 = "The Quick BroWn FoX!";
	String lowerCase = s5.toLowerCase();
	System.out.println(lowerCase);
	
	String s6 = "The Quick BroWn FoX!";
	String UpperCase = s6.toUpperCase();
	System.out.println(UpperCase);
	
	String s8 = "     Java Exercises    ";
	String trim = s8.trim();
	System.out.println(trim);
}
}