package week1.day6;

public class Palindrome {

	public static void main(String[] args) {
		String input = "MADAM";
		int a = input.length();
		System.out.println(a);
		String b = "";
		
		for(int i=a-1;i>=0;i--)
		{
			b = b+input.charAt(i);
		}	
	System.out.println(b);
		if(input.equals(b))
		{
			System.out.println("The given string is palindrome: "+ input);
		}
		else {
			System.out.println("The given string is not a palindrome:" + input);
		}
		

	}

}
