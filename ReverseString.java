package week1.day3;

public class ReverseString {
	
	public static void main(String[] args) {
		String input = "WELCOME";
		char[] charArray = input.toCharArray();
		//System.out.println(charArray[1]);
		int j = input.length();
		//System.out.println(j);
		String a = " ";
		for(int i=j-1;i>=0;i--)
		{
			a = a+(charArray[i]);
		}
		
System.out.println(a);
	}

}
