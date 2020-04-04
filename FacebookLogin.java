package week1.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		//To disable notification
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		//seting system property
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		//setup chromedriver
		ChromeDriver driver = new ChromeDriver(options);
		
		//Launch site
		driver.get("https:facebook.com");
		//get tilte
		System.out.println(driver.getTitle());
		//get currenturl
		System.out.println(driver.getCurrentUrl());
		//Enter username
		driver.findElementById("email").sendKeys("gokiabu@gmail.com");
		//Enter password
		driver.findElementById("pass").sendKeys("India@2020");
		//click on login
		driver.findElementById("loginbutton").click();
		//click logout
		driver.findElementById("userNavigationLabel").click();
		Thread.sleep(2000);
		driver.findElementByPartialLinkText("Log Out").click();
	}

}
