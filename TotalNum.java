package test5;
import java.util.Scanner;
public class TotalNum {

	public static void main(String[] args) {
		Scanner nameScanner = new Scanner(System.in);
		System.out.println("Please enter the String");
		String name = nameScanner.nextLine();
		char[] ch = name.toCharArray();
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			if (ch[i] != ' ') {
				count++;
			}
		}
		

			System.out.print("Total number of characters in the given String is : " +count);
		
		nameScanner.close();
	}
}