package week1.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class FBLogin {

	public static void main(String[] args) throws InterruptedException {
		// set system property: keys should be in small
	System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		//setup chromedriver
		ChromeDriver driver = new ChromeDriver();
		//get url
		driver.get("https://facebook.com");
		//get tile
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		//get full url
		System.out.println(driver.getCurrentUrl());
		//refresh method 
		driver.navigate().refresh();
		//close method
		driver.close();
	}

}
