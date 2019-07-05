package com.selenium.XeroMayBatch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

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
public static void SignUP_XDC() throws InterruptedException {//captcha not working
		
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
		
		WebElement freetrial=driver.findElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"));
		freetrial.click();
		Thread.sleep(2000);
		
		WebElement firstname=driver.findElement(By.xpath("//input[@name='FirstName']"));
		firstname.sendKeys("Raj");
		
		WebElement lastname=driver.findElement(By.xpath("//input[@name='LastName']"));
		lastname.sendKeys("Kamal");
		
		WebElement email=driver.findElement(By.xpath("//input[@name='EmailAddress']"));
		email.sendKeys("RajKamal@gmail.com");
		Thread.sleep(3000);

		WebElement phoneNum=driver.findElement(By.xpath("//input[@name='PhoneNumber']"));
		phoneNum.sendKeys("5103456789");
		
		WebElement country=driver.findElement(By.xpath("//select[@name='LocationCode']"));
		Select selcountry=new Select(country);
		selcountry.selectByValue("CA");
		Thread.sleep(15000);
		
		WebElement reCaptcha=driver.findElement(By.xpath("//span[@class='g-recaptcha-submit']"));
		reCaptcha.click();
		Thread.sleep(5000);
					
		WebElement terms=driver.findElement(By.xpath("//input[@name='TermsAccepted']"));
		terms.click();
		Thread.sleep(40000);
		
		WebElement getstarted=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		getstarted.click();
		Thread.sleep(3000);
		System.out.println("Inbox page should be displayed.");
		
	}
	
	public static void SignUP_XDC_WrongEmail() throws InterruptedException {
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
		
		WebElement freetrial1=driver.findElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"));
		freetrial1.click();
		Thread.sleep(2000);
		
		WebElement getstarted1=driver.findElement(By.xpath("//span[@class='g-recaptcha-submit']"));
		getstarted1.click();
		Thread.sleep(3000);
		
		WebElement email1=driver.findElement(By.xpath("//input[@name='EmailAddress']"));
		email1.sendKeys("abcdfgmail@com");
		
		WebElement getstarted2=driver.findElement(By.xpath("//span[@class='g-recaptcha-submit']"));
		getstarted2.click();
		Thread.sleep(3000);
	}
	
	public static void SignUP_XDC_Terms_Policy() throws InterruptedException {
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
		WebElement freetrial2=driver.findElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"));
		freetrial2.click();
		Thread.sleep(2000);
		
		WebElement termslink=driver.findElement(By.xpath("//a[contains(text(),'terms of use')]"));
		termslink.click();
		System.out.println("A new Xero terms of use web page should open");
		Thread.sleep(2000);	
		
		Actions action= new Actions(driver);
		action.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys(Keys.TAB).build().perform();
		Thread.sleep(5000);
		
		WebElement privacypolicy=driver.findElement(By.xpath("//a[contains(text(),'privacy notice')]"));
		privacypolicy.click();
		System.out.println("A new Privacy policy web page should open");
		Thread.sleep(3000);
		
		driver.close();
		System.out.println("Test done");
	}
	
	public static void SignUP_XDC_OfferDetails() throws InterruptedException {
		
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
		
		WebElement freetrial3=driver.findElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"));
		freetrial3.click();
		Thread.sleep(2000);
		
		WebElement offerdetails=driver.findElement(By.xpath("//a[contains(text(),'offer details')]"));
		offerdetails.click();
		System.out.println("A new offer details web page should open");
		
	}
	
	public static void SignUP_XDC_AccountantLink() throws InterruptedException {
		
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
		
		WebElement freetrial4=driver.findElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"));
		freetrial4.click();
		Thread.sleep(2000);
		
		WebElement accountantlink=driver.findElement(By.xpath("//a[contains(text(),'accountant or bookkeeper')]"));
		accountantlink.click();
		System.out.println("A new Let's start a great partnership web page should open");
	}
	
	public static void Test_All_Tabs() throws InterruptedException {
		
		LoginToXero();
		
		WebElement dashboard=driver.findElement(By.xpath("//a[@class='xrh-focusable xrh-tab--body xrh-tab--body-is-selected']"));
		dashboard.click();
		System.out.println("Dashboard page displayed successfully");
		Thread.sleep(5000);
		
		WebElement accounting=driver.findElement(By.xpath("//button[contains(text(),'Accounting')]"));
		Actions action=new Actions(driver);
		action.moveToElement(accounting).click().build().perform();
		
		System.out.println("you are now in account drop down page");
		Thread.sleep(2000);
		
		WebElement reports=driver.findElement(By.xpath("//a[contains(text(),'Reports')]"));
		reports.click();
		Thread.sleep(2000);
		
		WebElement contacts=driver.findElement(By.xpath("//button[contains(text(),'Contacts')]"));
		contacts.click();
		System.out.println("You are now in Contacts page");
		
		WebElement Tekarch=driver.findElement(By.xpath("//div[@class='xrh-appbutton--body']"));
		Actions actcompany=new Actions(driver);
		actcompany.moveToElement(Tekarch).click().build().perform();
		Thread.sleep(3000);
		
		WebElement settings=driver.findElement(By.xpath("//a[contains(text(),'Settings')]"));
		settings.click();
		Thread.sleep(3000);
		
		WebElement plus=driver.findElement(By.xpath("//li[1]//button[1]//div[1]"));
		Actions actplus=new Actions(driver);
		actplus.moveToElement(plus).click().build().perform();
		Thread.sleep(4000);
		
		WebElement Tekarch1=driver.findElement(By.xpath("//div[@class='xrh-appbutton--body']"));
		Actions actcompany1=new Actions(driver);
		actcompany1.moveToElement(Tekarch1).click().build().perform();
		Thread.sleep(3000);
		WebElement files=driver.findElement(By.xpath("//a[contains(text(),'Files')]"));
		files.click();
		
		WebElement notification=driver.findElement(By.xpath("//li[3]//button[1]//div[1]"));
		notification.click();
		Thread.sleep(2000);
		
		WebElement search=driver.findElement(By.xpath("//li[@class='xrh-addon xrh-addon-alwaysvisible']//div[@class='xrh-focusable--child xrh-iconwrapper']"));
		search.click();
		Thread.sleep(3000);
		
		WebElement help=driver.findElement(By.xpath("//li[4]//button[1]//div[1]"));
		help.click();
		Thread.sleep(3000);
		System.out.println("Help field page displayed successfully");
		
	}
	
	public static void Test_Logout() throws InterruptedException {
		
		LoginToXero();
		
		WebElement UserMenu=driver.findElement(By.xpath("//abbr[@class='xrh-avatar xrh-avatar-color-5']"));
		Actions actuser=new Actions(driver);
		actuser.moveToElement(UserMenu).click().build().perform();
		Thread.sleep(5000);
		
		WebElement Logout=driver.findElement(By.xpath("//a[@class='xrh-verticalmenuitem--body'][contains(text(),'Log out')]"));
		Logout.click();
		System.out.println("Application logged out successfully");
		
	}
	
	public static void Test_Upload_Profile_Image() throws InterruptedException {
		
		LoginToXero();
		
		WebElement UserMenu=driver.findElement(By.xpath("//abbr[@class='xrh-avatar xrh-avatar-color-5']"));
		Actions actuser=new Actions(driver);
		actuser.moveToElement(UserMenu).click().build().perform();
		Thread.sleep(5000);
		
		WebElement username=driver.findElement(By.xpath("//h4[@class='xrh-verticalmenuitem--heading']"));
		username.click();
		Thread.sleep(2000);
		
		WebElement upload=driver.findElement(By.xpath("//div[@id='button-1041']"));
		upload.click();
		Thread.sleep(7000);
		
		driver.findElement(By.xpath("//input[@id='filefield-1174-button-fileInputEl']")).sendKeys("C:\\Users\\Venkat\\Pictures\\bird.jpg");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='button-1178-btnInnerEl']")).click();
		
		Thread.sleep(5000);
		
		WebElement saveimage=driver.findElement(By.xpath("//div[@id='button-1164']"));
		saveimage.click();
		Thread.sleep(2000);
		System.out.println("Picture uploaded successfully");
	}
}
