package week1.day1;
//class first letter should be in caps letter
public class Android {

	//variable & keywords should be in lower class except String because its a class
	String OS = "Kitkat";
	float emi = 9.777f;
	boolean update = true;
	long model = 78123812;
	int releaseyear = 2016;
	
	     public static void main(String[] args) {
	   //call these variable from the main method 
	    //syntax: classname referencename = new classname
	    	 //referencename should be in lowercase
	    	 
	    	 Android phone = new Android();
	    	 
	   //call the variable of the class
	    	 //syntax: referencename.variable
	    	 
	    	 String OS2 = phone.OS;
	    	 float emi2 = phone.emi;
	    	 boolean update2 = phone.update;
	    	 long model2 = phone.model;
	    	 int releaseyear2 = phone.releaseyear;
	    	 
	    	System.out.println("Android version:" + " "+OS2);
	    	System.out.println("Android emi2:" + " " +emi2);
	    	System.out.println("Android update details:" +  update2);
	    	System.out.println("Android Model:" +  model2);
	    	System.out.println("Android Release year:" +  releaseyear2);
	    	
	}

	
}
