package week1.day1;

public class Newcar {
	
	String regnumber = "TN381309";
	//S should be caps
	//"" should be there for value
	//variable should be in lower class
	// semicolon should be there
	
	short age = 6;
	float aged = 2.5f;
	double carage = 2.345355;
	//age of the car
	//keywords should be lower case
	
	boolean ispuncture = true;
	//Punctured car or not
	// value of boolean should not be in quotes
	
	char brand = 'F';
	//logo of the car
	// char should be in single quotes
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enjoy Riding");
	//call these variable from the main method
		
		//syntax
		// 1. create a reference for the class
		//2. className nick = new ClassName();
	Newcar car = new Newcar();
	// car is a reference name should be in lower case
	
	// how do i call the variable of the class
	//syntax
	//reference name(nick.variablename;)
    char brand2 = car.brand;
    short age2 = car.age;
    String regnumber2 = car.regnumber;
    String regnumber3 = car.regnumber;
    
    System.out.println(regnumber2);
	System.out.println(brand2);
	System.out.println(regnumber3);
	System.out.println(age2);
	}

}
