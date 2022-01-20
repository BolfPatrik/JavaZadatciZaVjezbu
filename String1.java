package edunova;


public class Zadatak1 {
public static void main(String[] args) {
String s = "Java exercises";
char PrvoVracanje = s.charAt(0);
char DrugoVracanje = s.charAt(10);
System.out.println("Na nultom mjestu je " + PrvoVracanje + " a na desetom " + DrugoVracanje);

String s1 = "w3resource.com";
int unicode = s1.codePointAt(1);
int unicode2 = s1.codePointAt(9);
System.out.println(unicode);
System.out.println(unicode2);

String s2 = "w3resource.com";
int unicode11 = s2.codePointBefore(1);
int unicode22 = s2.codePointBefore(9);
System.out.println(unicode11);
System.out.println(unicode22);

String s3 = "w3resource.com";
int unicodes = s3.codePointCount(1,14);
System.out.println(unicodes);

String s4 = "This is Exercise 1";
String s5 = "This is exercise 2";
int usporedba = s4.compareTo(s5);
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
}
}