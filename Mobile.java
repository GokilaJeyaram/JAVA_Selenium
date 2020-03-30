package week1.day1;

public class Mobile {
	boolean own = true;
	int modelnumber = 6789;
	String brand = "Samsung";
	
public static void main(String[] args) {
	Mobile mob = new Mobile();
	boolean own2 = mob.own;
	int modelnumber2 = mob.modelnumber;
	String brand2 = mob.brand;
System.out.println(own2);
System.out.println(modelnumber2);
System.out.println(brand2);
}
}
