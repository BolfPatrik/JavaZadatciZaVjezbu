package edunova;

public class Zadatak16 {
public static void main(String[] args) {
	String s = "Python Exercises.";
	System.out.println(s.hashCode());
	
	String s1 = "The quick brown fox jumps over the lazy dog.";
	int index = s1.indexOf("T", 0);
	System.out.println(s1.indexOf(index));
	
	String s2 = "Java exercises";
	System.out.println(s2.length());
	
	 String s3 = "Shanghai Houston Colorado Alexandria";
     String s4 = "Alexandria Colorado Houston Shanghai";
     boolean match1 = s3.regionMatches(0, s2, 28, 8);
     System.out.println(match1);
     boolean match2 = s4.regionMatches(9, s2, 9, 8);
     System.out.println(match2);
     
    String s5 = "The quick brown fox jumps over the lazy dog.";
 	System.out.println(s5);
 	String replace = s5.replace("d", "f");
 	System.out.println(replace);
}
}