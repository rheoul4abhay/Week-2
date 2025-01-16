import java.util.Scanner;

class PalindromeChecker{
	private String text;
	
	public PalindromeChecker(String text){
		this.text = text;
	}
	
	public boolean checkForPalindrome(String string){
		int start = 0;
		int end = string.length()-1;
		
		while(start < end){
			if(string.charAt(start) != string.charAt(end)) return false;
			start++;
			end--;
		}
		return true;
	}
	
	public void displayResults(){
		boolean result = checkForPalindrome(text);
		System.out.print("Text " + text + " is a palindrome ? " + result);
	}
	
}

public class PalindromeStatus{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a text -> ");
		String text = scanner.nextLine();
		
		PalindromeChecker obj1 = new PalindromeChecker(text);
		obj1.displayResults();
		scanner.close();
	}
}