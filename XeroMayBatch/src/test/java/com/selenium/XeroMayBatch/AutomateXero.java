package com.selenium.XeroMayBatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateXero {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		LoginToXero();

	}
	public static void LoginToXero() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkat\\drivers\\chromedriver.exe");

		//Initialize browser
		driver=new ChromeDriver();

		//Open SalesForce
		driver.get("https://www.xero.com/us/");

		//Maximize browser
		driver.manage().window().maximize();
		System.out.println("Application launched successfully");

		//delete all cookies
		driver.manage().deleteAllCookies();

		WebElement LoginTab=driver.findElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"));
		LoginTab.click();

		//Get Username
		WebElement useremail=driver.findElement(By.xpath("//input[@id='email']"));
		useremail.sendKeys("p.r.geetha@gmail.com");
		System.out.println("Enter username passed successfully");

		//Enter password
		WebElement passWord=driver.findElement(By.xpath("//input[@id='password']"));
		passWord.sendKeys("Metropcs21");
		System.out.println("Password entered successfully");
		Thread.sleep(2000);

		//Click Login button
		WebElement loginButton=driver.findElement(By.xpath("//button[@id='submitButton']"));
		loginButton.click();
		System.out.println("User's Home Page displayed successfully");
	}
}
