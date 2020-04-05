package week1.day6;

public class PalindromeNumber {

	public static void main(String[] args) {
		int number = 343;
		int sum=0,temp,a;
		
		temp = number;
		while (number>0){
			a=number%10;
			sum = (sum*10)+a;
			number = number/10;			
		}
		if(sum==temp)
		{
			System.out.println("The given number is palindrome: "+temp);
		}
		else {
			System.out.println("The given number is not palindrome: "+temp);
		}
		
		
		
	}

}
