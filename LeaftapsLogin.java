package week1.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class LeaftapsLogin {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		
		//1.Launch site
		driver.get("http://leaftaps.com/opentaps/control/main");
		//getting Title
		System.out.println(driver.getTitle());
		//Maximize the browser
		driver.manage().window().maximize();
		//2.login
		//Entering the username
		driver.findElementById("username").sendKeys("DemoSalesManager");
		//Entering password
		driver.findElementById("password").sendKeys("crmsfa");
		//click login
		driver.findElementByClassName("decorativeSubmit").click();
		//3.click on CRM/SFA
		driver.findElementByLinkText("CRM/SFA").click();
		//4.click on create lead
		driver.findElementByLinkText("Create Lead").click();
		//5.Enter Mandatory fields
		driver.findElementById("createLeadForm_companyName").sendKeys("LTI");
		driver.findElementById("createLeadForm_firstName").sendKeys("Parani");
		driver.findElementById("createLeadForm_lastName").sendKeys("J");		
		//6.click on create lead
		driver.findElementByClassName("smallSubmit").click();
		//7.verifying Lead
		System.out.println(driver.getTitle());		
		//8.Close the browser
		driver.close();
		
		
		
		
		
	}

}
