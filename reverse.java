package programs;

import java.util.Scanner;

public class StringRevWithPositionCase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String[] arr1 = str.split(" ");
		String[] arr2 = new String[arr1.length];
		String[] temp = new String[arr1.length];
		String s = "";
		for (int i = 0; i < arr1.length; i++) {
			temp[i] = "";
			StringBuffer buf = new StringBuffer(arr1[i]);
			arr2[i] = buf.reverse().toString();
			char[] c = new char[arr2[i].length()];
			for (int j = 0; j < arr1[i].length(); j++) {
				if (Character.isUpperCase(arr1[i].charAt(j))) {
					c[j] = Character.toUpperCase(arr2[i].charAt(j));
				} else if (Character.isLowerCase(arr1[i].charAt(j))) {
					c[j] = Character.toLowerCase(arr2[i].charAt(j));
				}
				temp[i] += c[j];
			}
			s += temp[i] + " ";
		}
		System.out.println(s);
		scanner.close();
	}
}
