package week1.day3;

import org.openqa.selenium.chrome.ChromeDriver;

public class StringDemo {

	public static void main(String[] args) {		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//1.Launch site
		driver.get("http://leaftaps.com/opentaps/control/main");
		//getting Title
		driver.getTitle();
		//Maximize the browser
		driver.manage().window().maximize();
		//2.Login
		//enter username
		driver.findElementById("username").sendKeys("DemoSalesManager");
		//enter password
		driver.findElementById("password").sendKeys("crmsfa");
		//click login
		driver.findElementByClassName("decorativeSubmit").click();
		//3.click on welcome demo sales manager
		String text = driver.findElementByTagName("h2").getText();
		System.out.println(text);
		String name = text.substring(13, text.length());
		System.out.println(name);
	}

}
