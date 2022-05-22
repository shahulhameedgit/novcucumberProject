package org.swiggy.baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Seleniumday1 {

	protected static WebDriver driver = null;

	public static void browserlaunch(String key) {
		switch (key) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "./Jar/geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("the give key is not presentin the case");
			break;
		}

//		System.setProperty("webdriver.gecko.driver", "./Jar/geckodriver.exe");
//		WebDriver driver=new FirefoxDriver();

//		System.setProperty("webdriver.chrome.driver", "./Jar/chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		
		// driver.manage().window().setSize(new Dimension(600,530));

	}

	public static void browserMaximize() {
		driver.manage().window().maximize();
	}

	public void fullScreenView() {
		driver.manage().window().fullscreen();
	}

	public static void loadUrl(String url) {
		driver.get(url);
	}

	public void loadDifferentUrl(String tourl) {
		driver.navigate().to(tourl);
	}

	public static WebElement elementFinder(By locator) {
		return driver.findElement(locator);
//		WebElement findElement = driver.findElement(locator);
//		return findElement;

	}
	
	public static By locatorFinderById(String data) {
		return By.id(data);
	}
	
	
	public static By locatorfinderByXpath(String data) {
//		By xpath = By.xpath(data);
//		return xpath;
		
		return By.xpath(data);
		
	}
	
	

	public WebElement elementfinderById(String locator) {
		return driver.findElement(By.id(locator));
	}

	public WebElement ElementFinderByxPath(String locator) {
		
		return driver.findElement(By.xpath(locator));
	}
	
	public static By locaterfindByname(String data) {
		return By.name(data);
	}
	
	public static void type(WebElement element, String data) {
		element.sendKeys(data);
	}
	
	
	public static void elementClick(WebElement element) {
		element.click();
	}
	
//	public static void main(String[] args) {
//		browserlaunch("chrome");
//		browserMaximize();
//		loadUrl("https://www.facebook.com/");
//		
//		//advicable methods use
//		type(elementFinder(locatorFinderById("email")),"shahul");
//		type(elementFinder(locatorFinderById("pass")),"hameed");
//		elementClick(elementFinder(locaterfindByname("login")));
//		
//		// non preferable
//		WebElement username = elementFinder(By.id("email"));
//		type(username, "shahul");
//		WebElement password = elementFinder(By.id("pass"));
//		type(password, "hameed");
//		WebElement login = elementFinder(By.name("login"));
//		elementClick(login);
//		
//		
//		
//		elementFinder(locatorFinderById("email"));
//		elementFinder(By.name("pass"));
//		elementFinder(locatorfinderByXpath("//button[@name='login']"));
//		elementFinder(By.xpath("//button[@name='login']"));
//		
//		type(elementFinder(locatorFinderById("email")),"hameed");
//	
//	}

}
