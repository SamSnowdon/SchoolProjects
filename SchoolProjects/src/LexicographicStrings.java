import java.util.Scanner;

public class LexicographicStrings {

	public static Scanner s = new Scanner(System.in);
	public static String u1;
	public static int u2;
	
	public static void main (String[] args) {
		System.out.println("Please enter a sentence.");
		u1 = s.next();
		System.out.println("Please enter a number.");
		u2 = s.nextInt();
		System.out.println(SmallestString(u1, u2));
	}
	
	public static String SmallestString(String s, int i) {
		String result1 = "";
		String result2 = "";
		for (int o = 0; o < s.length()-i; o++) {
			String temp = s.substring(o, o+i);
			String temp2 = s.substring(o+1, o+i+1);
			if (temp.compareTo(temp2) < 0) {
				result1 = temp;
			}
			else {
				result1 = temp2;
			}
			System.out.println(temp + " " + temp2);
		}
		for (int o = 0; o < s.length()-i; o++) {
			String temp = s.substring(o, o+i);
			String temp2 = s.substring(o+1, o+i+1);
			if (o > 0) {
				temp2 = result2;
			}
			if (temp.compareTo(temp2) < 0) {
				result2 = temp2;
			}
			else {
				result2 = temp;
			}
		}
		return "Smallest: " + result1 + " Biggest: " + result2;
	}
}
