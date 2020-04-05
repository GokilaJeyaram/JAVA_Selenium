package week1.day6;

public class SumNumber {

	public static void main(String[] args) {
		int number=234;
		int n,sum = 0;
		while(number > 0)
		{
			n = number % 10;
			sum = sum + n;
			number = number/10;
		}
		System.out.println("Sum of the given digits is: " +sum);
	}

}
