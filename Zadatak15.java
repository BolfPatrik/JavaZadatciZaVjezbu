import javax.swing.JOptionPane;

public class Z21 {
public static void main(String[] args) {
	int x = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
	switch(x) {
	case 1:
		System.out.println("Monday");
		break;
	case 2:
		System.out.println("Tue");
		break;
	case 3:
		System.out.println("We");
		break;
	case 4:
		System.out.println("Thu");
		break;
	case 5:
		System.out.println("Fri");
		break;
	case 6:
		System.out.println("Sat");
		break;
	case 7:
		System.out.println("Sunday");
		break;
	}
}
}
