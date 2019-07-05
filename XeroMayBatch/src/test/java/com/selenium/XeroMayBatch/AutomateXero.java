package com.selenium.XeroMayBatch;

import java.util.concurrent.TimeUnit;

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
public static void Add_Organization_TrailVersion() throws InterruptedException {
		
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
		
		WebElement LoginTab4=driver.findElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"));
		LoginTab4.click();
		
		//Get Username
		WebElement useremail3=driver.findElement(By.xpath("//input[@id='email']"));
		useremail3.sendKeys("gopala.anumanchipalli@gmail.com");
		System.out.println("Enter username passed successfully");

		WebElement passWord3=driver.findElement(By.xpath("//input[@id='password']"));
		passWord3.sendKeys("password12");
		System.out.println("Password entered successfully");
		Thread.sleep(2000);
		
		WebElement loginButton3=driver.findElement(By.xpath("//button[@id='submitButton']"));
		loginButton3.click();
		System.out.println("Dashboard should be displayed");
		
		WebElement self=driver.findElement(By.xpath("//span[@class='xrh-appbutton--text']"));
		Actions actcompany1=new Actions(driver);
		actcompany1.moveToElement(self).click().build().perform();
		Thread.sleep(3000);
		WebElement myzero=driver.findElement(By.xpath("//a[contains(text(),'My Xero')]"));
		myzero.click();
		Thread.sleep(7000);
		
		String primaryWindow=driver.getWindowHandle();
		System.out.println("Primary Window: "+primaryWindow);
		for(String handle:driver.getWindowHandles()){
			System.out.println("No of Handles: "+handle);
			driver.switchTo().window(handle);
		}
		
		WebElement addorg=driver.findElement(By.id("ext-gen1043"));
		addorg.click();
		
		WebElement name=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		name.sendKeys("self");
		Thread.sleep(3000);
		
		WebElement paytax=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/div[1]"));
		Actions actpay=new Actions(driver);
		actpay.moveToElement(paytax).click().build().perform();
		Thread.sleep(3000);
		
		WebElement paytaxname=driver.findElement(By.xpath("//li[@id='CNTRY/US']"));
		paytaxname.click();
		Thread.sleep(7000);
		
		WebElement timezone=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/div[1]"));
		Actions acttime=new Actions(driver);
		acttime.moveToElement(timezone).click().build().perform();
		Thread.sleep(5000);
		
		WebElement pst=driver.findElement(By.xpath("//span[contains(text(),'(UTC-08:00) Pacific Time (US & Canada)')]"));
		pst.click();
		Thread.sleep(5000);
		Thread.sleep(2000);
		
		WebElement orgdoes=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]"));
		orgdoes.sendKeys("acc");
		Thread.sleep(3000);
		
		WebElement accounting=driver.findElement(By.xpath("//span[contains(text(),'ounting & Bookkeeping Services')]"));
		accounting.click();
		Thread.sleep(2000);
		
		WebElement starttrial=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[8]/div[1]/button[1]"));
		starttrial.click();
		Thread.sleep(5000);
		System.out.println("Ready to go success message displayed");
		
	}
	
	public static void Add_Organization_PaidVersion() throws InterruptedException {
		
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
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement LoginTab5=driver.findElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"));
		LoginTab5.click();
		
		//Get Username
		WebElement useremail4=driver.findElement(By.xpath("//input[@id='email']"));
		useremail4.sendKeys("gopala.anumanchipalli@gmail.com");
		System.out.println("Enter username passed successfully");

		WebElement passWord4=driver.findElement(By.xpath("//input[@id='password']"));
		passWord4.sendKeys("password12");
		System.out.println("Password entered successfully");
		Thread.sleep(2000);
		
		WebElement loginButton4=driver.findElement(By.xpath("//button[@id='submitButton']"));
		loginButton4.click();
		System.out.println("Dashboard should be displayed");
		
		WebElement self1=driver.findElement(By.xpath("//span[@class='xrh-appbutton--text']"));
		Actions actcompany1=new Actions(driver);
		actcompany1.moveToElement(self1).click().build().perform();
		Thread.sleep(3000);
		WebElement myzero1=driver.findElement(By.xpath("//a[contains(text(),'My Xero')]"));
		myzero1.click();
		Thread.sleep(7000);
		
		String primaryWindow1=driver.getWindowHandle();
		System.out.println("Primary Window: "+primaryWindow1);
		for(String handle:driver.getWindowHandles()){
			System.out.println("No of Handles: "+handle);
			driver.switchTo().window(handle);
		}
		
		WebElement addorg=driver.findElement(By.id("ext-gen1043"));
		addorg.click();
		
		WebElement name=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		name.sendKeys("self");
		Thread.sleep(3000);
		
		WebElement paytax=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/div[1]"));
		Actions actpay=new Actions(driver);
		actpay.moveToElement(paytax).click().build().perform();
		Thread.sleep(3000);
		
		WebElement paytaxname=driver.findElement(By.xpath("//li[@id='CNTRY/US']"));
		paytaxname.click();
		Thread.sleep(7000);
		
		WebElement timezone=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/div[1]"));
		Actions acttime=new Actions(driver);
		acttime.moveToElement(timezone).click().build().perform();
		Thread.sleep(5000);
		
		WebElement pst=driver.findElement(By.xpath("//span[contains(text(),'(UTC-08:00) Pacific Time (US & Canada)')]"));
		pst.click();
		Thread.sleep(5000);
		Thread.sleep(2000);
		
		WebElement orgdoes=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]"));
		orgdoes.sendKeys("acc");
		Thread.sleep(3000);
		
		WebElement accounting=driver.findElement(By.xpath("//span[contains(text(),'ounting & Bookkeeping Services')]"));
		accounting.click();
		Thread.sleep(2000);
		
		WebElement buynow=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[8]/div[1]/button[2]"));
		buynow.click();
		Thread.sleep(4000);
		System.out.println("Should be able to navigate to \"Purchase Plan\" Subscription and Billing page");
	}
	
	public static void Add_Organization_Starterplan() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkat\\drivers\\chromedriver.exe");
		
		//Initialize browser
		driver=new ChromeDriver();
		
		//Open SalesForce
		driver.get("https://www.xero.com/us/");
		
		//Maximize browser
		driver.manage().window().maximize();
		System.out.println("Application launched successfully");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//delete all cookies
		driver.manage().deleteAllCookies();
		
		WebElement LoginTab6=driver.findElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"));
		LoginTab6.click();
		
		//Get Username
		WebElement useremail5=driver.findElement(By.xpath("//input[@id='email']"));
		useremail5.sendKeys("gopala.anumanchipalli@gmail.com");
		System.out.println("Enter username passed successfully");

		WebElement passWord5=driver.findElement(By.xpath("//input[@id='password']"));
		passWord5.sendKeys("password12");
		System.out.println("Password entered successfully");
		Thread.sleep(2000);
		
		WebElement loginButton5=driver.findElement(By.xpath("//button[@id='submitButton']"));
		loginButton5.click();
		System.out.println("Dashboard should be displayed");
		
		WebElement self2=driver.findElement(By.xpath("//span[@class='xrh-appbutton--text']"));
		Actions actcompany1=new Actions(driver);
		actcompany1.moveToElement(self2).click().build().perform();
		Thread.sleep(3000);
		WebElement myzero2=driver.findElement(By.xpath("//a[contains(text(),'My Xero')]"));
		myzero2.click();
		Thread.sleep(7000);
		
		String primaryWindow2=driver.getWindowHandle();
		System.out.println("Primary Window: "+primaryWindow2);
		for(String handle:driver.getWindowHandles()){
			System.out.println("No of Handles: "+handle);
			driver.switchTo().window(handle);
		}
		
		WebElement addorg=driver.findElement(By.id("ext-gen1043"));
		addorg.click();
		
		WebElement name=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		name.sendKeys("self");
		Thread.sleep(3000);
		
		WebElement paytax=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/div[1]"));
		Actions actpay=new Actions(driver);
		actpay.moveToElement(paytax).click().build().perform();
		Thread.sleep(3000);
		
		WebElement paytaxname=driver.findElement(By.xpath("//li[@id='CNTRY/US']"));
		paytaxname.click();
		Thread.sleep(7000);
		
		WebElement timezone=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/div[1]"));
		Actions acttime=new Actions(driver);
		acttime.moveToElement(timezone).click().build().perform();
		Thread.sleep(5000);
		
		WebElement pst=driver.findElement(By.xpath("//span[contains(text(),'(UTC-08:00) Pacific Time (US & Canada)')]"));
		pst.click();
		Thread.sleep(5000);
		Thread.sleep(2000);
		
		WebElement orgdoes=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]"));
		orgdoes.sendKeys("acc");
		Thread.sleep(3000);
		
		WebElement accounting=driver.findElement(By.xpath("//span[contains(text(),'ounting & Bookkeeping Services')]"));
		accounting.click();
		Thread.sleep(2000);
		
		WebElement buynow=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[8]/div[1]/button[2]"));
		buynow.click();
		Thread.sleep(15000);
		System.out.println("Should be able to navigate to \"Purchase Plan\" Subscription and Billing page");
		
		WebElement early=driver.findElement(By.xpath("//section[@id='Early']//div[@class='xui-padding-top xui-padding-left']"));
		early.click();
		Thread.sleep(3000);
		
		WebElement continuebutton=driver.findElement(By.xpath("//button[@id='continueButton']"));
		continuebutton.click();
		Thread.sleep(3000);
		
		WebElement street=driver.findElement(By.xpath("//input[@id='contactAddress']"));
		street.sendKeys("3450 granada ave");
		Thread.sleep(2000);
		
		WebElement city=driver.findElement(By.xpath("//input[@id='contactCity']"));
		city.sendKeys("santa clara");
		
		WebElement state=driver.findElement(By.xpath("//div[@id='postalAddress']//button[@class='xui-button xui-select--button xui-button-standard']"));
		Actions actstate=new Actions(driver);
		actstate.moveToElement(state).click().build().perform();
		Thread.sleep(3000);
		
		WebElement value=driver.findElement(By.xpath("//li[@id='California']//button[@class='xui-pickitem--body']"));
		value.click();
		
		WebElement zipcode=driver.findElement(By.xpath("//input[@id='contactPostalCode']"));
		zipcode.sendKeys("95051");;
		
		WebElement Continue=driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/button[1]"));
		Continue.click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		System.out.println("Billing address should be displayed as entered");
		
		WebElement creditcard=driver.findElement(By.xpath("//span[contains(text(),'Credit Card')]"));
		creditcard.click();
		Thread.sleep(3000);
		
		driver.switchTo().frame("__privateStripeFrame7");
		Thread.sleep(10000);
		WebElement cardnum=driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/section[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]"));
		cardnum.sendKeys("4465420599077708");
		Thread.sleep(5000);
		
		WebElement securitycode=driver.findElement(By.xpath("//div[@id='stripe-card-cvc']"));
		securitycode.sendKeys("678");
		Thread.sleep(3000);
		
		WebElement expiry=driver.findElement(By.xpath("//div[@id='stripe-card-expiry']"));
		expiry.sendKeys("0522");
		
		WebElement cardname=driver.findElement(By.xpath("//input[@id='stripe-cardholder-name']"));
		cardname.sendKeys("Gopala");
		
		WebElement continuepayment=driver.findElement(By.xpath("//button[@id='continueButton']"));
		continuepayment.click();
		Thread.sleep(5000);
		System.out.println("Should be able to see \"Ready to go\" success message");
	}
	
	public static void Add_Organization_Standardplan() throws InterruptedException {
		
		//Logint to Application and Operations till Buy now performed
		Add_Organization_PaidVersion();
		Thread.sleep(7000);
		
		/*WebElement premium=driver.findElement(By.xpath("//section[@id='Growing']//div[@class='xui-padding-left-large']"));
		premium.click();
		Thread.sleep(2000);*/
		
		WebElement continuebutton1=driver.findElement(By.xpath("//span[contains(text(),'Continue to Select Billing Account')]"));
		continuebutton1.click();
		Thread.sleep(3000);
		
		WebElement street1=driver.findElement(By.xpath("//input[@id='contactAddress']"));
		street1.sendKeys("3450 granada ave");
		Thread.sleep(2000);
		
		WebElement city1=driver.findElement(By.xpath("//input[@id='contactCity']"));
		city1.sendKeys("santa clara");
		
		WebElement state1=driver.findElement(By.xpath("//div[@id='postalAddress']//button[@class='xui-button xui-select--button xui-button-standard']"));
		Actions actstate1=new Actions(driver);
		actstate1.moveToElement(state1).click().build().perform();
		Thread.sleep(3000);
		
		WebElement value1=driver.findElement(By.xpath("//li[@id='California']//button[@class='xui-pickitem--body']"));
		value1.click();
		
		WebElement zipcode1=driver.findElement(By.xpath("//input[@id='contactPostalCode']"));
		zipcode1.sendKeys("95051");;
		
		WebElement Continue1=driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/button[1]"));
		Continue1.click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		System.out.println("Billing address should be displayed as entered");
		
		WebElement creditcard1=driver.findElement(By.xpath("//span[contains(text(),'Credit Card')]"));
		creditcard1.click();
		Thread.sleep(9000);
		
		driver.switchTo().frame("__privateStripeFrame7");
		WebElement cardnum1=driver.findElement(By.xpath("//div[@id='stripe-card-number']"));
		cardnum1.sendKeys("4465420599077708");
		Thread.sleep(5000);
		
		WebElement securitycode1=driver.findElement(By.xpath("//div[@id='stripe-card-cvc']"));
		securitycode1.sendKeys("678");
		Thread.sleep(3000);
		
		WebElement expiry1=driver.findElement(By.xpath("//div[@id='stripe-card-expiry']"));
		expiry1.sendKeys("0522");
		
		WebElement cardname1=driver.findElement(By.xpath("//input[@id='stripe-cardholder-name']"));
		cardname1.sendKeys("Gopala");
		
		WebElement continuepayment1=driver.findElement(By.xpath("//button[@id='continueButton']"));
		continuepayment1.click();
		Thread.sleep(5000);
		System.out.println("Should be able to see \"Ready to go\" success message");
	}
	
	public static void Add_Organization_Premiumplan() throws InterruptedException {
		
		//Logint to Application and Operations till Buy now performed
		Add_Organization_PaidVersion();
		Thread.sleep(7000);
		
		WebElement established=driver.findElement(By.xpath("//section[@id='Established']//div[@class='xui-padding-top xui-padding-left']"));
		established.click();
		Thread.sleep(3000);
		
		WebElement continuebutton2=driver.findElement(By.xpath("//span[contains(text(),'Continue to Select Billing Account')]"));
		continuebutton2.click();
		Thread.sleep(3000);
		
		WebElement street2=driver.findElement(By.xpath("//input[@id='contactAddress']"));
		street2.sendKeys("3450 granada ave");
		Thread.sleep(2000);
		
		WebElement city2=driver.findElement(By.xpath("//input[@id='contactCity']"));
		city2.sendKeys("santa clara");
		
		WebElement state2=driver.findElement(By.xpath("//div[@id='postalAddress']//button[@class='xui-button xui-select--button xui-button-standard']"));
		Actions actstate2=new Actions(driver);
		actstate2.moveToElement(state2).click().build().perform();
		Thread.sleep(3000);
		
		WebElement value2=driver.findElement(By.xpath("//li[@id='California']//button[@class='xui-pickitem--body']"));
		value2.click();
		
		WebElement zipcode2=driver.findElement(By.xpath("//input[@id='contactPostalCode']"));
		zipcode2.sendKeys("95051");;
		
		WebElement Continue2=driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/button[1]"));
		Continue2.click();
		Thread.sleep(5000);
		Thread.sleep(3000);
		System.out.println("Billing address should be displayed as entered");
		
		WebElement creditcard2=driver.findElement(By.xpath("//span[contains(text(),'Credit Card')]"));
		creditcard2.click();
		Thread.sleep(9000);
	}
	
	public static void Add_Organization_Current_Quickbooks() throws InterruptedException {
		
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
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement LoginTab7=driver.findElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"));
		LoginTab7.click();
		
		//Get Username
		WebElement useremail5=driver.findElement(By.xpath("//input[@id='email']"));
		useremail5.sendKeys("gopala.anumanchipalli@gmail.com");
		System.out.println("Enter username passed successfully");

		WebElement passWord5=driver.findElement(By.xpath("//input[@id='password']"));
		passWord5.sendKeys("password12");
		System.out.println("Password entered successfully");
		Thread.sleep(2000);
		
		WebElement loginButton5=driver.findElement(By.xpath("//button[@id='submitButton']"));
		loginButton5.click();
		System.out.println("Dashboard should be displayed");
		
		WebElement self2=driver.findElement(By.xpath("//span[@class='xrh-appbutton--text']"));
		Actions actcompany2=new Actions(driver);
		actcompany2.moveToElement(self2).click().build().perform();
		Thread.sleep(3000);
		WebElement myzero2=driver.findElement(By.xpath("//a[contains(text(),'My Xero')]"));
		myzero2.click();
		Thread.sleep(7000);
		
		String primaryWindow2=driver.getWindowHandle();
		System.out.println("Primary Window: "+primaryWindow2);
		for(String handle:driver.getWindowHandles()){
			System.out.println("No of Handles: "+handle);
			driver.switchTo().window(handle);
		}
		
		WebElement addorg1=driver.findElement(By.id("ext-gen1043"));
		addorg1.click();
		
		WebElement name1=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		name1.sendKeys("self");
		Thread.sleep(3000);
		
		WebElement paytax1=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/div[1]"));
		Actions actpay1=new Actions(driver);
		actpay1.moveToElement(paytax1).click().build().perform();
		Thread.sleep(3000);
		
		WebElement paytaxname1=driver.findElement(By.xpath("//li[@id='CNTRY/US']"));
		paytaxname1.click();
		Thread.sleep(7000);
		
		WebElement timezone1=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/div[1]"));
		Actions acttime1=new Actions(driver);
		acttime1.moveToElement(timezone1).click().build().perform();
		Thread.sleep(5000);
		
		WebElement pst1=driver.findElement(By.xpath("//span[contains(text(),'(UTC-08:00) Pacific Time (US & Canada)')]"));
		pst1.click();
		Thread.sleep(5000);
		Thread.sleep(2000);
		
		WebElement orgdoes1=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]"));
		orgdoes1.sendKeys("acc");
		Thread.sleep(3000);
		
		WebElement accounting1=driver.findElement(By.xpath("//span[contains(text(),'ounting & Bookkeeping Services')]"));
		accounting1.click();
		Thread.sleep(2000);
		
		WebElement dropCheck=driver.findElement(By.xpath("//button[@class='xui-button xui-button-icon xui-button-icon-medium']"));
		Actions actcheck=new Actions(driver);
		actcheck.moveToElement(dropCheck).click().build().perform();
		Thread.sleep(3000);
		
		WebElement check=driver.findElement(By.xpath("//div[@class='xui-styledcheckboxradio--checkbox xui-styledcheckboxradio--checkbox-small']"));
		check.click();
		
		WebElement continuecheck=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[8]/div[1]/button[2]"));
		continuecheck.click();
		Thread.sleep(3000);
		System.out.println("Should be able to see Quick books file conversion");
	}
	
	public static void Look_Subscription_Billing() throws InterruptedException {
		LoginToXero();
		
		WebElement usermenu=driver.findElement(By.xpath("//img[@class='xrh-avatar']"));
		Actions actaccount=new Actions(driver);
		actaccount.moveToElement(usermenu).click().build().perform();
		
		WebElement account=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/ol[2]/li[5]/div[1]/div[2]/div[1]/ol[1]/li[3]/a[1]"));
		account.click();
	}
}
