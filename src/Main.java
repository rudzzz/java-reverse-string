import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Say a sentence: ");
		String string = scanner.nextLine(); 
		
		System.out.println(reverse(string));
		
		scanner.close();
	}
	
	public static String reverse(String string) {
		char[] characters = new char[string.length()];
		
		int index = 0;
		
		for(int i = string.length() - 1; i >= 0; i--) {
			characters[index] = string.charAt(i);
			index ++;
		}
		
		String reverseString = "";
		
		for(int i = 0; i < string.length(); i++) {
			reverseString = reverseString + characters[i];
		}
		return reverseString;
	}

}
