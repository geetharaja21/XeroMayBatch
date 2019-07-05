package com.selenium.XeroMayBatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateXero {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//LoginToXero();
		//Incorrect_Password();
		Incorrect_Email();
		//Forgot_Password();
		//SignUP_XDC();
		//SignUP_XDC_WrongEmail();
		//SignUP_XDC_Terms_Policy();
		//SignUP_XDC_OfferDetails();
		//SignUP_XDC_AccountantLink();
		//Test_All_Tabs();
		//Test_Logout();
		//Test_Upload_Profile_Image();
		//Add_Organization_TrailVersion();
		//Add_Organization_PaidVersion();
		//Add_Organization_Starterplan();
		//Add_Organization_Standardplan();
		//Add_Organization_Premiumplan();
		//Add_Organization_Current_Quickbooks();
		//Look_Subscription_Billing();
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
	public static void Incorrect_Password() throws InterruptedException {
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
		
		WebElement LoginTab1=driver.findElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"));
		LoginTab1.click();
		
		//Get Username
		WebElement useremail1=driver.findElement(By.xpath("//input[@id='email']"));
		useremail1.sendKeys("p.r.geetha@gmail.com");
		System.out.println("Enter username passed successfully");
		
		WebElement passWord1=driver.findElement(By.xpath("//input[@id='password']"));
		passWord1.sendKeys("asdfgh");
		System.out.println("Password entered successfully");
		Thread.sleep(2000);
		
		//Click Login button
		WebElement loginButton1=driver.findElement(By.xpath("//button[@id='submitButton']"));
		loginButton1.click();
		System.out.println("Your Email or Password is incorrect should be displayed");
	}
	
	public static void Incorrect_Email() throws InterruptedException {
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
		
		WebElement LoginTab2=driver.findElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"));
		LoginTab2.click();
		
		//Get Username
		WebElement useremail2=driver.findElement(By.xpath("//input[@id='email']"));
		useremail2.sendKeys("abcd@gmail.com");
		System.out.println("Enter username passed successfully");
		
		WebElement passWord2=driver.findElement(By.xpath("//input[@id='password']"));
		passWord2.sendKeys("Metropcs21");
		System.out.println("Password entered successfully");
		Thread.sleep(2000);
		
		//Click Login button
		WebElement loginButton2=driver.findElement(By.xpath("//button[@id='submitButton']"));
		loginButton2.click();
		System.out.println("Your Email or Password is incorrect should be displayed");
	}
	
	public static void Forgot_Password() throws InterruptedException {
		
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
		
		WebElement LoginTab3=driver.findElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"));
		LoginTab3.click();
		Thread.sleep(2000);
				
		WebElement forgotpwd=driver.findElement(By.xpath("//a[@class='forgot-password-advert']"));
		forgotpwd.click();
		
		WebElement useremail3=driver.findElement(By.xpath("//input[@id='UserName']"));
		useremail3.sendKeys("p.r.geetha@gmail.com");
		System.out.println("Enter username passed successfully");
		Thread.sleep(3000);
		
		WebElement sendlink=driver.findElement(By.xpath("//span[@class='text']"));
		sendlink.click();
		System.out.println("A link to reset your password has been sent to:An email");
	}
	
}
