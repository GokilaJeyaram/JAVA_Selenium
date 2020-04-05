package week1.day6;

public class ReverseWord {

	public static void main(String[] args) {
		String input = "I love Testing";
		String[] words = input.split(" ");
		String a = " ";
		
		for(int i = words.length-1; i>=0; i--)
		{
			a = a+words[i] + " ";
			
		}
		System.out.println(a);
	}

}
